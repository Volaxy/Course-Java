package application;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable t1 = new Trabalho();
		Runnable t2 = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 100; i++) {
					System.out.println("Tarefa #02");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};

		Runnable t3 = () -> {
			for (int i = 0; i < 100; i++) {
				System.out.println("Tarefa #03");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Runnable t4 = Program::t4;

		Thread v1 = new Thread(t1);
		v1.start();

		Thread v2 = new Thread(t2);
		v2.start();

		Thread v3 = new Thread(t3);
		v3.start();

		Thread v4 = new Thread(t4);
		v4.start();
	}

	static void t4() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Tarefa #03");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
