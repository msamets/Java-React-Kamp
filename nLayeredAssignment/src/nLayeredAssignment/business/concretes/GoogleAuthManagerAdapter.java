package nLayeredAssignment.business.concretes;

import nLayeredAssignment.GoogleAuth.GoogleAuthManager;
import nLayeredAssignment.business.abstracts.AuthService;
import nLayeredAssignment.entities.concretes.User;

public class GoogleAuthManagerAdapter implements AuthService {
	

	@Override
	public void authUserSuccesful() {
		GoogleAuthManager authManager = new GoogleAuthManager();
		authManager.googleAuthSuccesful();
		
	}

	@Override
	public void authUserUnsuccesful() {
		GoogleAuthManager authManager = new GoogleAuthManager();
		authManager.googleAuthUnsuccesful();
		
	}
	
	

	

	

	

}
