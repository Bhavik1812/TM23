package ca.concordia;

import java.util.Map;

import ca.concordia.game.model.Gameboard;
import ca.concordia.game.model.Player;




/**
 * This is temporal entry point. 
 * @author root
 */
public class GameState {
	
	
	private Map<String, Player> players; 
	private Gameboard gameboard;
	
	
	
	public boolean equals(GameState gameState){
		//@todo check the number of players
		//@todo check occupied areas
		//@todo check the bank
		return false;
	}
	

}
