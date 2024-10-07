package ocp;

public class Main {

	public static void main(String[] args) {
		
		Sheet sheet = new Sheet();
		
		sheet.addFigure(new Circle(2));
		sheet.addFigure(new Circle(3));
		
		sheet.addFigure(new Square(3));
		
		sheet.addFigure(new Diamond(2,3));

		sheet.drawFigures();
		
		System.out.println(sheet.getArea());
	}

}
