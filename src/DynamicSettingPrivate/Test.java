package DynamicSettingPrivate;

import java.lang.reflect.Field;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		Class<?> clazz = student.getClass();
		
		try {
			Field id = clazz.getDeclaredField("id");
			System.out.println("�]�w�e�� id = " + student.getId());
			id.setAccessible(true);
			id.setInt(student, 10);
			System.out.println("�]�w�᪺ id = " + student.getId());
			System.out.println();
			
			Field name = clazz.getDeclaredField("name");
			System.out.println("�]�w�e�� name = " + student.getName());
			name.setAccessible(true);
			name.set(student, "haha");
			System.out.println("�]�w�᪺ name = " + student.getName());
			System.out.println();
			
			Field male = clazz.getDeclaredField("male");
			System.out.println("�]�w�e�� male = " + student.isMale());
			male.setAccessible(true);
			male.setBoolean(student, true);
			System.out.println("�]�w�᪺ male = " + student.isMale());
			System.out.println();
			
			Field account = clazz.getDeclaredField("account");
			System.out.println("�]�w�e�� account = " + student.getAccount());
			account.setAccessible(true);
			account.setDouble(student, 148.24);
			System.out.println("�]�w�᪺ account = " + student.getAccount());
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
