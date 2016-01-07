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
    private boolean death;
    
    public NumericBC(String name, int l,int nV, int nH){
        super(name,l);
        nVisibleTreasures = nV;
        nHiddenTreasures = nH;
        death = false;
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
        NumericBC bc = new NumericBC("",0,0,0);
        
        if(nVisibleTreasures > v.size()){
            bc.nVisibleTreasures = v.size();
        }
        else{
            bc.nVisibleTreasures = nVisibleTreasures;
        }
        
        if(nHiddenTreasures > h.size()){
            bc.nHiddenTreasures = h.size();
        }
        else{
            bc.nHiddenTreasures = nHiddenTreasures;
        }
        
        return bc;
        
    }
    
    public String toString(){
        return super.toString()+" |nHiddenTreasures= "+Integer.toString(nHiddenTreasures)+" |nVisibleTreasures= "+
                Integer.toString(nVisibleTreasures)+" |Death= "+ Boolean.toString(death);
    }
// adjustToFitTreasureList 

}
