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
public class Dice {
    private static final Dice instance = new Dice();
    private Dice(){
        
    }
    
    public final Dice getInstance(){
       return null;
    }
    
    public int nextNumber(){
        return (int)(Math.random()*6 + 1);
    }
    
    
}
    