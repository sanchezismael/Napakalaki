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
    private ArrayList<Player> players;
    private Player currentPlayer;
    
    private Napakalaki(){
        currentMonster = null;
        dealer = null;
        players = new ArrayList();
        currentPlayer = null;
    }
    
    private void initPlayers(ArrayList<String> names){
        for(String name: names){
            players.add(new Player(name));
        }
    }
    
    Player nextPlayer(){
        int ind = 0;
        if(currentPlayer == null)
            ind = (int)(Math.random()*players.size());
        else{
            for(int x = 0; x<players.size(); x++){
                if(players.get(x).getName() == currentPlayer.getName()){
                    if(x < (players.size()-1))
                        ind = x+1;
                }
            }
        }
        return players.get(ind);
        
    }
    //
    private boolean nextTurnAllowed(){
        return currentPlayer.validState();
    }
    
    private void setEnemies(){
        int ind = (int)(Math.random()*players.size());
        for(int i = 0; i < players.size(); i++){
            while(ind == i)
                ind = (int)(Math.random()*players.size());
            players.set(i, players.get(ind));
        }
    }
    
    public static Napakalaki getInstance(){
        return instance;
    }
    
    public CombatResult developCombat(){
        return null;
        
    }
    
    public void discardVisibleTreasures(ArrayList<Treasure> treasures){
        
    }
    
    public void discardHiddenTreasures(ArrayList<Treasure> treasures){
        
    }
    
    public void makeTreasuresVisible(ArrayList<Treasure> treasures){
        
    }
    
    public void initGame(ArrayList<String> players){
        
    }
    
    public Player getCurrentPlayer(){
        return currentPlayer;   
    }
    
    public Monster getCurrentMonster(){
        return currentMonster;
        
    }
    
    public boolean nextTurn(){
        return false;
        
    }
    
    public boolean endOfGame(CombatResult result){
        return result == CombatResult.WINGAME;
        
    }
    
    
}
