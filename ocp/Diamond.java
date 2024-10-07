package ocp;

public class Diamond extends Figure {
	
	float diagonalHandia;
	float diagonalTxikia;

	public Diamond(float diagonalHandia, float diagonalTxikia) {
		super();
		this.diagonalHandia = diagonalHandia;
		this.diagonalTxikia = diagonalTxikia;
	}

	public void draw() {
		System.out.println("Diamond");
	}
	
	public float getArea() {
		return this.diagonalHandia*this.diagonalTxikia;
	}
	
}
