package nLayeredAssigmentForReturnPractice.Core.Adapters;

import nLayeredAssigmentForReturnPractice.Authentication.AuthService;
import nLayeredAssigmentForReturnPractice.Authentication.GoogleAuthManager;
import nLayeredAssigmentForReturnPractice.entities.concretes.User;

public class GoogleAuthManagerAdapter implements AuthServiceAdapter {
	
	AuthService googleAuthManager = new GoogleAuthManager();
	@Override
	public void login(String email, String password) {
		googleAuthManager.login(email, password);
		
	}

	@Override
	public void signup(String email, String password, User user) {
		googleAuthManager.signup(email, password, user);
		
	}
	
	
	//use this class as a google authenticator service adapter 
	// i doing just simulator to real method therefore just check incoming parameters and will return to us  according to these parameters
	//is enough for this method.
	
	
}
