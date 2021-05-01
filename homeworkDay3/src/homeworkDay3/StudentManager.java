package homeworkDay3;

public class StudentManager {
	
	public void addCard(Student student) {
		System.out.println(student.getCardInfo() + " card added");
	}
	
	public void addLesson(Student student) {
		System.out.println(student.getLessons() + " added to your lessons");
	}
}
