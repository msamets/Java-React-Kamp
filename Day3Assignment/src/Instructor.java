
public class Instructor extends User {
	private String givenCourse;
	private String progLanguage;
	private String branch;
	private String shortBio;
	
	public Instructor() {
		
	}
	
	public Instructor(int id, String firstName, String lastName, String email, String address, CreditCard creditCard,
						String givenCourse, String progLanguage, String branch, String shortBio) {
		super(id, firstName, lastName, email, address, creditCard);
		this.givenCourse = givenCourse;
		this.progLanguage = progLanguage;
		this.branch = branch;
		this.shortBio = shortBio;
	}
	
	public String getgivenCourse() {
		return givenCourse;
	}
	public void setgivenCourse(String givenCourse) {
		this.givenCourse = givenCourse;
	}
	public String getprogLanguage() {
		return progLanguage;
	}
	public void setprogLanguage(String progLanguage) {
		this.progLanguage = progLanguage;
	}
	public String getbranch() {
		return branch;
	}
	public void setbranch(String branch) {
		this.branch = branch;
	}
	public String getshortBio() {
		return shortBio;
	}
	public void setshortBio(String shortBio) {
		this.shortBio = shortBio;
	}

}
