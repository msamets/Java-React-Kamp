
public class StudentManager extends UserManager {
	//kurs ekle, abonelik ekle, abonelik çýkart;
	public void addToCourse(String courseName) {
		System.out.println(courseName+" Kursu eklendi.");
	}
	public void subscribe(String subscribeName) {
		System.out.println(subscribeName+" Aboneliði eklendi.");
	}
	public void unsubscribe(String subscribeName) {
		System.out.println(subscribeName+" Aboneliði iptal edildi.");
	}

}
