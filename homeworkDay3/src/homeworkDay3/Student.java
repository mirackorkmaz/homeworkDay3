package homeworkDay3;

public class Student extends User{
	
	private String lessons;
	private String cardInfo;
	
	public Student() {
		
	}

	public Student(String lessons, String cardInfo) {
		super();
		this.lessons = lessons;
		this.cardInfo = cardInfo;
	}

	public String getLessons() {
		return lessons;
	}

	public void setLessons(String lessons) {
		this.lessons = lessons;
	}

	public String getCardInfo() {
		return cardInfo;
	}

	public void setCardInfo(String cardInfo) {
		this.cardInfo = cardInfo;
	}
	
	
}
