package nLayeredAssigmentForReturnPractice.entities.concretes;

import java.util.regex.Pattern;

import nLayeredAssigmentForReturnPractice.entities.abstracts.Entity;

public class User implements Entity {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	//ödev çok uzamasýn diye sadece gereklileri yapýyorum fazlasýna dokunmuyoruz
	//i will do regex expression for email , firstName, lastName, password;
	String nameRegex = "^\\p{L}{2,}$";
	String emailRegex = "^([\\p{L}\\d(?=\\S+$)\\.-]+)@([a-z\\d-]+)\\.([a-z]{2,8})(\\.[a-z]{2,8})?$";
	String passwordRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(.*[@#$%^&+=])?(?=\\S+$).{6,}$";
	Pattern pattern = Pattern.compile(nameRegex, Pattern.UNICODE_CHARACTER_CLASS);
	
	public User() {
		
	}

	public User(String firstName, String lastName, String email, String password) {
		super();
		this.id = id++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
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
		if(pattern.matches(nameRegex, firstName)) {
			this.firstName = firstName;
		}
		else {
			System.out.println("This name is not valid, name must be minimum 2 character.");
		}
		
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if(pattern.matches(nameRegex, lastName)) {
			this.lastName = lastName;
		}
		else {
			System.out.println("This name is not valid, name must be minimum 2 character.");
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if(pattern.matches(emailRegex, email)) {
		this.email = email;
		}
		else {
			System.out.println("This is not valid, please enter your email.");
		}
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if(pattern.matches(passwordRegex, password)) {
		this.password = password;
		}
		else {
			System.out.println("This is not valid,"
					+ " please pick another password minimum 6 character. ");
		}
	}
	
	
	
}
