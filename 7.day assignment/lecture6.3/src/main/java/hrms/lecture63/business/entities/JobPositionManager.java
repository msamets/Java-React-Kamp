package hrms.lecture63.business.entities;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import hrms.lecture63.business.abstracts.JobPositionService;
import hrms.lecture63.core.utilities.results.DataResult;
import hrms.lecture63.core.utilities.results.ErrorResult;
import hrms.lecture63.core.utilities.results.Result;
import hrms.lecture63.core.utilities.results.SuccessDataResult;
import hrms.lecture63.core.utilities.results.SuccessResult;
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
	public DataResult<List<JobPosition>> getAll() {
		
		return new SuccessDataResult<List<JobPosition>>(
				this.jobPositionDao.findAll(),"İş pozisyonları listelendi.");
	}

	
	public Result isJobPositionExist(String jobPositionName) {
		if(this.jobPositionDao.findByJobPositionNameContainingIgnoreCase(jobPositionName) == null) {
			return new ErrorResult();
			}
		return new SuccessResult();
	}
	
	
	
	@Override
	public Result add(JobPosition jobPosition) {
		
		
		if(isJobPositionExist(jobPosition.getJobPositionName()).isSuccess()) {
			return new ErrorResult("Girmiş olduğunuz pozisyon zaten mevcuttur.");
		}
		
		this.jobPositionDao.save(jobPosition);
		return new SuccessResult("İş pozisyonu başarıyla eklendi.");
		
		
	}

}
