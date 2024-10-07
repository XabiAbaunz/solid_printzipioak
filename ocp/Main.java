package ocp;

public class Main {

	public static void main(String[] args) {
		
		Sheet sheet = new Sheet();
		
		sheet.addFigure(new Circle());
		sheet.addFigure(new Circle());
		
		sheet.addFigure(new Square());
		
		sheet.addFigure(new Diamond());

		sheet.drawFigures();
	}

}
