package application;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoxObject bo = new BoxObject();
		
		bo.save(2.4);
		
		Integer thing = (Integer) bo.open();
		System.out.println(thing);
	}

}
