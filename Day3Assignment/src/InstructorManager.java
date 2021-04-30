
public class InstructorManager extends UserManager{
	
	public void startToCourse(String courseName) {
		System.out.println(courseName+" Kursu başlatıldı.");
	}
	public void addToProgLanugage(String progLanguage) {
		System.out.println(progLanguage+" programlama dili eklendi");
	}
	public  void changeToProgLanguage(String progLanguage) {
		System.out.println(progLanguage+" programlama dili olarak değiştirildi");
	}
	public void addToBranch(String branch) {
		System.out.println(branch+" branşlarınıza eklendi");
	}
	public void changeToBranch(String branch){
		System.out.println(branch+" olarak branşınız değiştirildi.");
	}
	public void addToShortBio() {
		System.out.println("Kısa biyoğrafiniz eklendi.");
	}
	public void changeToShortBio() {
		System.out.println("Kısa biyoğrafiniz değiştirildi.");
	}
}
