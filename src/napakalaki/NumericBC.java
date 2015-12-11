/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;

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
    
    public BadConsequence adjustToFitTreasureLists(ArrayList<Treasure> v, ArrayList<Treasure> h){
        boolean esta = false;
        BadConsequence bc = new BadConsequence("",false);
        if(nVisibleTreasures > 0){
            if(nVisibleTreasures > v.size()){
                bc.nVisibleTreasures = v.size();
            }
            else{
                bc.nVisibleTreasures = nVisibleTreasures;
            }
        }
        else{
            for (TreasureKind specificVisibleTreasure : specificVisibleTreasures) {
                esta = false;
                for(Treasure treasure : v){
                    if(treasure.getType() == specificVisibleTreasure)
                        esta = true;
                }
                if(esta)
                    bc.specificVisibleTreasures.add(specificVisibleTreasure);
                                 
            }
        }
        if(nHiddenTreasures > 0){
            if(nHiddenTreasures > h.size()){
                bc.nHiddenTreasures = h.size();
            }
            else{
                bc.nHiddenTreasures = nHiddenTreasures;
            }
        }
        else{
           for (TreasureKind specificHiddenTreasure : specificHiddenTreasures) {
               esta = false;
                for(Treasure treasure : h){
                    if(treasure.getType() == specificHiddenTreasure)
                        esta = true;
                }                 
                if(esta)
                    bc.specificHiddenTreasures.add(specificHiddenTreasure);
            }
        }
        
        return bc;
        
    }
// adjustToFitTreasureList 

}
