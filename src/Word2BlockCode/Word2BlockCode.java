package Word2BlockCode;

import static java.lang.System.out;

public class Word2BlockCode {
	public static void main(String[] args) {
		out.println(toBlockCode("§Ú"));
	}
	
	private static String toBlockCode(String textString) {
		if(textString.length() > 2) {
			return "Please do not put so many word.";
		}
		
		byte[] codeBit = textString.getBytes();
		if(codeBit.length < 2) {
			return "Please put Chinse word in this function.";
		}
		
		codeBit[0] -= 160;
		codeBit[1] -= 160;
		
		String codeString = formateNumber(codeBit[0]) + formateNumber(codeBit[1]);
		
		return codeString;
	}
	
	private static String formateNumber(int num) {
		String formateString = String.format("%02d", num);
		return formateString;
	}
}
