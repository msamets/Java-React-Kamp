
public class User {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String address;
	private CreditCard creditCard;
	
	public User() {
		
	}
	
	public User(int id, String firstName, String lastName, String email, String address, CreditCard creditCard) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.address = address;
		this.creditCard = creditCard;
	}
	
	public int getId() {
		return id;
	}
	public void set(int id) {
		this.id = id;
	}
	public String getfirstName() {
		return firstName;
	}
	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	public String getaddress() {
		return address;
	}
	public void setaddress(String address) {
		this.address = address;
	}
	public String getcreditCardOwnerName() {
		return creditCard.ownerFullName;
	}
	public String getcreditCardAccountNumber() {
		return creditCard.accountNumber;
	}
	public int getcreditCardCvv() {
		return creditCard.cvv;
	}
	public void setcreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}
	

}
