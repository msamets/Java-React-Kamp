package Entitites;

public class CreditCard {
	private String accountNumber;
	private String ownerFullName;
	private int cvv;
	
	public CreditCard() {
		
	}

	public CreditCard(String accountNumber, String ownerFullName, int cvv) {
		
		this.accountNumber = accountNumber;
		this.ownerFullName = ownerFullName;
		this.cvv = cvv;
	}

	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getOwnerFullName() {
		return ownerFullName;
	}
	public void setOwnerFullName(String ownerFullName) {
		this.ownerFullName = ownerFullName;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	
	
}
