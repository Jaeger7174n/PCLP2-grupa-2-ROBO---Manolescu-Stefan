
public class problema2 {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		Square sq = new Square();
		//Conversie 2
		Rectangle r = new Rectangle(5.0, 5.0);
		r = (Rectangle) sq;
		//Conversie 3
		sq = new Square(7.0);
		r = sq;

	}

}
