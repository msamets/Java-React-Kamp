package nLayeredAssigmentForReturnPractice.Authentication;

import nLayeredAssigmentForReturnPractice.entities.concretes.User;

public class FacebookAuthManager implements AuthService {

	public void login(String email, String password) {
		System.out.println(email+" ile facebook üzerinden giriþ yapýldý.");
	}
	public void signup(String email, String password, User user) {
		System.out.println(email+" ile facebook üzerinden üye olundu.");
	}
}
