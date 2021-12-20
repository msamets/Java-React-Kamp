package nLayeredAssigmentForReturnPractice.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import nLayeredAssigmentForReturnPractice.Core.Adapters.AuthServiceAdapter;
import nLayeredAssigmentForReturnPractice.business.abstracts.SenderServiceForVerification;
import nLayeredAssigmentForReturnPractice.business.abstracts.UserService;
import nLayeredAssigmentForReturnPractice.dataAccess.abstracts.UserDao;
import nLayeredAssigmentForReturnPractice.entities.concretes.User;

public class UserManager implements UserService {
	//private ArrayList<User> users = new ArrayList<User>();
	//Mantýken bunu dýþarda tutmalýyým çünkü örneðin==>User arraylist i
	//UserManager class ý çaðýrdýk bu mailSender ve facebookAuth kullanýyor
	//kullanýcýyý oluþturdu yeni arraylist oluþturdu bunda bilgisini tuttu
	//þimdi biz smsSender ve googleAuth kullanmak istiyoruz bu classý
	//tekrar çaðýracaðýz o zaman baþka bir class örneði oluþturduðumuz
	//için bambaþka bir arraylist tutacak bunu istemiyorum bütün userlarýn
	//ortak tutulduðu arraylist istiyoruz o yüzden bunu mainde çaðýrýrým
	//zaten sqle geçince bunlarý direkt sql de yapacaðýz.
	
	AuthServiceAdapter authServiceAdapter;
	SenderServiceForVerification senderServiceForVerification;
	UserDao userDao;
	
	public UserManager(AuthServiceAdapter authServiceAdapter, SenderServiceForVerification senderServiceForVerification, UserDao userDao) {
		this.authServiceAdapter = authServiceAdapter;
		this.senderServiceForVerification = senderServiceForVerification;
		this.userDao = userDao;
	}
	
	
	
	@Override
	public void signUp(User user, List<User> users) {
		String nameRegex = "^\\p{L}{2,}$";
		String emailRegex = "^([\\p{L}\\d(?=\\S+$)\\.-]+)@([a-z\\d-]+)\\.([a-z]{2,8})(\\.[a-z]{2,8})?$";
		String passwordRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(.*[@#$%^&+=])?(?=\\S+$).{6,}$";
		Pattern pattern = Pattern.compile(nameRegex, Pattern.UNICODE_CHARACTER_CLASS);
		//Gereken regex kodlarýmýz
		//regex kodlarýnda regex101 sitesinde /böyle çalýþýyor
		//kodda ise //böyle okuyor 
		//kodda // olunca okumuyor deðil java dili böyle çalýþýyor
		//o yüzden // böyle kalsýn / böyle deðil.
		if(!pattern.matches(nameRegex, user.getFirstName())) {
			System.out.println("Kullanýcý adý geçerli deðil.Lütfen geçerli bir ad giriniz.");
			return ;
		}
		else if(!pattern.matches(nameRegex, user.getLastName())) {
			System.out.println("Kullanýcý soyadý geçerli deðil. Lütfen geçerli bir soyad giriniz.");
			return ;
		}
		
		boolean checkEmail = true;
		for (User user2 : users) {
			if(user.getEmail()==user2.getEmail()) {
				checkEmail = false;
			}
		}
		
		if(!checkEmail) {
			System.out.println("Girilen e-mail daha önce kullanýlmamýþ olmalý.Lütfen daha önce kullanýlmamýþ e-mail giriniz.");
			return ;
		}
		else if(!pattern.matches(emailRegex, user.getEmail())) {
			System.out.println("Girmiþ olduðunuz e-mail geçerli deðil.Lütfen baþka bir e-mail giriniz.");
			return ;
		}
		else if(!pattern.matches(passwordRegex, user.getPassword())) {
			System.out.println("Girmiþ olduðunuz þifre geçerli deðil."
					+ "Þifre en az 6 karakterden ve bir küçük bir büyük harf ve"
					+ "rakam içermek zorundadýr."
					+ "Lütfen geçerli bir þifre giriniz.");
			return ;
		}
		
		senderServiceForVerification.send(user);
		senderServiceForVerification.verificationSuccesfulInfoSend(user);
		
		users.add(user);
		userDao.add(user);
		//bunlarý yaptýktan sonra gerek olmadýðýný düþünüyorum
		//mainde testten sonra tekrar bir bakarým eðer hata varsa
		//user li newleteceðiz nasýl olacak tam bilmiyorum
		//yeni user i users(arraylist)e ekleyeceðiz
	}

	@Override
	public void login(String email, String password, List<User> users) {
		
		boolean check=false;
		for (User user : users) {
			if((email == user.getEmail()) && (password == user.getPassword()))
				check = true;
			
		}

		if(check)
				System.out.println("Giriþ baþarýlý.");
		else
				System.out.println("Böyle bir hesap bulunmamaktadýr.Lütfen bilgilerinizi kontrol edip tekrar deneyiniz.");
			
		
				
		
		
	}

	@Override
	public void signUpWithAnotherApp(String email, String password,User user, List<User> users) {
		String nameRegex = "^\\p{L}{2,}$";
		String emailRegex = "^([\\p{L}\\d(?=\\S+$)\\.-]+)@([a-z\\d-]+)\\.([a-z]{2,8})(\\.[a-z]{2,8})?$";
		String passwordRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(.*[@#$%^&+=])?(?=\\S+$).{6,}$";
		Pattern pattern = Pattern.compile(nameRegex, Pattern.UNICODE_CHARACTER_CLASS);
		//Gereken regex kodlarýmýz
		
		if(!pattern.matches(nameRegex, user.getFirstName())) {
			System.out.println("Kullanýcý adý geçerli deðil.Lütfen geçerli bir ad giriniz.");
			return ;
		}
		else if(!pattern.matches(nameRegex, user.getLastName())) {
			System.out.println("Kullanýcý soyadý geçerli deðil. Lütfen geçerli bir soyad giriniz.");
			return ;
		}
		
		boolean checkEmail = true;
		for (User user2 : users) {
			if(user.getEmail()==user2.getEmail()) {
				checkEmail = false;
			}
		}
		
		if(!checkEmail) {
			System.out.println("Girilen e-mail daha önce kullanýlmamýþ olmalý.Lütfen daha önce kullanýlmamýþ e-mail giriniz.");
			return ;
		}
		else if(!pattern.matches(emailRegex, user.getEmail())) {
			System.out.println("Girmiþ olduðunuz e-mail geçerli deðil.Lütfen baþka bir e-mail giriniz.");
			return ;
		}
		else if(!pattern.matches(passwordRegex, user.getPassword())) {
			System.out.println("Girmiþ olduðunuz þifre geçerli deðil."
					+ "Þifre en az 6 karakterden ve bir küçük bir büyük harf ve"
					+ "rakam içermek zorundadýr."
					+ "Lütfen geçerli bir þifre giriniz.");
			return ;
		}
		
		senderServiceForVerification.send(user);
		senderServiceForVerification.verificationSuccesfulInfoSend(user);
		
		users.add(user);
		userDao.add(user);
		
		authServiceAdapter.signup(email, password, user);
		
	}

	@Override
	public void loginUpWithAnotherApp(String email, String password, List<User> users) {
		boolean check=false;
		for (User user : users) {
			if((email == user.getEmail())&& (password == user.getPassword())) {
				check = true;
			}
		}
		if(check)
			authServiceAdapter.login(email, password);
		else
			System.out.println("Böyle bir hesap bulunmamaktadýr.Lütfen bilgilerinizi kontrol edip tekrar deneyiniz.");
		
	}
	
	
	
	
	
	
	

}
