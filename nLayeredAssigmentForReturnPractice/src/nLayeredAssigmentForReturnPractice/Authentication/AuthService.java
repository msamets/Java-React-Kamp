package nLayeredAssigmentForReturnPractice.Authentication;

import nLayeredAssigmentForReturnPractice.entities.concretes.User;

public interface AuthService {
	void login(String email, String password);
	void signup(String email, String password, User user);
}
