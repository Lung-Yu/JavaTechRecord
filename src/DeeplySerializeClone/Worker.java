package DeeplySerializeClone;

public class Worker implements Cloneable{
	private String name;
	private int age;
	
	public Worker(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append("©m¦W : " + name + " ");
		sb.append("¦~ÄÖ : " + age + "\n");
		return sb.toString();
	}
	
	@Override
	protected Worker clone()  {
		// TODO Auto-generated method stub
		Worker worker = null;
		try {
			worker = (Worker) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return worker;
	}
}
