package nLayeredAssigmentForReturnPractice.Core.Adapters;

import nLayeredAssigmentForReturnPractice.Authentication.AuthService;
import nLayeredAssigmentForReturnPractice.Authentication.FacebookAuthManager;
import nLayeredAssigmentForReturnPractice.entities.concretes.User;

public class FacebookAuthManagerAdapter implements AuthServiceAdapter{

	AuthService facebookAuthManager = new FacebookAuthManager();
	
	@Override
	public void login(String email, String password) {
		facebookAuthManager.login(email, password);
		
	}

	@Override
	public void signup(String email, String password, User user) {
		facebookAuthManager.signup(email, password, user);
	}

}
