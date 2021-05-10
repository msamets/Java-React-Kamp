package nLayeredAssignment.dataAccess.abstracts;

import java.util.List;

import nLayeredAssignment.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void changeUserInfo(User user);
	void delete(User user);
	
	

}
