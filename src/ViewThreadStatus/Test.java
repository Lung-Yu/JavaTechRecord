package ViewThreadStatus;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		ThreadState state = new ThreadState();
		Thread thread = new Thread(state);
		
		System.out.println("新增執行續  : " + thread.getState());
		thread.start();
		System.out.println("啟動執行續  : " + thread.getState());
		Thread.sleep(100);
		System.out.println("計時等待  : " + thread.getState());
		Thread.sleep(1000);
		System.out.println("等待中的執行續  : " + thread.getState());
		state.notifyNow();
		System.out.println("喚醒執行續  : " + thread.getState());
		Thread.sleep(1000);
		System.out.println("中止執行續  : " + thread.getState());
		
	}
}
