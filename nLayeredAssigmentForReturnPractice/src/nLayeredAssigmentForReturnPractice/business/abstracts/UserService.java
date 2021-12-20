package nLayeredAssigmentForReturnPractice.business.abstracts;

import java.util.List;

import nLayeredAssigmentForReturnPractice.Core.Adapters.AuthServiceAdapter;
import nLayeredAssigmentForReturnPractice.entities.concretes.User;

public interface UserService {
	void signUp(User user, List<User> users);
	void login(String email, String password, List<User> users);
	//i need to  use arrayList to do these two method.
	void signUpWithAnotherApp(String email, String password, User user,List<User> users);
	//--> this method should use another platform account for sign up like google, apple or facebook
	//i need to another app acc info for login 
	// if i can make this with one method should be compatible with all external services.
	//i think firstly we want  login apple acc(apple just example it can be another platform account)and secondly we want info for sign up 
	
	
	void loginUpWithAnotherApp(String email, String password, List<User> users);

}
