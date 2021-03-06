package application;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Doorman {
	
	private List<ArrivalObserverBithdate> arrivals = new ArrayList<ArrivalObserverBithdate>();
	
	public void addArrival(ArrivalObserverBithdate arrival) {
		arrivals.add(arrival);
	}
	
	public void monitor() {
		Scanner sc = new Scanner(System.in);
		
		String value = "";
		while(!"exit".equalsIgnoreCase(value)) {
			System.out.println("The birthdate boy has arrived?");
			value = sc.nextLine();
			
			if(value.equalsIgnoreCase("yes")) {
				//Criar o evento
				BirthdateArrivalEvent event = new BirthdateArrivalEvent(new Date());
				
				//Notifica os observadores
				arrivals.forEach(a -> a.came(event));
				
				break;
			} else {
				System.out.println("false alarm");
			}
		}
		
		sc.close();
	}
	
}
