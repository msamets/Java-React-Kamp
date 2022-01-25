package hrms.lecture63.dataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.lecture63.entities.concretes.MernisVerification;

public interface MernisVerificationDao extends JpaRepository<MernisVerification, Integer> {

}
