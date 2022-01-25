package hrms.lecture63.dataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.lecture63.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer> {
	//Employer için e-posta
	Employer findByEmail(String email);
}
