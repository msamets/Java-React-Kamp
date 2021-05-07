package Abstracts;

import java.util.ArrayList;

import Entitites.Game;

public interface GameOrderService {
	void addToCart(Game game);
	void deleteFormCart(Game game);
	void showToCart();
	void clearToFormCart();
	void buyToCart();
}
