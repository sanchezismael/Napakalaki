/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

/**
 *
 * @author jmfajardo
 */
public class CardDealer {
    private static final CardDealer instance = new CardDealer();
    private CardDealer(){
        
    }
    private void initTreasureCardDeck(){
        
    };
    private void initMonsterCardDeck(){
        
    };
    private void shuffleTreasure(){
        
    };
    private void shuffleMonsters(){
        
    };
    public static CardDealer getInstance(){
        return instance;
    };
    public Treasure nextTreasure(){
        
    };
    public Monster nextMonster(){
        
    };
    public void giveTreasureBack(Treasure t){
        
    };
    public void giveMonsterBack(Monster m){
        
    };
    public void initCards(){
        
    };
 
}
