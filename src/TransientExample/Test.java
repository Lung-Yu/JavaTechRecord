package TransientExample;

public class Test {
	public static void main(String[] args) {
		Login login = new Login("Lung yu tsai", "tygr123456");
		System.out.println("輸出原始資訊");
		System.out.println(login.toString());
		
		Login login2 = login.clone();
		System.out.println(login2.toString());
	}
}
