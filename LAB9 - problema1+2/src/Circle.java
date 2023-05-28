
public class Circle extends Shape {

	private static final double PI = 3.14159265;
	private double radius;
	public Circle() {
		super();
		this.radius = 1;
	}
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}
	public double getRadius() {
		return this.radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return PI*this.radius*this.radius;
	}
	public double getPerimeter() {
		return 2*PI*this.radius;
	}
	public String toString() {
		return ("Circle of radius: " + this.getRadius() + "; color: " + super.getColor() + " and is filled: " + super.isFilled());
	}
}
