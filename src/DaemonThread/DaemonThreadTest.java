package DaemonThread;

public class DaemonThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread userThread = new Thread(new Worker());
		Thread daemonThread = new Thread(new Timer());
		
		/*被設定為Daemon的執行續，會被隨時中斷，
		 * 因此請勿將使用到需釋放之資源(如Input/Ouput Stream 、 DB Connector)的執行續 設定為 Daemon = True. */
		daemonThread.setDaemon(true);
		userThread.start();
		daemonThread.start();
	}

}
