import java.net.MalformedURLException;
import java.util.ArrayList;

import Concrete.BaseGamerManager;
import Concrete.GameManager;
import Concrete.GameOrderManager;
import Concrete.MernisCheckServiceAdapter;
import Entitites.Campaign;
import Entitites.CreditCard;
import Entitites.Game;
import Entitites.Gamer;

public class Main {

	public static void main(String[] args) throws MalformedURLException {
		//Gamer Test
		Gamer gamer1 = new Gamer();
		gamer1.setId(1);
		gamer1.setFirstName("Engin");
		gamer1.setLastName("Demiroð");
		gamer1.setYearOfBirth(1985);
		gamer1.setNationalityId("11111111111");
		
		BaseGamerManager gamerManager = new BaseGamerManager(new MernisCheckServiceAdapter());
		gamerManager.addPerson(gamer1);
		
		Gamer gamer2 = new Gamer(2,"Mustafa Samet","Sönmez",2000,"11111111111","Adana",
				true,new ArrayList<Integer>(),new CreditCard("99999999999","Mustafa Samet Sönmez",999));
		
		gamerManager.addPerson(gamer2);
		

		gamerManager.deletePlusSubscription(gamer2);
		
		//Game Test
		Game game1 = new Game();
		game1.setId(1);
		game1.setName("Dota 2");
		game1.setCategory("MOBA");
		game1.setDescription("Dota nýn 2. oyunu eski bir moba oyunu.");
		game1.setUnitPrice(150);
		game1.setAgeLimiter(18);
		game1.setRating(4.8);
		game1.setPlatforms(new ArrayList<String>());
		System.out.println(game1.getName());
		
		Game game2 = new Game(2,"Black Desert Online","MMORPG","The Best MMORPG in the world!",25,18,4.9,new ArrayList<String>());
		System.out.println(game2.getName()+" oyununun yaþ sýnýrý: "+game2.getAgeLimiter());
		
		GameManager gameManager = new GameManager(game2);
		gameManager.changeAgeLimiter(25);
		
		//Campaign Test
		Campaign campaign1 = new Campaign();
		campaign1.setId(1);
		campaign1.setName("Yaz Ýndirimleri");
		campaign1.setDetail("Büyük yaz indirimleri 15 -30 Haziran arasýnda geçerli.");
		campaign1.setCampaignDiscountPercent(25);
		campaign1.setCampaignedGame(new ArrayList<String>());
		System.out.println(campaign1.getName()+" indirim oraný: %"+campaign1.getCampaignDiscountPercent());
		
		//Gamer Order Test
		//ArrayList<Game> cart = new ArrayList<Game>();
		GameOrderManager gamerOrderManager = new GameOrderManager(new ArrayList<Game>());
		gamerOrderManager.addToCart(game1);
		gamerOrderManager.addToCart(game2);
		gamerOrderManager.showToCart();
		gamerOrderManager.buyToCart();
		
		
		
		
		
		
		
		
		
		

	}

}
