/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;

/**
 *
 * @author Ismael
 */
public class BadConsequence {
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
    
    BadConsequence(String text, int levels, ArrayList<TreasureKind> tVisible,
            ArrayList<TreasureKind> tHidden){
        this.text = text;
        this.levels = levels;
        this.specificHiddenTreasures = tHidden;
        this.specificVisibleTreasures = tVisible;
        this.death = death;
        this.nVisibleTreasures = 0;
        this.nHiddenTreasures = 0;
    }
    
    String getText(){
        return text;
    }
    int getLevels(){
        return levels;
    }
    int getnHidden(){
        return nHiddenTreasures;
    }
    int getnVisibleTreasures(){
        return nVisibleTreasures;
    }
    
    boolean getDeath(){
        return death;
    }
    
    ArrayList getSpecificHiddentreasures(){
        return specificHiddenTreasures;
    }
    
    ArrayList getSpecificVisibletreasures(){
        return specificVisibleTreasures;
    }
    
    public String toString(){
        return "Text= "+text+" Levels= "+Integer.toString(levels)+" nHiddenTreasures= "+
                Integer.toString(nHiddenTreasures)+" nVisibleTreasures= "+
                Integer.toString(nVisibleTreasures)+" Death= "+ Boolean.toString(death)+
                "specificVisibleTreasures= "+specificVisibleTreasures+" specificsHiddenTreasures= "
                +specificHiddenTreasures;
    }
}
