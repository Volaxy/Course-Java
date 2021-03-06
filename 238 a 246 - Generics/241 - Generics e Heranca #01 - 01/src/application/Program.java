package application;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box = new Box();
		
		box.save(123);
		
		Integer c1 = box.open();
		System.out.println(c1);
	}

}
