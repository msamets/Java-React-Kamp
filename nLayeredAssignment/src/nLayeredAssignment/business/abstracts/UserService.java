package nLayeredAssignment.business.abstracts;

import java.util.ArrayList;
import java.util.List;

import nLayeredAssignment.business.concretes.GoogleAuthManagerAdapter;
import nLayeredAssignment.entities.concretes.User;

public interface UserService {
	void signUp(User user, List<User> users);
	void signUpWithGoogle(AuthService authManager);//????   buraya bak
	void logIn(String email, String password);
	

}
