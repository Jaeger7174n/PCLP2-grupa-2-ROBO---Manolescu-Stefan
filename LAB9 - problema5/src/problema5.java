
public class problema5 {

	public static void main(String[] args) {
		Tren t1 = new Tren();
		Tren t2 = new Tren();
		
		Marfa m = new Marfa();
		CalatoriA a = new CalatoriA();
		CalatoriB b = new CalatoriB();
	
		
		t1.addVagon(b,b.type);
		/*t1.addVagon(a,a.type);
		t1.addVagon(a,a.type);
		t1.addVagon(m,m.type);
		t1.addVagon(a,a.type);*/
		
		//t2.addVagon(m,m.type);
		/*t2.addVagon(m,m.type);
		t2.addVagon(b,b.type);
		t2.addVagon(b,b.type);
		t2.addVagon(b,b.type);*/
		
		System.out.print(t1.tren.get(0).colete_max);
	}

}
