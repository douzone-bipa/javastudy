package paint;

public class Main {
	public static void main(String[] args) {
		Point point1 = new Point();
		point1.setX(10);
		point1.setY(10);
		
		drawPoint(point1);
		// point1.disapear();
		point1.show(false);
		
		Point point2 = new ColorPoint();
		point2.setX(100);
		point2.setY(200);
		((ColorPoint)point2).setColor("red");
		drawPoint(point2);
		
		point2.show(false);
		point2.show(true);
		
		Triangle triangle = new Triangle();
		drawTriangle(triangle);
		
		Rectangle rect = new Rectangle();
		drawRectangle(rect);
		
		Circle circle = new Circle();
		drawCircle(circle);
	}
	
	public static void drawPoint(Point point) {
		point.show();
	}

//	public static void drawColorPoint(ColorPoint colorPoint) {
//		colorPoint.show();
//	}
	
	public static void drawTriangle(Triangle triangle) {
		triangle.draw();
	}
	
	public static void drawRectangle(Rectangle rectangle) {
		rectangle.draw();
	}

	public static void drawCircle(Circle circle) {
		circle.draw();
	}
	
}
