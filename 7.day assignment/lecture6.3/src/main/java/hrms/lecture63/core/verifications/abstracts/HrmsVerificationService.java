package hrms.lecture63.core.verifications.abstracts;

import hrms.lecture63.core.utilities.results.Result;
import hrms.lecture63.entities.concretes.User;

public interface HrmsVerificationService {
	Result verification(User user);
}
