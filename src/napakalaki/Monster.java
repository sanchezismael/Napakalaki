/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

/**
 *
 * @author Ismael Sánchez y Juan Manuel Fajardo
 * 
 */

public class Monster {
    private String name;
    private int combatLevel;
    private Prize unPrize;
    private BadConsequence unBad;
    private int levelChangeAgainstCultistPlayer;
    
    public Monster(String n, int l,BadConsequence b,Prize p){
        name = n;
        combatLevel = l;
        unPrize = p;
        unBad = b;
        levelChangeAgainstCultistPlayer = 0;
    }
    
    public Monster(String n, int l,BadConsequence b,Prize p, int IC){
        name = n;
        combatLevel = l;
        unPrize = p;
        unBad = b;
        levelChangeAgainstCultistPlayer = IC;
    }
    
    public String getName(){
       return name;
    }
    public int getCombatLevel(){
        return combatLevel;
    }
    
    public int getCombatLevelAgainstCultistPlayer(){
        return combatLevel+levelChangeAgainstCultistPlayer;
    }
    
//    public Prize getPrize(){          //este método no viene en el diagrama de clases
//        return unPrize;
//    }
    
    public BadConsequence getBadConsequence(){
        return unBad;
    }
    
    public int getLevelsGained(){
        return unPrize.getLevel();
    }
    
    public int getTreasuresGained(){
        return unPrize.getTreasures();
    }
    
    public String toString(){
        return "Name= "+name+", CombatLevel= "+Integer.toString(combatLevel)+
                ", Prize= "+unPrize.toString()+", BadConsequence= "+
                unBad.toString();
    }
}
