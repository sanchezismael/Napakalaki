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
    
    public Monster(String name, int level,BadConsequence bc,Prize price){
        this.name = name;
        this.combatLevel = level;
        this.unPrize = price;
        this.unBad = bc;
    }
    
    public String getName(){
       return name;
    }
    public int getCombatLevel(){
        return combatLevel;
    }
    
//    public Prize getPrize(){          //este método no viene en el diagrama de clases
//        return unPrize;
//    }
    
    public BadConsequence getBadConsequence(){
        return unBad;
    }
    
    public int LevelsGained(){
        
    }
    
    public int getTreasuresGained(){
        
    }
    
    public String toString(){
        return "Name= "+name+", CombatLevel= "+Integer.toString(combatLevel)+
                ", Prize= "+unPrize.toString()+", BadConsequence= "+
                unBad.toString();
    }
}
