package ClassOderby;

import java.util.TreeSet;

import javax.swing.JComponent;
import javax.swing.JPanel;

public class Test {
	public static void main(String[] args) {
		TreeSet<Class<?>> treeSet = new TreeSet<Class<?>>(new ClassComparator());
		System.out.println("向樹集中增加  JPanel.class");
		treeSet.add(JPanel.class);
		System.out.println("向樹集中增加  JComponent.class");
		treeSet.add(JComponent.class);
		System.out.println("獲得樹集合的最後一個元素");
		System.out.println(treeSet.last());
		
		System.out.println();
		for(Class<?> clazz : treeSet)
			System.out.println(clazz.getName());
	}
}
