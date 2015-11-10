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
    private int level = 1;
    private boolean dead = true;
    private boolean canISteal = true;
    
    private Player enemy;
    private ArrayList<Treasure> hiddenTreasures;
    private ArrayList<Treasure> visibleTreasures;
    private BadConsequence pendingBadConsequence;
    
    public Player(String name){
        this.name = name;
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
    private void incrementLevels(int i){
        level = level + 1;
        if (level>MAXLEVEL)
            level = MAXLEVEL;
    }
    private void decrementLevels(int i){
        level = level - 1;
        if (level < 1)
            level = 1;
        
    }
    private void setPendingBadConsequence(BadConsequence b){
        this.pendingBadConsequence = b;
    }
    private void applyPrize(Monster m){
        
    }
    private void applyBadConsequence(Monster m){
        
    }
    private boolean canMakeTreasureVisible(Treasure t){
        return false;
        
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
        return null;
        
    }
    public void makeTreasureVisible(Treasure t){
        
    }
    public void discardVisibleTrasure(Treasure t){
        
    }
    public void discardHiddenTreasure(Treasure t){
        
    }
    public boolean validState(){
        if (pendingBadConsequence.isEmpty() && hiddenTreasures.size() <= 4)
            return true;
        else
            return false;
    }
    public void initTreasures(){
        
    }
    public int getLevels(){
        return level;
    }
    public Treasure stealITreasure(){
        return null;
        
    }
    public void setEnemy(Player enemy){
        this.enemy=enemy;
    }
    private Treasure giveMeATreasure(){
        return null;
        
    }
    public boolean canISteal(){
        return canISteal;
    }
    private boolean canYouGiveMeATreasure(){
        boolean tesoros;
        if (hiddenTreasures.size() != 0)
            tesoros = true;
        else
            tesoros = false;
        return tesoros;
    }
    private void haveStolen(){
        canISteal = false;
    }
    public void discardAllTreasures(){
        
    }
}
