package nLayeredAssigmentForReturnPractice.business.abstracts;

import nLayeredAssigmentForReturnPractice.entities.concretes.User;

public interface SenderServiceForVerification {

	void send(User user);
	void verificationSuccesfulInfoSend(User user);
}
