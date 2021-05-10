package nLayeredAssignment.entities.concretes;

public class User {
	
	private int id;
	private String firstName;//main info
	private String lastName;//main info
	private String password;//main info
	private String email;//main info
	private String address;
	
	
	public User() {
		
	}
	

	public User(String firstName, String lastName, String password, String email) {
		this.id = id++;//id nin otomatik kendince artmasýný yapmak istedim
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
	}
	


	public User(String password, String email) {
		this.password = password;
		this.email = email;
	}


	public User(int id, String firstName, String lastName, String password, String email, String address) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
		this.address = address;
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


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
