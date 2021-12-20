package nLayeredAssigmentForReturnPractice.business.concretes;

import nLayeredAssigmentForReturnPractice.business.abstracts.SenderServiceForVerification;
import nLayeredAssigmentForReturnPractice.entities.concretes.User;

public class MailSender implements SenderServiceForVerification {

	@Override
	public void send(User user) {
		System.out.println(user.getEmail()+" adresine üyelik doðrulama için e-mail gönderildi.");
		
	}

	@Override
	public void verificationSuccesfulInfoSend(User user) {
		System.out.println(user.getFirstName()+" üyeliði doðrulandý.");
		
	}

	
}
