package application;

public class SurpriseBirthday {

	public static void main(String[] args) {
		//GirlFriend girlFriend = new GirlFriend();
		Doorman doorman = new Doorman();
		
		//doorman.addArrival(girlFriend);
		doorman.addArrival(e -> System.out.println("SURPRISE!!!"));
		doorman.monitor();
	}
	
}
