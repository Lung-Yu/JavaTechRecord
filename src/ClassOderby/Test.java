package ClassOderby;

import java.util.TreeSet;

import javax.swing.JComponent;
import javax.swing.JPanel;

public class Test {
	public static void main(String[] args) {
		TreeSet<Class<?>> treeSet = new TreeSet<Class<?>>(new ClassComparator());
		System.out.println("�V�𶰤��W�[  JPanel.class");
		treeSet.add(JPanel.class);
		System.out.println("�V�𶰤��W�[  JComponent.class");
		treeSet.add(JComponent.class);
		System.out.println("��o�𶰦X���̫�@�Ӥ���");
		System.out.println(treeSet.last());
		
		System.out.println();
		for(Class<?> clazz : treeSet)
			System.out.println(clazz.getName());
	}
}
