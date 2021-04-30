
public class CreditCard {
	String accountNumber;
	String ownerFullName;
	int cvv;
	
	public CreditCard() {
		
	}
	public CreditCard(String accountNumber, String ownerFullName, int cvv) {
		this.accountNumber = accountNumber;
		this.ownerFullName = ownerFullName;
		this.cvv = cvv;
	}
	
	public String getaccountNumber() {
		return accountNumber;
	}
	public void setaccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getownerFullName() {
		return ownerFullName;
	}
	public void setownerFullName(String ownerFullName) {
		this.ownerFullName = ownerFullName;
	}
	public int getcvv() {
		return cvv;
	}
	public void setcvv( int cvv) {
		this.cvv = cvv;
	}
	
	

}
