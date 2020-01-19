package ThreadLock;

public class DeadLock implements Runnable{
	private boolean flag;
	private static final Object obj1 = new Object();
	private static final Object obj2 = new Object();
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + ": flag = " + flag);
		
		if(flag){
			synchronized (obj1) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("進入同步區塊 obj1 準備進入 obj2");
				synchronized (obj2) {
					System.out.println(threadName + " 已經進入同步區塊 obj2");
				}
			}
		}else {
			synchronized (obj2) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("進入同步區塊 obj2 準備進入 obj1");
				synchronized (obj1) {
					System.out.println(threadName + " 已經進入同步區塊 obj1");
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		DeadLock d1 = new DeadLock();
		DeadLock d2 = new DeadLock();
		
		d1.flag = true;
		d2.flag = false;
		
		new Thread(d1).start();
		new Thread(d2).start();
	}
	
}

