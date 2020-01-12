package ThreadPool;

public class TempThread implements Runnable{

	private int id = 0;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		id++;
	}

}
