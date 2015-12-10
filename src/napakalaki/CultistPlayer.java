/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;

/**
 *
 * @author jmfajardo
 */
public class CultistPlayer extends Player{
    
    private static int totalCultistPlayers = 0;
    private Cultist myCultistCard;
    
    public CultistPlayer (Player p, Cultist c){
        super(p);
        myCultistCard = c;
        totalCultistPlayers++;
    }
    
    protected int getCombatLevel(){
        int lvl = super.getCombatLevel();
        lvl = lvl + lvl*0.2;
        lvl = lvl + myCultistCard.getGainedLevels();
        lvl = lvl + lvl*totalCultistPlayers;
        
        return lvl;
    }
    
    @Override
    protected int getOponentLevel(Monster m){
        return m.getCombatLevelAgainstCultistPlayer();
    }
    
    @Override
    protected boolean shouldConvert(){
        
    }
    
    @Override
    private Treasure giveMeATreasure(){
        int ind = (int)(Math.random()*visibleTreasures.size());
        return visibleTreasures.get(ind);
    }
    
    // Qué devuelve?
    private boolean canYouGiveMeATreasure(){
        return !visibleTreasures.isEmpty();
    }
    
    static int getTotalCultisPlayers(){
        return totalCultistPlayers;
    }
    
}
