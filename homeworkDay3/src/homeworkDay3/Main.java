package homeworkDay3;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Miraç");
		student.setLastName("Korkmaz");
		student.setEmail("mirac@mirac.com");
		student.setLessons("Java + React");
		student.setCardInfo("77777 Card");
		
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroð");
		instructor.setEmail("engin@engin.com");
		instructor.setAbility("PMP - ### - ###");
		instructor.setBranch("Computer & Software");
		instructor.setCourse("Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)");
		instructor.setSalary(1324);
		
		UserManager userManager = new UserManager();
		userManager.add(new FileLogger(), instructor);
		userManager.delete(new DatabaseLogger(), student);
		
		StudentManager studentManager = new StudentManager();
		studentManager.addCard(student);
		studentManager.addLesson(student);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourse(instructor);
		instructorManager.addAbility(instructor);
	}

}
