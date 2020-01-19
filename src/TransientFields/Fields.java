package TransientFields;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Fields implements Serializable{

	private static final long serialVerionUID = 12855161761717331L;
	
	
	private transient String string;
	private transient int _int;
	private transient double _double;
	private transient float _float;
	private transient char _char;
	private transient byte _byte;
	private transient short _short;
	private transient boolean _boolean;
	private transient long _long;
	
//	private String string;
//	private int _int;
//	private double _double;
//	private float _float;
//	private char _char;
//	private byte _byte;
//	private short _short;
//	private boolean _boolean;
//	private long _long;
	
	public Fields() {
		this.string = "lung yu";
	}
	
	public Fields(String string,int _int,double _double,float _float,char _char,byte _byte,short _short,boolean _boolean,long _long) {
		this.string = string;
		this._int = _int;
		this._double = _double;
		this._float = _float;
		this._char = _char;
		this._byte = _byte;
		this._short = _short;
		this._boolean = _boolean;
		this._long = _long;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append("string : " + string);
		sb.append("\tint : " + _int);
		sb.append("\tdouble : " + _double);
		sb.append("\nfloat : " + _float);
		sb.append("\tchar : " + _char);
		sb.append("\tbyte : " + _byte);
		sb.append("\nshort : " + _short);
		sb.append("\tboolean : " + _boolean);
		sb.append("\tlong : " + _long);
		return sb.toString();
	}
	
	@Override
	protected Fields clone() {
		// TODO Auto-generated method stub
		Fields obj = null;
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
			obj = (Fields) ois.readObject();
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
	
	public static void main(String[] args) {
		Fields fields = new Fields("tygr",5,6.7d,11.7f,'T',(byte)0x02,(short)0x09,true,125465126);
		System.out.println("輸出原始物件資訊");
		System.out.println(fields.toString());
		
		System.out.println("\n複製後物件資訊");
		Fields fields2 = fields.clone();
		System.out.println(fields2.toString());
	}
}
