package ModifyThreadPriority;

import java.util.Scanner;

public class ThreadPriorityTest {
	
	private static Thread[] getThreads() {
		ThreadGroup group = Thread.currentThread().getThreadGroup();
		Thread[] threads = new Thread[group.activeCount()];
		group.enumerate(threads);
		
		return threads;
	}
	
	private static void showThreadsPriority() {
		Thread[] threads = getThreads();
		
		System.out.println("*****************������*****************");
		System.out.println("ID\tName\tPriority");
		for(Thread thread : threads)
			System.out.println(thread.getId() + "\t" + thread.getName() + "\t" + thread.getPriority());
		System.out.println("**************************************");
		
	}
	
	private static void modifyPriority(int id,int priorityValue) {
		Thread[] threads = getThreads();
		
		for(Thread thread : threads) 
			if(thread.getId() == id)
				thread.setPriority(priorityValue);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		showThreadsPriority();
		
		System.out.print("�п�J���ק蠟������ ID ( �Y���}�{���п�J -1 )");
		int id = scanner.nextInt();
		while(id > 0) {
			System.out.print("�п�J�ק諸�u������(1~10)");
			int priorityValue = scanner.nextInt();
			modifyPriority(id, priorityValue);
			
			showThreadsPriority();	
			System.out.println("�п�J���ק蠟������ ID ");
			id = scanner.nextInt();
		}
		
		System.out.println("Done.");
	}
}
