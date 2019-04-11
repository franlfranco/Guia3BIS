package ejercicio1;

public class Main {

	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle(1, 0);
		
		System.out.println("Ancho: " + rectangle.getWidth());
		System.out.println("Alto: " + rectangle.getHeight());
		
		System.out.println("Area: " + rectangle.calculateArea(rectangle));
		System.out.println("Perimetro: " + rectangle.calculatePerimeter(rectangle));
		
		rectangle.setHeight(2);
		rectangle.setWidth(3);
		
		System.out.println("Area: " + rectangle.calculateArea(rectangle));
		System.out.println("Perimetro: " + rectangle.calculatePerimeter(rectangle));
		
		rectangle = new Rectangle();
		
		System.out.println("Area: " + rectangle.calculateArea(rectangle));
		System.out.println("Perimetro: " + rectangle.calculatePerimeter(rectangle));
		
	}

}
