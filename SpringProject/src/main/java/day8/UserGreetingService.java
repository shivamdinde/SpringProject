package day8;

import day7.GreetingService;

public class UserGreetingService implements GreetingService {

	private String userName;
	private String greetingMessage;
	private int userAge;
	
	
	public UserGreetingService() {
		super();
	}

	public UserGreetingService(String userName, String greetingMessage, int userAge) {
		super();
		this.userName = userName;
		this.greetingMessage = greetingMessage;
		this.userAge = userAge;
	}
	
	
	public UserGreetingService(String greetingMessage, int userAge, String userName) {
		super();
		this.greetingMessage = greetingMessage;
		this.userAge = userAge;
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		System.out.println("Setting user name");
		this.userName = userName;
	}

	public String getGreetingMessage() {
		return greetingMessage;
	}

	public void setGreetingMessage(String greetingMessage) {
		System.out.println("Setting greeting message");
		this.greetingMessage = greetingMessage;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		System.out.println("Setting user age");
		this.userAge = userAge;
	}

	@Override
	public String sayGreeting() {
		String finalMessage = greetingMessage + " " + userName + ", your age is " + userAge;
		return finalMessage;
	}

}
