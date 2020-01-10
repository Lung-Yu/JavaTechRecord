package CalcShape;

public class Test {
	public static void main(String[] args) {
		
		Circle circle = new Circle(1);
		System.out.println("圖形的名稱是 : " + circle.getName());
		System.out.println("圖形的面積是 : " + circle.getArea());
		
		Rectangle rectangle = new Rectangle(2, 4);
		System.out.println("圖形的名稱是 : " + rectangle.getName());
		System.out.println("圖形的面積是 : " + rectangle.getArea());
	}
}
