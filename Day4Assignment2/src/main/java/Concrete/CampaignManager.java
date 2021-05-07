package Concrete;

import java.util.ArrayList;

import Abstracts.CampaingService;
import Entitites.Campaign;
import Entitites.Game;

public class CampaignManager implements CampaingService {
	
	Campaign campaign;
	//contructor bloðuna parametre olarak game eklemem gerekir mi
	/*
	public void addCampaign(Campaign campaign) {
		//burayý düzenle kampanya koþulu tanýmlamada yazmalý 
		//yani detail de eðer o þartý saðlýyorsa true a döndürecek.
		//þart her kampanya da deðiþeceði için onu o kampanyaya özgü tanýmlamalýyýz.
		//yani x kampanyasýnýn add metodu diye bu nasýl olacak
		//bunu yapamadýðým için salýyorum bu metodu
		
	}
	*/
	public void addGameToCampaign(String gameName) {
		ArrayList<String> campaignedGames1 = new ArrayList<String>();
		campaignedGames1.add(gameName);
		campaign.setCampaignedGame(campaignedGames1);
		System.out.println(gameName+" Kampanyaya eklendi.");
		
	}

	public void deleteGameFromCampaign(String gameName) {
		System.out.println(gameName+" Kampanyadan çýkarýldý.");
		
	}

	public void changeDiscountPercent(int discountPercent) {
		campaign.setCampaignDiscountPercent(discountPercent);
		System.out.println("Kampanya indirim yüzdesi :%"+discountPercent+" olarak deðiþtirildi.");
		
	}

	public void unitPriceWithCampaign(Game game) {
		double unitPrice = game.getUnitPrice();
		unitPrice = unitPrice * ((100-campaign.getCampaignDiscountPercent())/100);
		game.setUnitPrice(unitPrice);
		
	}

}
