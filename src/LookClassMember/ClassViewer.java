package LookClassMember;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassViewer {

	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> clazz = Class.forName("java.util.ArrayList");
		System.out.println("類別的標準名稱 : " +clazz.getCanonicalName() );
		
		System.out.println("類別 建構方法");
		for(Constructor constructor : clazz.getConstructors())
			System.out.println("\t" + constructor);
		System.out.println();
		
		System.out.println("類別非繼承之區域變數");
		for(Field field : clazz.getDeclaredFields())
			System.out.println("\t" + field);
		System.out.println();
		
		System.out.println("類別非繼承之方法名稱");
		for(Method method : clazz.getDeclaredMethods())
			System.out.println("\t" + method);
		System.out.println();
		
	}
}
