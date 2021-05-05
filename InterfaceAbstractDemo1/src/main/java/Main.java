import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import tr.gov.nvi.tckimlik.ws.KPSPublic;
import tr.gov.nvi.tckimlik.ws.KPSPublicSoap;
public class Main {

	public static void main(String[] args) throws MalformedURLException {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.Save(new Customer(1, "Engin", "Demiroð", 1985,"28861499108"));
		
		

	}

}
