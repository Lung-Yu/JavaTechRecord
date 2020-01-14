package JVMMemoryViewer;

public class GB {
	private int ownId = 0; 
	private static int id = 0 ;
	public GB() {
		this.ownId = id;
		id++;
	}
}
