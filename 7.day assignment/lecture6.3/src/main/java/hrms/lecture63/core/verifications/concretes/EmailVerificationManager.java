package hrms.lecture63.core.verifications.concretes;

import org.springframework.stereotype.Service;

import hrms.lecture63.core.utilities.results.Result;
import hrms.lecture63.core.utilities.results.SuccessResult;
import hrms.lecture63.core.verifications.abstracts.EmailVerificationService;
import hrms.lecture63.entities.concretes.User;

@Service
public class EmailVerificationManager implements EmailVerificationService {

	@Override
	public Result verification(User user) {
		// TODO Auto-generated method stub
		return new SuccessResult();
	}

}
