package DaemonThread;

public class DaemonThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread userThread = new Thread(new Worker());
		Thread daemonThread = new Thread(new Timer());
		
		/*�Q�]�w��Daemon��������A�|�Q�H�ɤ��_�A
		 * �]���ФűN�ϥΨ�����񤧸귽(�pInput/Ouput Stream �B DB Connector)�������� �]�w�� Daemon = True. */
		daemonThread.setDaemon(true);
		userThread.start();
		daemonThread.start();
	}

}
