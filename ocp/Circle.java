package ocp;

public class Circle extends Figure {
	float diameter;
	
	public Circle(float diameter) {
		super();
		this.diameter = diameter;
	}
	
	public void draw() {
		System.out.println("Circle");
	}
	
	public float getArea() {
		return (float) (3.14*(this.diameter/2)*(this.diameter/2));
	}
}
