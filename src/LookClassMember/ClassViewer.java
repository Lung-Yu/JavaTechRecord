package LookClassMember;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassViewer {

	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> clazz = Class.forName("java.util.ArrayList");
		System.out.println("���O���зǦW�� : " +clazz.getCanonicalName() );
		
		System.out.println("���O �غc��k");
		for(Constructor constructor : clazz.getConstructors())
			System.out.println("\t" + constructor);
		System.out.println();
		
		System.out.println("���O�D�~�Ӥ��ϰ��ܼ�");
		for(Field field : clazz.getDeclaredFields())
			System.out.println("\t" + field);
		System.out.println();
		
		System.out.println("���O�D�~�Ӥ���k�W��");
		for(Method method : clazz.getDeclaredMethods())
			System.out.println("\t" + method);
		System.out.println();
		
	}
}
