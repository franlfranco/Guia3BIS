package ejercicio1;

public class Rectangle {

	private int width;
	private int height;
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public Rectangle() {
		setWidth(1);
		setHeight(0);
	}

	public float calculateArea(Rectangle rectangle) {
		float result = width * height;
		return result;
	}
	
	public float calculatePerimeter(Rectangle rectangle) {
		float result = 2 * width + 2 * height;
		return result;
	}
	
}
