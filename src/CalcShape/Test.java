package CalcShape;

public class Test {
	public static void main(String[] args) {
		
		Circle circle = new Circle(1);
		System.out.println("�ϧΪ��W�٬O : " + circle.getName());
		System.out.println("�ϧΪ����n�O : " + circle.getArea());
		
		Rectangle rectangle = new Rectangle(2, 4);
		System.out.println("�ϧΪ��W�٬O : " + rectangle.getName());
		System.out.println("�ϧΪ����n�O : " + rectangle.getArea());
	}
}
