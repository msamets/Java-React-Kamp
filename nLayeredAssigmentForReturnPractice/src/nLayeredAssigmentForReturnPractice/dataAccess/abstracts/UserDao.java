package nLayeredAssigmentForReturnPractice.dataAccess.abstracts;

import java.util.List;

import nLayeredAssigmentForReturnPractice.entities.concretes.User;

public interface UserDao {
	//DAO = data access object or it can use data access layer
	void add(User user);//sadece bu metotu yazacaðým 
	void update(User user);
	void delete(User user);
	User get(int userId);
	List<User> getAll();//bütün kullanýcýlarýn getirildiði liste
	
	//burayý sadece simülasyon olarak kullanýyorum daha sql ile
	//çalýþmaya baþlamadýk çünkü sadece çok katmanlý mimari
	//konseptini yakalabilmek için yapýyorum.
	
	
	
}
