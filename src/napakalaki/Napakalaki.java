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
        dealer = CardDealer.getInstance();
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
    
    private boolean nextTurnAllowed(){
        if(currentPlayer == null)
            return true;
        boolean stateOK = currentPlayer.validState();
        return stateOK;
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
        CombatResult combatResult = currentPlayer.combat(currentMonster);
        dealer.giveMonsterBack(currentMonster);
        
        return combatResult;
    }
    
    public void discardVisibleTreasures(ArrayList<Treasure> treasures){
        for (Treasure visibletreasure : treasures) {
            currentPlayer.discardVisibleTrasure(visibletreasure);
            dealer.giveTreasureBack(visibletreasure);
        }
    }
    
    public void discardHiddenTreasures(ArrayList<Treasure> treasures){
        for (Treasure hiddentreasure : treasures) {
            currentPlayer.discardHiddenTreasure(hiddentreasure);
            dealer.giveTreasureBack(hiddentreasure);
        }
    }
    
    public void makeTreasuresVisible(ArrayList<Treasure> treasures){
        for (Treasure treasure : treasures) {
            currentPlayer.makeTreasureVisible(treasure);
        }
    }
    
    public void initGame(ArrayList<String> players){
        initPlayers(players);
        setEnemies();
        dealer.initCards();
        nextTurn();   
    }
    
    public Player getCurrentPlayer(){
        return currentPlayer;   
    }
    
    public Monster getCurrentMonster(){
        return currentMonster;
        
    }
        
    public boolean nextTurn(){
        boolean stateOK = nextTurnAllowed();
        if (stateOK){
            currentMonster = dealer.nextMonster();
            currentPlayer = nextPlayer();
            boolean dead = currentPlayer.isDead();
            if (dead){
                currentPlayer.initTreasures();
            }
        }
        
        return stateOK;
    }
    
    public boolean endOfGame(CombatResult result){
        return result == CombatResult.WINGAME;
        
    }
    
    
}
