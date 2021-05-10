package nLayeredAssignment.business.concretes;

import nLayeredAssignment.business.abstracts.UserVerificationService;

public class UserVerificationWithEmail implements UserVerificationService {

	@Override
	public void sendVerification() {
		System.out.println("Üyelik doðrulama linki emailinize gönderildi.");
		
	}

	@Override
	public void completeVerification() {
		System.out.println("Üyeliðiniz Email ile doðrulandý.");
		
	}

}
