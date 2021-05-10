package nLayeredAssignment.dataAccess.concretes;

import java.util.List;

import nLayeredAssignment.dataAccess.abstracts.UserDao;
import nLayeredAssignment.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName()+" Hibernate ile eklendi.");
		
	}

	@Override
	public void changeUserInfo(User user) {
		System.out.println(user.getFirstName()+" Adlý kullanýcýnýn bilgileri Hibernate ile deðiþtirildi");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName()+" Adlý kullanýcý Hibernate ile silindi.");
		
	}

	
	
	

}
