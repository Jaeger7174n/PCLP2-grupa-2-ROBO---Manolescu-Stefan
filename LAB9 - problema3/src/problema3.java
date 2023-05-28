import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class problema3 {

	public static void main(String[] args) {
		Vector<Student> catalog = new Vector<Student>();
		Student s1 = new Student("Dorel");
		Student s2 = new Student("Gigel");
		Student s3 = new Student("Gigel");
		catalog.add(s1);
		catalog.add(s2);
		catalog.add(s3);
		catalog.get(0).addMedie(5);
		catalog.get(0).addMedie(8);
		catalog.get(0).addMedie(8);
		catalog.get(1).addMedie(8);
		catalog.get(1).addMedie(3);
		catalog.get(1).addMedie(5);
		catalog.get(2).addMedie(7);
		catalog.get(2).addMedie(9);
		catalog.get(2).addMedie(10);
		
		
		Collections.sort(catalog);
		System.out.println(catalog.get(0).toString());
		System.out.println(catalog.get(1).toString());
		System.out.println(catalog.get(2).toString());
		
		
	}

}
