/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;


import java.util.ArrayList;

/**
 *
 * @author Ismael Sánchez y Juan Manuel Fajardo
 * 
 */

public abstract class BadConsequence {
    static final int MAXTREASURES = 10;
    private String text;
    private int levels;
//    private int nVisibleTreasures;
//    private int nHiddenTreasures;
//    private boolean death;
//    private ArrayList<TreasureKind> specificHiddenTreasures ;
//    private ArrayList<TreasureKind> specificVisibleTreasures;
    
//    public BadConsequence(String text,int levels,int nVisible,int nHidden){
//        this.text = text;
//        this.levels = levels;
//        death = false;
//        nVisibleTreasures = nVisible;
//        nHiddenTreasures = nHidden;
//        specificHiddenTreasures = new ArrayList();
//        specificVisibleTreasures = new ArrayList();
//    }
//    
//    public BadConsequence(String text,boolean death){
//        this.text = text;
//        this.death = death;
//        this.levels = 0;
//        this.nVisibleTreasures = 0;
//        this.nHiddenTreasures = 0;
//        specificHiddenTreasures = new ArrayList();
//        specificVisibleTreasures = new ArrayList();
//        
//    }
//    
//    public BadConsequence(String text, int levels, ArrayList<TreasureKind> tVisible,
//            ArrayList<TreasureKind> tHidden){
//        this.text = text;
//        this.levels = levels;
//        this.specificHiddenTreasures = tHidden;
//        this.specificVisibleTreasures = tVisible;
//        this.death = false;
//        this.nVisibleTreasures = 0;
//        this.nHiddenTreasures = 0;
//    }
    
    public abstract boolean isEmpty();
    
    public int getLevels(){
        return levels;
    }
    
    
    
    
    public abstract void substractVisibleTreasure(Treasure t);
//        if(specificVisibleTreasures.size() != 0){
//            boolean esta = false;
//            int ind;
//            for(ind = 0; ind < specificVisibleTreasures.size() && !esta; ind++){
//                if(t.getType() == specificVisibleTreasures.get(ind))
//                    esta = true;
//            }
//            if(esta)
//               specificVisibleTreasures.remove(ind-1);
//        }
//        else if (nVisibleTreasures > 0)
//            nVisibleTreasures -= 1;
//    }
    
    public abstract void substractHiddenTreasure(Treasure t);
//        if(specificHiddenTreasures.size() != 0){
//            boolean esta = false;
//            int ind;
//            for(ind = 0; ind < specificHiddenTreasures.size(); ind++){
//                if(t.getType() == specificHiddenTreasures.get(ind))
//                    esta = true;
//            }
//            if(esta)
//               specificHiddenTreasures.remove(ind-1);
//        }
//        else if (nHiddenTreasures > 0)
//            nHiddenTreasures -= 1;
//    }
    
    public String getText(){
        return text;
    }
    
//    public boolean getDeath(){
//        return death;
//    }
    
    
    
    
    
    public abstract BadConsequence adjustToFitTreasureLists(ArrayList<Treasure> v, ArrayList<Treasure> h);
//        boolean esta = false;
//        BadConsequence bc = new BadConsequence("",false);
//        if(nVisibleTreasures > 0){
//            if(nVisibleTreasures > v.size()){
//                bc.nVisibleTreasures = v.size();
//            }
//            else{
//                bc.nVisibleTreasures = nVisibleTreasures;
//            }
//        }
//        else{
//            for (TreasureKind specificVisibleTreasure : specificVisibleTreasures) {
//                esta = false;
//                for(Treasure treasure : v){
//                    if(treasure.getType() == specificVisibleTreasure)
//                        esta = true;
//                }
//                if(esta)
//                    bc.specificVisibleTreasures.add(specificVisibleTreasure);
//                                 
//            }
//        }
//        if(nHiddenTreasures > 0){
//            if(nHiddenTreasures > h.size()){
//                bc.nHiddenTreasures = h.size();
//            }
//            else{
//                bc.nHiddenTreasures = nHiddenTreasures;
//            }
//        }
//        else{
//           for (TreasureKind specificHiddenTreasure : specificHiddenTreasures) {
//               esta = false;
//                for(Treasure treasure : h){
//                    if(treasure.getType() == specificHiddenTreasure)
//                        esta = true;
//                }                 
//                if(esta)
//                    bc.specificHiddenTreasures.add(specificHiddenTreasure);
//            }
//        }
//        
//        return bc;
//        
//    }
    
    public String toString(){
        return "Text= "+text+" |Levels= "+Integer.toString(levels);
    }
}
