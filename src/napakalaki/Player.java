/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;

/**
 *
 * @author jmfajardo
 */
public class Player{
    static final int MAXLEVEL = 10;
    private String name;
    private int level;
    private boolean dead;
    private boolean canISteal;   
    private Player enemy;
    private ArrayList<Treasure> hiddenTreasures;
    private ArrayList<Treasure> visibleTreasures;
    private BadConsequence pendingBadConsequence;
    
    public Player(String name){
        this.name = name;
        level = 1;
        dead = true;
        canISteal = true;
        enemy = null;
        hiddenTreasures = new ArrayList();
        visibleTreasures = new ArrayList();
        pendingBadConsequence = null;
    }
    
    public String getName(){
        return name;
    }
    
    private void bringToLife(){
        dead = false;
    }
    
    private int getCombatLevel(){
        int bonus = 0;
        
        for (Treasure visibleTreasure : visibleTreasures) {
            bonus = bonus + visibleTreasure.getBonus();
        }
        
        return level+bonus;
    }
    
    private void incrementLevels(int l){
        level = level + l;
        if (level>MAXLEVEL)
            level = MAXLEVEL;
    }
    
    private void decrementLevels(int l){
        level = level - l;
        if (level < l)
            level = l;
        
    }
    
    private void setPendingBadConsequence(BadConsequence b){
        this.pendingBadConsequence = b;
    }
    
    private void applyPrize(Monster m){
        int nLevels = m.getLevelsGained();
        incrementLevels(nLevels);
        int nTreasures = m.getTreasuresGained();
        if(nTreasures > 0){
            CardDealer dealer = CardDealer.getInstance();
            Treasure treasure;
            for(int i= 0; i < nTreasures; i++){
                treasure = dealer.nextTreasure();
                hiddenTreasures.add(treasure);
            }
        }
    }
    
    private void applyBadConsequence(Monster m){
        BadConsequence badConsequence = m.getBadConsequence();
        int nLevels = badConsequence.getLevels();
        decrementLevels(nLevels);
        BadConsequence pendingBad = badConsequence.adjustToFitTreasureLists(visibleTreasures, hiddenTreasures);
        setPendingBadConsequence(pendingBad);
    }
    
    private boolean canMakeTreasureVisible(Treasure t){                
        if(t.getType() == TreasureKind.ONEHAND){
            int contMan = 0;
            for(Treasure v : visibleTreasures){
                if(v.getType() == TreasureKind.BOTHHANDS){
                    contMan = 2;
                    return false;
                }
                else if(v.getType() == TreasureKind.ONEHAND){
                    contMan++;
                }
            }
            return contMan < 2;
        }
        else if(t.getType() == TreasureKind.BOTHHANDS){
            for(Treasure v : visibleTreasures){
                if(v.getType() == TreasureKind.BOTHHANDS || v.getType() == TreasureKind.ONEHAND){
                    return false;
                }
            }
            return true;
        }
        else{        
            for(Treasure v : visibleTreasures){
                    if(v.getType() == t.getType()){
                        return false;
                    }
            }
            return true;
        }
    }
    
    private int howManyVisibleTreasures(TreasureKind tKind){
        int contador = 0;
        for (Treasure visibleTreasure : visibleTreasures) {
            if (visibleTreasure.getType() == tKind) {
                contador++;
            }
        }
        return contador;
    }
    
    private void dielfNoTreasures(){
        if (visibleTreasures.isEmpty() && hiddenTreasures.isEmpty())
            dead = true;
    }
    
    public boolean isDead(){
        return dead;
    }
    
    public ArrayList<Treasure> getHiddenTreasures(){
        return null;
        
    }
    
    public ArrayList<Treasure> getVisibleTreasures(){
        return null;
        
    }
    
    public CombatResult combat(Monster m){
        int myLevel = getCombatLevel();
        int monsterLevel = m.getCombatLevel();
        CombatResult combatResult;
        
        if (myLevel > monsterLevel){
            applyPrize(m);
            if (this.level >= MAXLEVEL)
                combatResult = CombatResult.WINGAME;
            else
                combatResult = CombatResult.WIN;
        } else {
            applyBadConsequence(m);
            combatResult = CombatResult.LOSE;
        }
      
        return combatResult;
    }
    
    public void makeTreasureVisible(Treasure t){
        boolean canI = canMakeTreasureVisible(t);
        
        if (canI){
            visibleTreasures.add(t);
            hiddenTreasures.remove(t);
        }
    }
    
    public void discardVisibleTrasure(Treasure t){
        visibleTreasures.remove(t);
        
        if (pendingBadConsequence != null && !pendingBadConsequence.isEmpty())
            pendingBadConsequence.substractVisibleTreasure(t);
        
        dielfNoTreasures();
    }
    
    public void discardHiddenTreasure(Treasure t){
        hiddenTreasures.remove(t);
        
        if (pendingBadConsequence != null && !pendingBadConsequence.isEmpty())
            pendingBadConsequence.substractHiddenTreasure(t);
        
        dielfNoTreasures();
    }
    
    public boolean validState(){
        if (pendingBadConsequence.isEmpty() && hiddenTreasures.size() <= 4)
            return true;
        else
            return false;
    }
    
    public void initTreasures(){
        CardDealer dealer = CardDealer.getInstance();
        Dice dice = Dice.getInstance();
        bringToLife();
        Treasure treasure = dealer.nextTreasure();
        hiddenTreasures.add(treasure);
        int number = dice.nextNumber();
        if(number > 1){
            treasure = dealer.nextTreasure();
            hiddenTreasures.add(treasure);
        }
        if(number == 6){
            treasure = dealer.nextTreasure();
            hiddenTreasures.add(treasure);
        }
        
    }
    
    public int getLevels(){
        return level;
    }
    
    public Treasure stealITreasure(){
        boolean canI = canISteal();
        if(canI){
            boolean canYou =  enemy.canYouGiveMeATreasure();
            if(canYou){
                Treasure treasure = enemy.giveMeATreasure();
                hiddenTreasures.add(treasure);
                haveStolen();
                return treasure;
            }  
        }     
        return null;   
    }
    
    public void setEnemy(Player enemy){
        this.enemy=enemy;
    }
    
    private Treasure giveMeATreasure(){
        int ind = (int)(Math.random()*hiddenTreasures.size());
        return hiddenTreasures.get(ind);
    }
    public boolean canISteal(){
        return canISteal;
    }
    private boolean canYouGiveMeATreasure(){
        return !hiddenTreasures.isEmpty();
    }
    private void haveStolen(){
        canISteal = false;
    }
    public void discardAllTreasures(){
        ArrayList<Treasure> cvisibleTreasures = visibleTreasures;
        for (Treasure treasure : cvisibleTreasures) {
            discardVisibleTrasure(treasure);
        }
        ArrayList<Treasure> chiddenTreasures = hiddenTreasures;
        for(Treasure treasure : chiddenTreasures){
            discardHiddenTreasure(treasure);
        }
    }
}
