package RedirectOutput;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class RedirectOutputStream {
	
	public static void main(String[] args) {
		PrintStream out = System.out;
		
		try {
			PrintStream ps = new PrintStream(".log.txt");
			System.setOut(ps);
			
			int age = 18;
			System.out.println("�~���ܼƦ��\�w�q�� �A��l�Ȭ�18");
			String sexString = "�k";
			System.out.println("�ʧO�ܼƦ��\�w�q�� �A��l�Ȭ��k");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
}
