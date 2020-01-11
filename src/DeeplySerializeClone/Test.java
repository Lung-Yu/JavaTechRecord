package DeeplySerializeClone;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		final int CLONE_TIME = 10000000;
		long currentTime = 0;
		List<Worker> workers = new ArrayList<Worker>();
		List<Employee> employees = new ArrayList<Employee>();
		
		Worker worker = new Worker("worker", 16);
		Employee employee = new Employee("employee", 22);
	
		currentTime = System.currentTimeMillis();
		for(int i=0;i<CLONE_TIME;i++)
			workers.add(worker.clone());
		System.out.println("�ϥνƻs���k��{�ƻs�үӶO���ɶ� : ");
		System.out.println(System.currentTimeMillis() - currentTime + " ms");
		
		currentTime = System.currentTimeMillis();
		for(int i=0;i<CLONE_TIME;i++)
			employees.add(employee.clone());
		System.out.println("�ϥΧǦC�Ƥ�k��{�ƻs�үӶO���ɶ� : ");
		System.out.println(System.currentTimeMillis() - currentTime + " ms");
	
	}
}
