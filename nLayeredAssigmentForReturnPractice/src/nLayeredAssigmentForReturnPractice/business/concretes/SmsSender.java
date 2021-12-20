package nLayeredAssigmentForReturnPractice.business.concretes;

import nLayeredAssigmentForReturnPractice.business.abstracts.SenderServiceForVerification;
import nLayeredAssigmentForReturnPractice.entities.concretes.User;

public class SmsSender implements SenderServiceForVerification {

	@Override
	public void send(User user) {
		System.out.println(user.getEmail()+" adresine üyelik doðrulama için sms gönderildi.");
		
	}

	@Override
	public void verificationSuccesfulInfoSend(User user) {
		System.out.println(user.getFirstName()+" üyeliði doðrulandý.");
		
	}

}
