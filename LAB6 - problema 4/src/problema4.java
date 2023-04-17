

public class problema4 {

	

	public static void main(String[] args) {
		ComplexNumber a = new ComplexNumber(-1,4);
		ComplexNumber b = new ComplexNumber(2,3);
		
		System.out.println(a.add(3,5).toString());
		System.out.println(a.add(b).toString());
		System.out.println(a.addRe(3).toString());
		System.out.println(a.addIm(5).toString());
		System.out.println(a.subtract(3,5).toString());
		System.out.println(a.subtract(b).toString());
		System.out.println(a.subtractRe(3).toString());
		System.out.println(a.subtractIm(5).toString());
		System.out.println(a.absValue());
	}

}
