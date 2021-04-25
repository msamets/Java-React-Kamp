package oopHomework;

public class Main {

	public static void main(String[] args) {
		
		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Kurslarým";
		
		Category category2 = new Category(2, "Tüm Kurslar");
		
		Category[] categorys = {category1, category2};
		
		for (Category category : categorys) {
			System.out.println(category.name);
			
		}
		
		Course course1 = new Course();
		course1.id = 1;
		course1.name = "Yazýlým Geliþtirici Kampý(C# + Angular)";
		course1.teacher = "Engin Demirog";
		course1.completionRate = 32;
		
		Course course2 = new Course(2, "Yazýlým Geliþtirici Kampý(Java +REACT)", "Engin Demiorg", 100);
		
		Course[] courses = {course1, course2};
		
		for(Course course : courses) {
			System.out.println(course.name);
			System.out.println(course.teacher);
			System.out.println(course.completionRate);
			System.out.println(" ");
		}
		
		CourseService courseservice = new CourseService();
		courseservice.addToComment();
		
		GeneralService generalservice = new GeneralService();
		generalservice.addToCreditCard();
		
		

	}

}
