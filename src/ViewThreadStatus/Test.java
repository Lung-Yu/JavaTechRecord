package ViewThreadStatus;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		ThreadState state = new ThreadState();
		Thread thread = new Thread(state);
		
		System.out.println("�s�W������  : " + thread.getState());
		thread.start();
		System.out.println("�Ұʰ�����  : " + thread.getState());
		Thread.sleep(100);
		System.out.println("�p�ɵ���  : " + thread.getState());
		Thread.sleep(1000);
		System.out.println("���ݤ���������  : " + thread.getState());
		state.notifyNow();
		System.out.println("���������  : " + thread.getState());
		Thread.sleep(1000);
		System.out.println("���������  : " + thread.getState());
		
	}
}
