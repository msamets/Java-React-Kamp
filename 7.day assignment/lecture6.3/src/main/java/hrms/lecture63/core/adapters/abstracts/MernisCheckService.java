package hrms.lecture63.core.adapters.abstracts;

import hrms.lecture63.core.utilities.results.Result;
import hrms.lecture63.entities.concretes.JobSeeker;

public interface MernisCheckService {

	Result checkIfRealPerson(JobSeeker jobSeeker) throws Exception, Exception;
}
