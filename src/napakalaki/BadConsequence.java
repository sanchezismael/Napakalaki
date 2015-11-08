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

public class BadConsequence {
    static final int MAXTREASURES = 10;
    private String text;
    private int levels;
    private int nVisibleTreasures;
    private int nHiddenTreasures;
    private boolean death;
    private ArrayList<TreasureKind> specificHiddenTreasures ;
    private ArrayList<TreasureKind> specificVisibleTreasures;
    
    public BadConsequence(String text,int levels,int nVisible,int nHidden){
        this.text = text;
        this.levels = levels;
        death = false;
        nVisibleTreasures = nVisible;
        nHiddenTreasures = nHidden;
        specificHiddenTreasures = new ArrayList();
        specificVisibleTreasures = new ArrayList();
    }
    
    public BadConsequence(String text,boolean death){
        this.text = text;
        this.death = death;
        this.levels = 0;
        this.nVisibleTreasures = 0;
        this.nHiddenTreasures = 0;
        specificHiddenTreasures = new ArrayList();
        specificVisibleTreasures = new ArrayList();
        
    }
    
    public BadConsequence(String text, int levels, ArrayList<TreasureKind> tVisible,
            ArrayList<TreasureKind> tHidden){
        this.text = text;
        this.levels = levels;
        this.specificHiddenTreasures = tHidden;
        this.specificVisibleTreasures = tVisible;
        this.death = false;
        this.nVisibleTreasures = 0;
        this.nHiddenTreasures = 0;
    }
    
    public boolean isEmpty(){
        return levels == 0 && nVisibleTreasures == 0 && nHiddenTreasures == 0
                && death == false && specificHiddenTreasures.isEmpty()
                && specificVisibleTreasures.isEmpty();
    }
    
    public int getLevels(){
        return levels;
    }
    
    public int getNVisibleTreasures(){
        return nVisibleTreasures;
    }
    
    public int getNHiddenTreasures(){
        return nHiddenTreasures;
    }
    
    public void substractVisibleTreasure(TreasureKind t){
        
    }
    
    public void substractHiddenTreasure(TreasureKind t){
        
    }
    
    public String getText(){
        return text;
    }
    
    public boolean getDeath(){
        return death;
    }
    
    public ArrayList<TreasureKind> getSpecificHiddentreasures(){
        return specificHiddenTreasures;
    }
    
    public ArrayList<TreasureKind> getSpecificVisibletreasures(){
        return specificVisibleTreasures;
    }
    
    public BadConsequence adjustToFitTreasureLists(ArrayList<TreasureKind> v, ArrayList<TreasureKind> h){
        
    }
    
    public String toString(){
        return "Text= "+text+" Levels= "+Integer.toString(levels)+" nHiddenTreasures= "+
                Integer.toString(nHiddenTreasures)+" nVisibleTreasures= "+
                Integer.toString(nVisibleTreasures)+" Death= "+ Boolean.toString(death)+
                "specificVisibleTreasures= "+specificVisibleTreasures+" specificsHiddenTreasures= "
                +specificHiddenTreasures;
    }
}
