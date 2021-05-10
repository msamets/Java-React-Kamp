package nLayeredAssignment.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import nLayeredAssignment.business.abstracts.AuthService;
import nLayeredAssignment.business.abstracts.UserService;
import nLayeredAssignment.business.abstracts.UserVerificationService;
import nLayeredAssignment.entities.concretes.User;

public class UserManager implements UserService {
	Scanner scn = new Scanner(System.in);
	AuthService authService;
	
	public UserManager(AuthService authService) {
		this.authService = authService;
	}
	UserVerificationService userVerification;
	public UserManager(UserVerificationService userVerification) {
		this.userVerification = userVerification;
	}
	

	public UserManager(AuthService authService, UserVerificationService userVerification, ArrayList<User> users) {
		this.authService = authService;
		this.userVerification = userVerification;
		this.users = users;
	}
	private User user;
	private ArrayList<User> users = new ArrayList<User>();
	@Override
	public void signUp(User user,List<User> users) {
	//parametre olarak çalýþýr mý kontrol etmek lazým
		String nameRegex = "^(\\w{2,})$";
		Pattern pattern = Pattern.compile(nameRegex, Pattern.UNICODE_CHARACTER_CLASS);
		
		System.out.println("Adýnýzý giriniz:");
		String firstName = scn.nextLine();
		if(pattern.matcher(firstName).matches()) {
			user.setFirstName(firstName);
		}
		else {
			System.out.println("Geçersiz ad girdiniz tekrar deneyiniz.");
			return;
		}
		
		
		System.out.println("Soyadýnýzý giriniz:");
		String lastName = scn.nextLine();
		if(pattern.matcher(lastName).matches()) {
			user.setLastName(lastName);
		}
		else {
			System.out.println("Geçersiz soyad girdiniz tekrar deneyiniz.");
			return;
		}
		
		String emailRegex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
	            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		pattern = Pattern.compile(emailRegex, Pattern.UNICODE_CHARACTER_CLASS);
		System.out.println("Emailinizi giriniz:");
		String email = scn.nextLine();
		//email daha önce kullanýlmamýþ dalgasý==>
		boolean emailcheck=false;
				for (User user1 : users) {
					if(user1.getEmail().equals(email)) {
						System.out.println("Girmiþ olduðunuz email daha önce kullanýlmýþtýr.");
						emailcheck=true;
					}
				}
				if(emailcheck) {
					return;
				}
		if(pattern.matcher(email).matches()) {
			user.setEmail(email);
		}
		else {
			System.out.println("Geçersiz email girdiniz tekrar deneyiniz.");
			return;
		}
		
		String passwordRegex = "^(\\w{6,})$";
		pattern = Pattern.compile(passwordRegex, Pattern.UNICODE_CHARACTER_CLASS);
		System.out.println("Þifrenizi giriniz:");
		String password = scn.nextLine();
		if(pattern.matcher(password).matches()) {
			user.setPassword(password);
		}
		else {
			System.out.println("Geçersiz þifre girdiniz.Þifre en az 6 haneli olmalýdýr.");
			return;
		}
		userVerification.sendVerification();
		userVerification.completeVerification();
		
		System.out.println("Kaydýnýz baþarýyla oluþturulmuþtur.");
		users.add(user);
	}
	
	@Override
	public void signUpWithGoogle(AuthService authManager) {
		//kodlar
		System.out.println("Google hesabý baþarýyla girildi.");
		authManager.authUserSuccesful();
		
	}
	/*
	//email ve password sorgusu için metot
	public String setEmail() {
		System.out.println("Emailinizi giriniz:");
		return scn.nextLine();
		}
	public String setPassword() {
		System.out.println("Þifrenizi giriniz:");
		return scn.nextLine();
	}*/
	@Override
	public void logIn(String email, String password) {
		//burda set li okuyan metot yapacaktým ama þimdi
		//daha gerçekci olsun diye ama baktýðýmýzda
		//burasý direkt textbox a reference gösterileceði için
		//öyle bir metota da gerek yok þuan
		boolean loginCheck = true;
		for (User user2 : users) {
			if(user2.getEmail().equals(email) && user2.getPassword().equals(password)) {
				System.out.println("Giriþ baþarýlý.");
				loginCheck = false;
			}
			
		}
		if(loginCheck) {
			System.out.println("Giriþ baþarýsýz.Girmiþ olduðunuz bilgilerle eþleþen hesap yok. Tekrar deneyiniz.");
		}
		
	}
	
	

}
