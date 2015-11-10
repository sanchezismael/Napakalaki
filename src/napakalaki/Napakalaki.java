package napakalaki;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ismael Sánchez y Juan Manuel Fajardo
 */
public class Napakalaki {
    private static final Napakalaki instance = new Napakalaki();
    
    private Monster currentMonster;
    private CardDealer dealer;
    private Player players;
    private Player currentPlayer;
    
    private Napakalaki(){
        currentMonster = null;
        dealer = null;
        players = null;
        currentPlayer = null;
    }
    
    private void initPlayers(ArrayList<String> names){
        
    }
    
    Player nextPlayer(){
        return null;
        
    }
    
    private boolean nextTurnAllowed(){
        return true;
    }
    
    private void setEnemies(){
        
    }
    
    public static Napakalaki getInstance(){
        return instance;
    }
    
    public CombatResult developCombat(){
        return null;
        
    }
    
    public void discardVisibleTreasures(ArrayList<TreasureKind> treasures){
        
    }
    
    public void discardHiddenTreasures(ArrayList<TreasureKind> treasures){
        
    }
    
    public void makeTreasuresVisible(ArrayList<TreasureKind> treasures){
        
    }
    
    public void initGame(ArrayList<String> players){
        
    }
    
    public Player getCurrentPlayer(){
        return null;
    
    }
    
    public Monster getCurrentMonster(){
        return null;
        
    }
    
    public boolean nextTurn(){
        return false;
        
    }
    
    public boolean endOfGame(CombatResult result){
        return false;
        
    }
    
    
}
