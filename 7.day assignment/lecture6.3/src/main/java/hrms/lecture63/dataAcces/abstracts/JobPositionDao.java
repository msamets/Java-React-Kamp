package hrms.lecture63.dataAcces.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.lecture63.entities.concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition, Integer> {
	JobPosition findByJobPositionNameContainingIgnoreCase(String jobPositionName);
	//JobPosition findByJobPositionName(String jobPositionName);
}
