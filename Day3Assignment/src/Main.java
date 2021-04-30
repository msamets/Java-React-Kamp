
public class Main {

	public static void main(String[] args) {//kodlarýn çalýþýp çalýþmadýðýnýn denemesini yapýyorum 
		User user1 = new User();
		user1.set(1);
		user1.setaddress("Ýstanbul");
		user1.setcreditCard(new CreditCard("9999","Ahmet",999));
		user1.setemail("blablabla@gmail.com");
		user1.setfirstName("Ahmet");
		user1.setlastName("Yýldýz");
		
		System.out.println(user1.getaddress());
		
		User user2 = new User(2,"Veli","Keskin","bla@gmail.com","Çankýrý",new CreditCard("9999","Veli",999));
		
		System.out.println(user2.getcreditCardOwnerName());
		
		Student student1 = new Student();
		student1.setemail("student@gmail.com");
		
		System.out.println(student1.getemail());
		
		Student student2 = new Student(4,"Öðrenci","Öðrenemeyen","bbbb@gmail.com", "Antalya",new CreditCard("1111","Öðrenci",999),"Java and REACT kursu","Yazýlýmcý community aboneliði" );
		
		System.out.println(student2.getjoinedCourse());
		
		Instructor instructor1 = new Instructor();
		instructor1.setbranch("Frontend Developer");
		
		System.out.println(instructor1.getbranch());
		
		Instructor instructor2 = new Instructor(5,"Engin","Demiroð","Engindemirog@gmail.com","Ankara",new CreditCard("1111", "Engin", 999), "Java and React","C# , java and more","software consultant","blablabla");
		System.out.println(instructor2.getprogLanguage());
		
		
		UserManager userManager = new UserManager();
		userManager.addToCreditCard(new CreditCard("99999","Samet SÖNMEZ",999));
		
		StudentManager studentManager = new StudentManager();
		studentManager.addToAddress();
		studentManager.addToCourse("C# Angular");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.linkToMyTeachableAcc();
		instructorManager.addToProgLanugage("Java");
		
		
		
	}

}
