/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

/**
 *
 * @author Ismael
 */
public class Monster {
    private String name;
    private int combatLevel;
    private Prize unPrize;
    private BadConsequence unBad;
    
    Monster(String name, int level,BadConsequence bc,Prize price){
        this.name = name;
        this.combatLevel = level;
        this.unPrize = price;
        this.unBad = bc;
    }
    
    String getName(){
       return name;
    }
    int getCombatLevel(){
        return combatLevel;
    }
    
    public String toString(){
        return "Name= "+name+" CombatLevel= "+Integer.toString(combatLevel)+
                " Prize= "+unPrize.toString()+" BadConsequence= "+
                unBad.toString();
    }
}
