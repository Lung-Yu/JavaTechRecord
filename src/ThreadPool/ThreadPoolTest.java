package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {

	public static void main(String[] args) {
		final int THREAD_COUNT = 1000;
		
		Runtime runtime = Runtime.getRuntime();
		
		runtime.gc();	//執行垃圾回收器，可以減少誤差
		long freeMemory = runtime.freeMemory();
		long currentTime = System.currentTimeMillis();
		for(int i=0;i<THREAD_COUNT;i++)	new Thread(new TempThread()).start();
		System.out.println("建立 "+THREAD_COUNT+"個執行緒，所佔用記憶體 \t" + (freeMemory - runtime.freeMemory()) + " bits");
		System.out.println("建立 "+THREAD_COUNT+"個執行緒，所消耗時間\t" + (System.currentTimeMillis() - currentTime) + " ms");
		
		runtime.gc();
		freeMemory = runtime.freeMemory();
		currentTime = System.currentTimeMillis();
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		for(int i=0;i<THREAD_COUNT;i++)	executorService.submit(new TempThread());
		System.out.println("POOL "+THREAD_COUNT+"個執行緒，所佔用記憶體 \t" + (freeMemory - runtime.freeMemory())+ " bits");
		System.out.println("POOL "+THREAD_COUNT+"個執行緒，所消耗時間\t" + (System.currentTimeMillis() - currentTime) + " ms");
		
		executorService.shutdownNow();
	}
}
