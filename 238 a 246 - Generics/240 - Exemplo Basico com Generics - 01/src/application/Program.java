package application;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoxObject<Double> bo = new BoxObject<>();
		
		bo.save(2.4);
		
		System.out.println(bo.open());
	}

}
