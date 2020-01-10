package Word2Unicode;

import static java.lang.System.out;

public class ToUnicode {
	public static void main(String[] args) {
		
		String codeString = toCode("¦n");
		out.println(codeString);
		out.println(toChar(Long.parseLong(codeString)));
	}
	
	
	private static String toCode(String textString) {
		char[] charArray = textString.toCharArray();
		
		StringBuilder builder = new StringBuilder();
		for(char c : charArray) {
			builder.append((int) c + "");
		}
		
		return builder.toString();
	}
	
	private static char toChar(Number valueNumber ) {
		long code = valueNumber.longValue();
		return (char)code;
	}
}
