
public class problema1 {

	public static void main(String[] args) {
		paralelogram a = new paralelogram (3, 4, Math.PI / 6);
		dreptunghi b = new dreptunghi (3,4);
		patrat c = new patrat (3);
		romb d = new romb (3, Math.PI / 6);
		
		System.out.println(a.Aria());
		System.out.println(b.Aria());
		System.out.println(c.Aria());
		System.out.println(d.Aria());
	}

}
