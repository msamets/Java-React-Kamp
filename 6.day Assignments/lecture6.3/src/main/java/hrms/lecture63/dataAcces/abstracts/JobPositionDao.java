package hrms.lecture63.dataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.lecture63.entities.concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition, Integer> {

}
