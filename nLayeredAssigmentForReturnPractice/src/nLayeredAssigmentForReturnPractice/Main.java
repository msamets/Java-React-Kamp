package nLayeredAssigmentForReturnPractice;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

import nLayeredAssigmentForReturnPractice.Core.Adapters.AuthServiceAdapter;
import nLayeredAssigmentForReturnPractice.Core.Adapters.FacebookAuthManagerAdapter;
import nLayeredAssigmentForReturnPractice.Core.Adapters.GoogleAuthManagerAdapter;
import nLayeredAssigmentForReturnPractice.business.abstracts.UserService;
import nLayeredAssigmentForReturnPractice.business.concretes.MailSender;
import nLayeredAssigmentForReturnPractice.business.concretes.SmsSender;
import nLayeredAssigmentForReturnPractice.business.concretes.UserManager;
import nLayeredAssigmentForReturnPractice.dataAccess.concretes.HibernateUserDao;
import nLayeredAssigmentForReturnPractice.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		
		//regex expression codes==>
		/*
		 * password ==>^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(.*[@#$%^&+=])?(?=\S+$).{6,}$
	 	*^                 # start-of-string
		*(?=.*[0-9])       # a digit must occur at least once
		*(?=.*[a-z])       # a lower case letter must occur at least once
		*(?=.*[A-Z])       # an upper case letter must occur at least once
		*(?=.*[@#$%^&+=])  # a special character must occur at least once
		*(?=\S+$)          # no whitespace allowed in the entire string
		*.{8,}             # anything, at least eight places though
		*$                 # end-of-string
		*
		*********ÖNEMLÝ NOKTA TÜRKÇE KARAKTERLERÝN KULLANILABÝLMESÝ ÝÇÝN GEREKEN ÞEY==>
		*   \p{L} matches any kind of letter from any language
		*
		*name surname ==> ^\p{L}{2,}$
		*	
		*email ==>^([\p{L}\d(?=\S+$)\.-]+)@([a-z\d-]+)\.([a-z]{2,8})(\.[a-z]{2,8})?$
		*hepsinin sonuna case insensitive getir mesela þöyle==>
		*"^([\p{L}\d(?=\S+$)\.-]+)@([a-z\d-]+)\.([a-z]{2,8})(\.[a-z]{2,8})?$"i; tarzýnda
		 */
		/*
		Scanner scn = new Scanner(System.in);
		String nameRegex = "^\\p{L}{2,}$";
		String emailRegex = "^([\\p{L}\\d(?=\\S+$)\\.-]+)@([a-z\\d-]+)\\.([a-z]{2,8})(\\.[a-z]{2,8})?$";
		String passwordRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(.*[@#$%^&+=])?(?=\\S+$).{6,}$";
		Pattern pattern = Pattern.compile(passwordRegex, Pattern.UNICODE_CHARACTER_CLASS);
		
		System.out.println("Enter:");
		String example = scn.next();
		//if(pattern.matcher(example).matches())böyle de kullanýlabilir
		if(pattern.matches(emailRegex, example)) {//böyle de
			System.out.println("valid");
		}
		else {
			System.out.println("invalid");
		}
		*/
		//regex kullanýmý böyle
		ArrayList<User> users = new ArrayList<User>();
		UserService userManager  = new UserManager(new FacebookAuthManagerAdapter(),new MailSender(),new HibernateUserDao());
		userManager.signUp(new User("Samet","Sönmez","sqya147@gmail.com","ahmet?YILDIZ06"), users);
		System.out.println();
		userManager.loginUpWithAnotherApp("sqya147@gmail.com", "ahmet?YILDIZ06", users);
		System.out.println();
		userManager.signUpWithAnotherApp("Bengu@gmail.com", "Bengu123456", new User("Bengü","Gürsoy","bengu@gmail.com","benguGURSOY_35"), users);
		System.out.println();
		userManager.loginUpWithAnotherApp("Bengu@gmail.com", "Bengu123456", users);
		System.out.println();
		
		UserService userManager1 = new UserManager(new GoogleAuthManagerAdapter(),new SmsSender(),new HibernateUserDao());
		userManager1.signUp(new User("Samet","Sönmez","sqya147@gmail.com","ahmet?YILDIZ06"), users);
		System.out.println();
		userManager1.signUp(new User("Ece","Kalender","ece_3435@windowslive.com","izmirli_ECE35"), users);
		
		
	}

}
