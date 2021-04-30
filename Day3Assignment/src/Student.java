
public class Student extends User {
	private String takenCourse;
	private String subscription;
	
	
	public Student() {
		
	}
	
	public Student(int id, String firstName, String lastName, String email, String address, CreditCard creditCard,
					String takenCourse, String subscription) {
		super(id, firstName,  lastName, email, address,  creditCard);
		this.takenCourse = takenCourse;
		this.subscription = subscription;
	}
	
	
	public String getjoinedCourse() {
		return takenCourse;
	}
	public void setjoinedCourse(String joinedCourse) {
		this.takenCourse = joinedCourse;
	}
	public String getsubscription() {
		return subscription;
	}
	public void setsubcription(String subscription) {
		this.subscription = subscription;
	}
	
	
}
