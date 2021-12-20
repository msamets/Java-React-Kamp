package nLayeredAssigmentForReturnPractice.Core.Adapters;

import nLayeredAssigmentForReturnPractice.entities.concretes.User;

public interface AuthServiceAdapter {
	void login(String email, String password);
	void signup(String email, String password, User user);
}
