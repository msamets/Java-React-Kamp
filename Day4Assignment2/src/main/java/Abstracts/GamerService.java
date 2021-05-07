package Abstracts;

import java.net.MalformedURLException;

import Entitites.CreditCard;
import Entitites.Gamer;

public interface GamerService {
	void addPerson(Gamer gamer) throws MalformedURLException;//doðrulama yapabilmemiz için burdan kayýtlý
	//doðrulama yapýp kaydeceðiz
	void addPlusSubscription();
	void deletePlusSubscription(Gamer gamer);
	void addCreditCard(CreditCard creditCard);
	void changeCreditCard(CreditCard creditCard);
	void deleteCreditCard();
	
}
