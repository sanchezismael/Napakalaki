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
public class SpecificBC extends BadConsequence{
    private ArrayList<TreasureKind> specificHiddenTreasures ;
    private ArrayList<TreasureKind> specificVisibleTreasures;
    
    public SpecificBC(String name, int l,ArrayList<TreasureKind> v,ArrayList<TreasureKind> h){
        super(name,l);
        specificHiddenTreasures = h;
        specificVisibleTreasures = v;
    }
    public ArrayList<TreasureKind> getSpecificHiddentreasures(){
        return specificHiddenTreasures;
    }
    
    public ArrayList<TreasureKind> getSpecificVisibletreasures(){
        return specificVisibleTreasures;
    }
    
    
    @Override
    public void substractVisibleTreasure(Treasure t){
        boolean esta = false;
        int ind;
        for(ind = 0; ind < specificVisibleTreasures.size() && !esta; ind++){
            if(t.getType() == specificVisibleTreasures.get(ind))
                esta = true;
        }
        if(esta)
           specificVisibleTreasures.remove(ind-1);

    }
    
    @Override
    public void substractHiddenTreasure(Treasure t){
            boolean esta = false;
            int ind =0;
            for(ind = 0; ind < specificHiddenTreasures.size(); ind++){
                if(t.getType() == specificHiddenTreasures.get(ind))
                    esta = true;
            }
            if(esta)
               specificHiddenTreasures.remove(ind-1);
    }


    @Override
    public boolean isEmpty(){
        return specificHiddenTreasures.isEmpty() && specificVisibleTreasures.isEmpty();
    }
    
    @Override
    public BadConsequence adjustToFitTreasureLists(ArrayList<Treasure> v, ArrayList<Treasure> h){
        boolean esta = false;
        SpecificBC bc = new SpecificBC("",0,new ArrayList(), new ArrayList());
        
        for (TreasureKind specificVisibleTreasure : specificVisibleTreasures) {
            esta = false;
            for(Treasure treasure : v){
                if(treasure.getType() == specificVisibleTreasure)
                    esta = true;
            }
            if(esta)
                bc.specificVisibleTreasures.add(specificVisibleTreasure);

        }

       for (TreasureKind specificHiddenTreasure : specificHiddenTreasures) {
           esta = false;
            for(Treasure treasure : h){
                if(treasure.getType() == specificHiddenTreasure)
                    esta = true;
            }                 
            if(esta)
                bc.specificHiddenTreasures.add(specificHiddenTreasure);
        }
        
        
        return bc;
        
    }
    @Override
    public String toString(){
        return super.toString()+" |specificVisibleTreasures= "+specificVisibleTreasures+" |specificsHiddenTreasures= "
                +specificHiddenTreasures;
    }
}