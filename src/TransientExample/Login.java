package TransientExample;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Login implements Serializable{
//public class Login implements Cloneable{
	private static final long serialVerionUID = 12855161761717331L;
	private String username;
	private transient String password;	//only work on Serializable
	
	public Login(String username,String password) {
		this.username = username;
		this.password = password;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append("使用者名稱 : " + username);
		sb.append("密碼 : " + password);
		return sb.toString();
	}
	
	@Override
	protected Login clone() {
		// TODO Auto-generated method stub
		Login obj = null;
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
			obj = (Login) ois.readObject();
			ois.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return obj;
	}
	
//	@Override
//	protected Login clone()  {
//		// TODO Auto-generated method stub
//		Login obj = null;
//		try {
//			obj = (Login) super.clone();
//		} catch (CloneNotSupportedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return obj;
//	}
}
