package Entitites;

import java.util.ArrayList;
//90-100 arasýna bak emin deðilim çalýþabilirliðinden
public class Gamer {
	private int id;
	private String firstName;
	private String lastName;
	private int yearOfBirth;
	private String nationalityId;
	private String address;
	private boolean plusSubscription;
	ArrayList<Integer> gameIdLibrary = new ArrayList<Integer>(); 
	private CreditCard creditCard;
	private Campaign joinedCampaign;//Bi tekrar bak
	
	
	public Gamer() {
		
	}

	public Gamer(int id, String firstName, String lastName, int yearOfBirth,String nationalityId, String address, boolean plusSubscription,
			ArrayList<Integer> gameIdLibrary, CreditCard creditCard) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.yearOfBirth = yearOfBirth;
		this.nationalityId = nationalityId;
		this.address = address;
		this.plusSubscription = plusSubscription;
		this.gameIdLibrary = gameIdLibrary;
		this.creditCard = creditCard;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean getPlusSubscription() {
		return plusSubscription;
	}

	public void setPlusSubscription(boolean plusSubscription) {
		this.plusSubscription = plusSubscription;
	}
	
	

	public ArrayList<Integer> getGameIdLibrary() {
		return gameIdLibrary;
	}
	//buranýn çalýþýrlýðýndan emin deðilim
	//burayý dene
	public void setGameIdLibrary(ArrayList<Integer> gameIdLibrary) {
		this.gameIdLibrary = gameIdLibrary;
	}
	
	

	public String getCreditCardAccountNumber() {
		return creditCard.getAccountNumber();
	}
	public String getCreditCardOwnerFullName() {
		return creditCard.getOwnerFullName();
	}
	public int getCreditCardCvv() {
		return creditCard.getCvv();
	}

	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}

	public Campaign getJoinedCampaign() {
		return joinedCampaign;
	}

	public void setJoinedCampaign(Campaign joinedCampaign) {
		this.joinedCampaign = joinedCampaign;
	}
	
	
	
	
	
}
