package homeworkDay3;

public class Instructor extends User{
	
	private double salary;
	private String branch;
	private String ability;
	private String course;
	
	public Instructor() {
		
	}

	public Instructor(double salary, String branch, String ability, String course) {
		super();
		this.salary = salary;
		this.branch = branch;
		this.ability = ability;
		this.course = course;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getAbility() {
		return ability;
	}

	public void setAbility(String ability) {
		this.ability = ability;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
}
