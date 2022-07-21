package facadePat;

public class Test {

	public static void main(String[] args) {
		Circle c=new Circle();
		Square s=new Square();
		Rectangle r=new Rectangle();
		c.draw();
		s.draw();
		r.draw();
		
		
		ShapeMaker sm=new ShapeMaker();
		sm.drawCircle();
		sm.drawRectangle();
		sm.drawSquare();

	}

}
