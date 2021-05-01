package homeworkDay3;

public class UserManager {
	
	public void add(Logger logger, User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " added");
		logger.log();
	}

	public void delete(Logger logger, User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " deleted");
		logger.log();
	}

	public void update(Logger logger, User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " updated");
		logger.log();
	}
}
