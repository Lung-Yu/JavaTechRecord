package SerializeClone;

import static java.lang.System.out;

public class Test {
	public static void main(String[] args) {
		
		out.println("�ƻs�e  : ");
		Address address = new Address("�x�W", "�x�n");
		Employee employee1 = new Employee("OO���", 18, address);
		out.println("���u1��T : ");
		out.println(employee1);
		
		out.println("�ƻs�� : ");
		Employee employee2 = employee1.clone();
		out.println("���u2��T : ");
		out.println(employee2);
	}
}
