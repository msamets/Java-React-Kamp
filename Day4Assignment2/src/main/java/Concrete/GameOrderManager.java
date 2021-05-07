package Concrete;

import java.util.ArrayList;

import Abstracts.GameOrderService;
import Entitites.Game;
import Entitites.Gamer;

public class GameOrderManager implements GameOrderService {
	ArrayList<Game> cart = new ArrayList<Game>();
	
	public GameOrderManager(ArrayList<Game> cart) {
		this.cart= cart;
		
	}
	

	public void addToCart(Game game) {
		cart.add(game);
		System.out.println(game.getName()+" sepete eklendi.");
	}

	public void clearToFormCart() {
		cart.clear();
		System.out.println("Sepet sýfýrlandý.");
	}

	public void buyToCart() {
		System.out.print("Sepetteki oyunlar alýndý :");
		for (Game game : cart) {
			System.out.print(game.getName()+"\t");
		}
		System.out.println();
		
	}

	public void deleteFormCart(Game game) {
		System.out.println(game.getName()+" Sepetten çýkarýldý.");
		
	}

	public void showToCart() {
		System.out.println("Sepetteki oyunlar:");
		for (Game game : cart) {
			System.out.print(game.getName()+"\t");
		}
		System.out.println();
	}

}
