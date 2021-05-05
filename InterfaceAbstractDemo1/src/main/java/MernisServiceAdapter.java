import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import tr.gov.nvi.tckimlik.ws.KPSPublic;
import tr.gov.nvi.tckimlik.ws.KPSPublicSoap;
import tr.gov.nvi.tckimlik.ws.TCKimlikNoDogrula;

public class MernisServiceAdapter implements CustomerCheckService {

	

	public boolean tcKimlikNoDogrula(Customer customer) throws MalformedURLException  {
		String endpoint  = "https://tckimlik.nvi.gov.tr/Service/KPSPublic.asmx";
		URL url = URI.create(endpoint).toURL();
		KPSPublic service = new KPSPublic(url);
		KPSPublicSoap port = service.getPort(KPSPublicSoap.class);
		return port.tcKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getDateOfBirth());
		
		
		
	}

	

	

	

	


	

}
