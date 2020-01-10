package CalcShape;

public class Rectangle extends Shape{
	private double length;
	private double width;
	
	public Rectangle(double length,double width) {
		// TODO Auto-generated constructor stub
		this.length = length;
		this.width = width;
	}
	
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return length * width;
	}
	
}
