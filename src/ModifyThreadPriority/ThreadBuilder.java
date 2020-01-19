package ModifyThreadPriority;

import java.util.ArrayList;
import java.util.List;

public class ThreadBuilder {
	private List<Thread> threads = null;
	private class UnitThread implements Runnable{

		private static final int RUN_COUNT = 60; 
		private String name;
		public UnitThread(String name) {
			// TODO Auto-generated constructor stub
			this.name = name;
		}
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			int id = 0;
			
			while(id < RUN_COUNT) {
				id++;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

	public ThreadBuilder(int count) {
		threads = new ArrayList<Thread>();
		
		for(int i=0;i<count ;i++) {
			Thread thread = new Thread(new UnitThread("thread " + i));
			thread.start();
			getThreads().add(thread);
		}
	}

	public List<Thread> getThreads() {
		return threads;
	}
}
