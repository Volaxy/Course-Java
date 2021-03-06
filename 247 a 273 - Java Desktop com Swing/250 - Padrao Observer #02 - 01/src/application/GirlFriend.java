package application;

public class GirlFriend implements ArrivalObserverBithdate {
	
	public void came(BirthdateArrivalEvent event) {
		System.out.println("Warn guests");
		System.out.println("Turn off the lights");
		System.out.println("Wait a little");
		System.out.println("and...SURPRISE!");
	}

}
