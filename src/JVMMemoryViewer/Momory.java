package JVMMemoryViewer;

import java.util.ArrayList;
import java.util.List;

public class Momory implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		List<GB> gbList = new ArrayList<GB>();
		while (true) {
			System.gc();
			int free = (int) Runtime.getRuntime().freeMemory();
			int total = (int) Runtime.getRuntime().totalMemory();
			int status = free * 100 / total;
			
			System.out.println("�i�ΰO����\t:\t" + free);
			System.out.println("�`�O����q\t:\t" + total);
			System.out.println("�O����ϥβv\t:\t" + status + "%");
			System.out.println();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			gbList.add(new GB());
		}
	}
	
	public static void main(String[] args) {
		new Thread(new Momory()).start();
	}
	
}
