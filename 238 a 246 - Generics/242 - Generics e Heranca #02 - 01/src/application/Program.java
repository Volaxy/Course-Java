package application;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Integer> box1 = new Box<Integer>();
		box1.save(123);
		System.out.println(box1.open());
		
		Box<Double> box2 = new Box<Double>();
		box2.save(123.4);
		System.out.println(box2.open());
	}

}
