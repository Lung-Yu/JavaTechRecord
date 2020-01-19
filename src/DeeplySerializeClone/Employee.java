package DeeplySerializeClone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable{
	private static final long serialVersionUID = 3049633059823371192L;
	private String name;
	private int age;
	
	public Employee(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append("姓名 : " + name + " ");
		sb.append("年齡 : " + age + "\n");
		return sb.toString();
	}
	
	@Override
	protected Employee clone() {
		// TODO Auto-generated method stub
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
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return employee;
	}
}
