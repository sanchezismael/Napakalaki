package napakalaki;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ismael y Juan
 */
public class Napakalaki {
    private static final Napakalaki instance = new Napakalaki();
    private Napakalaki(){
        
    }
    private Monster currentMonster;
    private CardDealer dealer;
    private Player players;
    private Player currentPlayer;
    
    private void initPlayers(ArrayList<String> names){
        
    }
    
    Player nextPlayer(){
        
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
    
    }
    
    public Monster getCurrentMonster(){
        
    }
    
    public boolean nextTurn(){
        
    }
    
    public boolean endOfGame(CombatResult result){
        
    }
    
    
}
