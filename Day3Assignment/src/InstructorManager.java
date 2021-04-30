
public class InstructorManager extends UserManager{
	
	public void startToCourse(String courseName) {
		System.out.println(courseName+" Kursu baþlatýldý.");
	}
	public void addToProgLanugage(String progLanguage) {
		System.out.println(progLanguage+" programlama dili eklendi");
	}
	public  void changeToProgLanguage(String progLanguage) {
		System.out.println(progLanguage+" programlama dili olarak deðiþtirildi");
	}
	public void addToBranch(String branch) {
		System.out.println(branch+" branþlarýnýza eklendi");
	}
	public void changeToBranch(String branch){
		System.out.println(branch+" olarak branþýnýz deðiþtirildi.");
	}
	public void addToShortBio() {
		System.out.println("Kýsa biyoðrafiniz eklendi.");
	}
	public void changeToShortBio() {
		System.out.println("Kýsa biyoðrafiniz deðiþtirildi.");
	}
}
