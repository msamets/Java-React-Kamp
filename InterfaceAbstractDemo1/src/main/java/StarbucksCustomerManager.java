import java.net.MalformedURLException;

public class StarbucksCustomerManager extends BaseCustomerManager   {
	
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}



	@Override
	public void Save(Customer customer) throws MalformedURLException {
		if(customerCheckService.tcKimlikNoDogrula(customer)){
			//mernise baðlanma 
			//System.out.println("Kullanýcý kaydedildi : "+customer.getFirstName());
			super.Save(customer);
		}
		else {
			System.out.println("Not a valid person.");
		}
		
	}
	/*
	private void CheckIfRealPerson(Customer customer) {
		//Mernis kontrol kodlarý buraya yazýlabilir
		//mernis baðlanma kodlarý 
		//bunu burada koymayacaksýn çünkü solid in s si
		//bu buraya uymaz
		//bunu interface e alýcaz
	}
	*/



	public boolean tcKimlikNoDogrula(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

	

	
}
