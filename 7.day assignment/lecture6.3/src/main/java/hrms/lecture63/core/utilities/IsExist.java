package hrms.lecture63.core.utilities;

import org.springframework.beans.factory.annotation.Autowired;

import hrms.lecture63.core.utilities.results.ErrorResult;
import hrms.lecture63.core.utilities.results.Result;
import hrms.lecture63.core.utilities.results.SuccessResult;
import hrms.lecture63.dataAcces.abstracts.EmployerDao;
import hrms.lecture63.dataAcces.abstracts.JobPositionDao;
import hrms.lecture63.dataAcces.abstracts.JobSeekerDao;

public class IsExist  {/*
	//Bu existler çok da proje geneline uyarlanamıyor gibi geldi
	//Result gibi o yüzden şimdilik askıya alıyorum ama araştırıp
	//çözeceğim
	
	//bu daolar böyle mi kullanılacak yoksa
	//bunları genel soyutlamanın bir yolu var mı tek bir dao injecte edip
	//istediğimi seçerek davranabilir miyim? Bir araştır
	private EmployerDao employerDao;
	private JobPositionDao jobPositionDao;
	private JobSeekerDao jobSeekerDao;
	
	@Autowired
	public IsExist(EmployerDao employerDao) {
		this.employerDao = employerDao;
	}
	
	@Autowired
	public IsExist(JobPositionDao jobPositionDao) {
		this.jobPositionDao = jobPositionDao;
	}
	
	@Autowired
	public IsExist(JobSeekerDao jobSeekerDao) {
		this.jobSeekerDao = jobSeekerDao;
	}
	
	
	
	public Result isJobPositionExist(String jobPositionName) {
		if(this.jobPositionDao.findByJobPositionNameContainingIgnoreCase(jobPositionName) == null) {
			return new ErrorResult();
			}
		return new SuccessResult();
	}
	//JobSeeker için e posta ve tc
	//Employer için  aynı domaine sahip e-posta
	//JobPosition için name
	*/
	
}
