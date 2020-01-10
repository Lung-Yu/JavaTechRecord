package SerializeClone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Cloneable,Serializable{

		private static final long serialVersionUID = 3049633059823371192L;
		private String nameString;
		private int age;
		private Address address;
		
		public Employee(String name,int age,Address address) {
			this.nameString = name;
			this.age = age;
			this.address = address;
		}
		
		@Override
		public String toString() {
		// TODO Auto-generated method stub
			StringBuilder sb = new StringBuilder();
			sb.append("©m¦W  : " + this.nameString);
			sb.append("¦~ÄÖ : " + this.age);
			sb.append("¦a§} : " + address );
			return address.toString();
		}
		
		@Override
		public Employee clone() {
			Employee employee = null;
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			
			try {
				ObjectOutputStream oos = new ObjectOutputStream(baos);
				oos.writeObject(this);
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
			try {
				ObjectInputStream ois = new ObjectInputStream(bais);
				employee = (Employee) ois.readObject();
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return employee;
		}
}
