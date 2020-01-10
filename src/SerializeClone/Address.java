package SerializeClone;

import java.io.Serializable;

public class Address implements Serializable{
	private static final long serialVersionUID = 4983187287403615604L;
	private String stateString;
	private String cityString;
	
	public Address(String state,String city) {
		this.stateString = state;
		this.cityString = city;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("°ê®a:" + stateString);
		sb.append(" " + cityString);
		return sb.toString();
	}
}
