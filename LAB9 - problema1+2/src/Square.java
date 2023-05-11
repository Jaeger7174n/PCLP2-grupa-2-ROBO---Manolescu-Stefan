
public class Square extends Rectangle {

	private double side;
	public Square() {
		super();
	}

	public Square(double side) {
		super(side, side);
		// TODO Auto-generated constructor stub
	}

	public Square(double side, String color, boolean filled) {
		super(color, filled, side, side);
		// TODO Auto-generated constructor stub
	}
	public double getSide() {
		return this.side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	
	public String toString() {
		return ("Square of side: " + this.getSide() + ", color: " + super.getColor() + " and is filled: " + super.isFilled());
	}
}
