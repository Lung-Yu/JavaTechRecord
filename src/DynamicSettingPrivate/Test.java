package DynamicSettingPrivate;

import java.lang.reflect.Field;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		Class<?> clazz = student.getClass();
		
		try {
			Field id = clazz.getDeclaredField("id");
			System.out.println("設定前的 id = " + student.getId());
			id.setAccessible(true);
			id.setInt(student, 10);
			System.out.println("設定後的 id = " + student.getId());
			System.out.println();
			
			Field name = clazz.getDeclaredField("name");
			System.out.println("設定前的 name = " + student.getName());
			name.setAccessible(true);
			name.set(student, "haha");
			System.out.println("設定後的 name = " + student.getName());
			System.out.println();
			
			Field male = clazz.getDeclaredField("male");
			System.out.println("設定前的 male = " + student.isMale());
			male.setAccessible(true);
			male.setBoolean(student, true);
			System.out.println("設定後的 male = " + student.isMale());
			System.out.println();
			
			Field account = clazz.getDeclaredField("account");
			System.out.println("設定前的 account = " + student.getAccount());
			account.setAccessible(true);
			account.setDouble(student, 148.24);
			System.out.println("設定後的 account = " + student.getAccount());
			System.out.println();
		} catch (NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

}
