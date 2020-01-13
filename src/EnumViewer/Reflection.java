package EnumViewer;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Reflection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<Position> enumClass = Position.class;
		String modifierString = Modifier.toString(enumClass.getModifiers());
		System.out.println("Enum «¬ºA­×¹¢²Å¸¹  :" + modifierString);
		System.out.println("enum super class : "+ enumClass.getSuperclass());
		System.out.println("enum method define by yourself:");
		for(Method method : enumClass.getDeclaredMethods())
			System.out.println(method);
	}

}
