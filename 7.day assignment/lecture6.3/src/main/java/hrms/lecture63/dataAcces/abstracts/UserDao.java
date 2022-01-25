package hrms.lecture63.dataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.lecture63.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer> {
User findByEmail(String email);
User findByPassword(String password);
}
