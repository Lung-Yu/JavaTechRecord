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
			System.out.println("年齡變數成功定義為 ，初始值為18");
			String sexString = "女";
			System.out.println("性別變數成功定義為 ，初始值為女");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
}
