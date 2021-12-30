package hrms.lecture63.business.abstracts;

import java.util.List;

import hrms.lecture63.entities.concretes.JobPosition;

public interface JobPositionService {
	List<JobPosition> getAll();
}
