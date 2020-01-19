package SerializeClone;

import static java.lang.System.out;

public class Test {
	public static void main(String[] args) {
		
		out.println("複製前  : ");
		Address address = new Address("台灣", "台南");
		Employee employee1 = new Employee("OO科技", 18, address);
		out.println("員工1資訊 : ");
		out.println(employee1);
		
		out.println("複製後 : ");
		Employee employee2 = employee1.clone();
		out.println("員工2資訊 : ");
		out.println(employee2);
	}
}
