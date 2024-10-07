package ocp;

public class Square extends Figure {
	float lenght;
	
	public Square(float lenght) {
		super();
		this.lenght = lenght;
	}

	public void draw() {
		System.out.println("Square");
	}
	
	public float getArea() {
		return this.lenght*this.lenght;
	}
}
