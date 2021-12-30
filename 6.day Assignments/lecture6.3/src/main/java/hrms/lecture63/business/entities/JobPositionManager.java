package hrms.lecture63.business.entities;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.lecture63.business.abstracts.JobPositionService;
import hrms.lecture63.dataAcces.abstracts.JobPositionDao;
import hrms.lecture63.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService {
	
	private JobPositionDao jobPositionDao;
	
	@Autowired//(gidiyor projeyi tarıyor bu projede bu sınıfa denk geleni buluyor)
	public JobPositionManager(JobPositionDao jobPositionDao) {
		this.jobPositionDao = jobPositionDao;
	}
	
	@Override
	public List<JobPosition> getAll() {
		
		return this.jobPositionDao.findAll();
	}

}
