package hrms.lecture63.business.entities;

import java.util.List;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import hrms.lecture63.business.abstracts.EmployerService;
import hrms.lecture63.core.utilities.results.DataResult;
import hrms.lecture63.core.utilities.results.ErrorResult;
import hrms.lecture63.core.utilities.results.Result;
import hrms.lecture63.core.utilities.results.SuccessDataResult;
import hrms.lecture63.core.utilities.results.SuccessResult;
import hrms.lecture63.core.verifications.abstracts.EmailVerificationService;
import hrms.lecture63.core.verifications.abstracts.HrmsVerificationService;
import hrms.lecture63.dataAcces.abstracts.EmployerDao;
import hrms.lecture63.entities.concretes.Employer;


@Service
public class EmployerManager implements EmployerService {
	
	private HrmsVerificationService hrmsVerificationService;
	private EmailVerificationService emailVerificationService;
	private EmployerDao employerDao;
	
	
	
	@Autowired
	public EmployerManager(HrmsVerificationService hrmsVerificationService, EmailVerificationService emailVerificationService, EmployerDao employerDao) {
		this.emailVerificationService = emailVerificationService;
		this.employerDao = employerDao;
		this.hrmsVerificationService = hrmsVerificationService;
		
	}
	
	
	
	@Override
	public DataResult<List<Employer>> getAll() {
		
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll()
				, "İş verenler listelendi.");
	}
	
	public Result isEmailExist(String email) {
		if(this.employerDao.findByEmail(email) == null) {
			return new ErrorResult();
		}
		
		return new SuccessResult();
	}
	
	
	
	



	@Override
	public Result add(Employer employer) {
		String emailRegex = "^([\\p{L}\\d(?=\\S+$)\\.-]+)@([a-z\\d-]+)\\.([a-z]{2,8})(\\.[a-z]{2,8})?$";
		String passwordRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(.*[@#$%^&+=])?(?=\\S+$).{6,}$";
		Pattern pattern =	Pattern.compile(emailRegex,Pattern.UNICODE_CHARACTER_CLASS);
		
		if(employer.getEmail()==null ||employer.getPassword()==null ||employer.getSirketAdi()==null
				||employer.getSirketWebsite()==null ||employer.getTelefonNo()==null)
			return new ErrorResult("Herhangi bir alan boş bırakılamaz.");
			
		else if(!pattern.matches(emailRegex, employer.getEmail())) {
			return new ErrorResult("Girmiş olduğunuz e-mail geçerli değil.Lütfen başka bir e-mail giriniz.");
		}
		
		
		else if(isEmailExist(employer.getEmail()).isSuccess()) {
			return new ErrorResult("Girmiş olduğunuz email daha önce kullanılmış.");
		}
		
		else if(!pattern.matches(passwordRegex, employer.getPassword())) {
			return new ErrorResult("Girmiş olduğunuz şifre geçerli değil."
					+ "Şifre en az 6 karakterden ve bir küçük bir büyük harf ve"
					+ "rakam içermek zorundadır."
					+ "Lütfen geçerli bir şifre giriniz.");
		}
		
		
		//eposta doğrulama servisi yapmaya çalıştım baya bi ilerledim ama mevcut bilgimle yapamayıp kanser oldum
		//başlangıcın 6. saati o yüzden bırakıyorum simülasyonunu yapıyorum
		emailVerificationService.verification(employer);
		hrmsVerificationService.verification(employer);
		
		this.employerDao.save(employer);
		return new SuccessResult("İş veren başarıyla eklendi");
	}
	
}
