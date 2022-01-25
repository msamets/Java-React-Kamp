package hrms.lecture63.core.verifications.concretes;

import org.springframework.stereotype.Service;

import hrms.lecture63.core.utilities.results.Result;
import hrms.lecture63.core.utilities.results.SuccessResult;
import hrms.lecture63.core.verifications.abstracts.HrmsVerificationService;
import hrms.lecture63.entities.concretes.User;

@Service
public class HrmsVerificationManager implements HrmsVerificationService {

	@Override
	public Result verification(User user) {
		// TODO Auto-generated method stub
		return new SuccessResult();
	}

}
