package ViewThreadStatus;

public class ThreadState implements Runnable {

	public synchronized void waitForASecond() throws InterruptedException {
		wait(500);
	}
	
	public synchronized void waitForYears() throws InterruptedException {
		wait();
	}
	
	public synchronized void notifyNow() {
		notify();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			waitForASecond();
			waitForYears();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
