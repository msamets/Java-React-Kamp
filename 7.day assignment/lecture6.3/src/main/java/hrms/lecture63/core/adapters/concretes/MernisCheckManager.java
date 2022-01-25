package hrms.lecture63.core.adapters.concretes;

import java.rmi.RemoteException;
import java.util.Locale;

import org.springframework.stereotype.Service;

import hrms.lecture63.core.adapters.abstracts.MernisCheckService;
import hrms.lecture63.core.utilities.results.ErrorResult;
import hrms.lecture63.core.utilities.results.Result;
import hrms.lecture63.core.utilities.results.SuccessResult;
import hrms.lecture63.entities.concretes.JobSeeker;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

@Service
public class MernisCheckManager implements MernisCheckService {

	
	
	@Override
	public Result checkIfRealPerson(JobSeeker jobSeeker) throws Exception, Exception {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		
		boolean result = kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(jobSeeker.getTcNo()), jobSeeker.getAd().toUpperCase(new Locale("tr","TR")),
						jobSeeker.getSoyad().toUpperCase(new Locale("tr","TR")), jobSeeker.getBirthYear());
		
		if(!result) {
			return new ErrorResult();
		}
		
		return new SuccessResult();
	}

}
