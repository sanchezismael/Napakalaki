/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

/**
 *
 * @author Ismael y Juan
 */
public class specificBC extends BadConsequence{
    
    
    
    public void substractVisibleTreasure(Treasure t){
        return levels == 0 && nVisibleTreasures == 0 && nHiddenTreasures == 0
                && death == false && specificHiddenTreasures.isEmpty()
                && specificVisibleTreasures.isEmpty();
    }
}
