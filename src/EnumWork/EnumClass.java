package EnumWork;

public class EnumClass {
	public static void main(String[] args) {
		for(Size size : Size.values()) {
			System.out.println(size + " id is : " + size.ordinal());
			System.out.print(size.compareTo(size.SMALL) + " ");
			System.out.print(size.equals(Size.SMALL) + " ");
			System.out.print((size == size.SMALL ) + " ");
			System.out.println(size.name());
			System.out.println("*************************************");
		}
	}
}
