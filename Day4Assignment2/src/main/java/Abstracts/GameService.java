package Abstracts;

import Entitites.Game;

public interface GameService {
	void changeUnitPrice(double unitPrice);
	void changeAgeLimiter(int ageLimiter);
	void deleteAgeLimiter();
	void addPlatforms(String platform);
	void changeCategory(String category);
}
