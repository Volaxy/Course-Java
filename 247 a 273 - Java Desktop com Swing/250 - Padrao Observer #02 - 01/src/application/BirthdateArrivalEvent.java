package application;

import java.util.Date;

public class BirthdateArrivalEvent {
	
	private final Date moment;

	public BirthdateArrivalEvent(Date moment) {
		this.moment = moment;
	}

	public Date getMoment() {
		return moment;
	}
	
}
