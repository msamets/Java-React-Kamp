package Concrete;

import java.net.MalformedURLException;

import Abstracts.GamerCheckService;
import Abstracts.GamerService;
import Entitites.CreditCard;
import Entitites.Gamer;

public class BaseGamerManager implements GamerService {
	
	//contructor bloðuna parametre olarak game eklemem gerekir mi
	private Gamer gamer;
	
	private GamerCheckService gamerCheckService;
	public BaseGamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}
	
	public void addPerson(Gamer gamer) throws MalformedURLException {
		if(gamerCheckService.tcKimlikNoSorgula(gamer)) {
			System.out.println(gamer.getFirstName()+" sisteme Kaydedildi");
		}
		else {
			System.out.println("Böyle biri yok.");
		}
		
	}
	//burasý biraz saçma oldu ama sor bi
	//managerde ekstra tanýmlamak gerekiyor mu yoksa
	//zaten get ve setler bu iþlemleri yapýyorlar
	public void addPlusSubscription() {
		gamer.setPlusSubscription(true);
		System.out.println("Plus üyeliði baþlatýldý.");
	}

	public void deletePlusSubscription(Gamer gamer) {
		gamer.setPlusSubscription(false);
		System.out.println("Plus üyeliði iptal edildi.");
	}

	public void addCreditCard(CreditCard creditCard) {
		gamer.setCreditCard(creditCard);
		System.out.println("Kredi kartý eklendi");
	}

	public void changeCreditCard(CreditCard creditCard) {
		gamer.setCreditCard(creditCard);
		System.out.println("Kredi kartý bilgileri deðiþtirildi.");
		
	}

	public void deleteCreditCard() {
		System.out.println("Kredi kartý bilgileri silindi");
		
	}

}
