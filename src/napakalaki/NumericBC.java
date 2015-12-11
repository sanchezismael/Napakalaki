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
public class NumericBC extends BadConsequence{
    
    private int nVisibleTreasures;
    private int nHiddenTreasures;
    
    public NumericBC(int nV, int nH){
        nVisibleTreasures = nV;
        nHiddenTreasures = nH;
    }
    
    @Override
    public boolean isEmpty(){        
        return  nVisibleTreasures == 0 && nHiddenTreasures == 0;
    }
    
    public int getNVisibleTreasures(){
        return nVisibleTreasures;
    }
    
    public int getNHiddenTreasures(){
        return nHiddenTreasures;
    }
    
    public void substractVisibleTreasure(Treasure t){
        if (nVisibleTreasures > 0)
            nVisibleTreasures -= 1;
    }
    
    public void substractHiddenTreasure(Treasure t){
        if (nHiddenTreasures > 0)
            nHiddenTreasures -= 1;
    }
// substractVisibleTreasure
// substractHiddenTreasure 
// adjustToFitTreasureList 

}
