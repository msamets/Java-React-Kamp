package nLayeredAssignment;

import java.util.ArrayList;

import nLayeredAssignment.GoogleAuth.GoogleAuthManager;
import nLayeredAssignment.business.abstracts.AuthService;
import nLayeredAssignment.business.abstracts.UserService;
import nLayeredAssignment.business.abstracts.UserVerificationService;
import nLayeredAssignment.business.concretes.GoogleAuthManagerAdapter;
import nLayeredAssignment.business.concretes.UserManager;
import nLayeredAssignment.business.concretes.UserVerificationWithEmail;
import nLayeredAssignment.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<User> users = new ArrayList<User>();
		AuthService authManager = new GoogleAuthManagerAdapter();
		UserVerificationService userVerification = new UserVerificationWithEmail();
		UserService userManager = new UserManager(authManager, userVerification, users);
		
		userManager.signUpWithGoogle(authManager);
		
		userManager.signUp(new User(),users);
		userManager.signUp(new User(),users);//email tekrar girememe testi için
		
		userManager.logIn("osman@gmail.com","123456");
		
	}

}
