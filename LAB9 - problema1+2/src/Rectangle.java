
public class Rectangle extends Shape {

	private double width,length;
	public Rectangle() {
		super();
		this.width = 1;
		this.length = 1;
	}
	
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	public Rectangle(String color, boolean filled, double width, double length) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return this.width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getLength() {
		return this.length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.width*this.length;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*(this.length + this.width);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("Rectangle of width: " + this.getWidth() + ", length: " + this.getLength() + ", color: " + super.getColor() + " and is filled: " + super.isFilled());
	}

}
