package DaemonThread;

public class Timer implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		long currentTime = System.currentTimeMillis();
		long processTime = 0;
		
		while(true) {
			if((System.currentTimeMillis() - currentTime) > processTime) {
				processTime = System.currentTimeMillis() - currentTime;
				System.out.println("�{������ɶ� : " + processTime);
			}
		}
	}

}
