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
public class Prize {
    private int treasures;
    private int level;
    Prize(int treasures, int level){
        this.treasures = treasures;
        this.level = level;
    }
    int getTreasures(){
        return treasures;
    }
    int getLevel(){
        return level;
    }

    public String toString(){
        return "Treasures= "+ Integer.toString(treasures) + " levels= "
                +Integer.toString(level);
    }
}
    
