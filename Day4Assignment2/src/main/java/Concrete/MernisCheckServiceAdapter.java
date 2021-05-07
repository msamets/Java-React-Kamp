package Concrete;

import java.net.MalformedURLException;
import java.net.URI;

import javax.print.DocFlavor.URL;

import Abstracts.GamerCheckService;
import Entitites.Gamer;
import tr.gov.nvi.tckimlik.ws.KPSPublic;
import tr.gov.nvi.tckimlik.ws.KPSPublicSoap;

public class MernisCheckServiceAdapter implements GamerCheckService {

	public boolean tcKimlikNoSorgula(Gamer gamer) throws MalformedURLException {
		String endpoint = "https://tckimlik.nvi.gov.tr/Service/KPSPublic.asmx";
		java.net.URL url = URI.create(endpoint).toURL();
		KPSPublic service = new KPSPublic(url);
		KPSPublicSoap port = service.getPort(KPSPublicSoap.class);
		return port.tcKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()), gamer.getFirstName().toUpperCase(), gamer.getLastName().toUpperCase(), gamer.getYearOfBirth());
		
	}

}
