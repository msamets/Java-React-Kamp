import java.net.MalformedURLException;

public abstract class BaseCustomerManager implements CustomerService {

	public void Save(Customer customer) throws MalformedURLException {
		System.out.println("Saved to Database : "+customer.getFirstName());
		
		
	}

}
