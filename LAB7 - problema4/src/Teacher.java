import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;


public class Teacher extends Person{

	public Teacher(String nume, String adresa) {
		super(nume, adresa);
	}
	
	private Vector courses = new Vector();
	
	public int getSize() {
        return courses.size();
    }
	
	public boolean addCourse (String course) {
		
			if(courses.contains(course)) {
				return false;
			}
		courses.add(this.getSize(), course);
		return true;
		
	}
	
	public boolean removeCourse (String course) { 
			if(courses.contains(course)) {
				courses.remove(course);
				return true;
			
		}
		
		return false;
	}
	
	
	public String toString() {
		
		String teacher = new String();
		
		teacher = "{\"" + super.nume + "\", \"" + super.adresa + "\", " ;
	        for(int i = 0; i < this.getSize(); i++) {
	            teacher += courses.get(i) + ", ";
	        }
	        teacher += "}";
	        return teacher;
	}

}
