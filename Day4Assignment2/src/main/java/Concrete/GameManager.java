package Concrete;

import java.util.ArrayList;

import Abstracts.GameService;
import Entitites.Game;

public class GameManager implements GameService {
	Game game;
	//contructor bloðuna parametre olarak game eklemem gerekir mi
	//constructor gerekiyor yoksa this. diyip burdakini deðiþtrmeye
	//çalýþýyor ve burda herhangi bir deðer atanmadýðý için 
	//error veriyor
	public GameManager(Game game) {
		this.game = game;
	}

	public void changeUnitPrice(double unitPrice) {
		game.setUnitPrice(unitPrice);
		System.out.println(game.getName()+" Oyunun fiyatý "+game.getUnitPrice()+" olarak deðiþtirildi");
		
	}

	public void changeAgeLimiter(int ageLimiter) {
		game.setAgeLimiter(ageLimiter);
		System.out.println(game.getName()+" Oyunun yaþ limiti "+game.getAgeLimiter()+" olarak deðiþtirildi");
	}

	public void deleteAgeLimiter() {
		game.setAgeLimiter(200);
		System.out.println("Oyunun yaþ limiti kaldýrýldý.");
		
	}
	
	public void addPlatforms(String platform) {
		ArrayList<String> platforms1= game.getPlatforms();
		platforms1.add(platform);
		game.setPlatforms(platforms1);
		System.out.println("Oyun "+platform+" platforma eklendi.");
	}
	
	public void changeCategory(String category) {
		game.setCategory(category);
		System.out.println("Oyunun kategorisi "+game.getCategory()+" olarak deðiþtirildi.");
		
	}

	
	

	

	
	

	

}
