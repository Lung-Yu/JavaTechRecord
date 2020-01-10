package CalcShape;

public class Circle extends Shape{
	private double radius;
	
	public Circle(double radius) {
		// TODO Auto-generated constructor stub
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radius, 2);
	}
	
}
