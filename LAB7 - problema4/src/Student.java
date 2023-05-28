import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class Student extends Person{

	public Student(String nume, String adresa) {
		super(nume, adresa);
	}
	private Vector courses = new Vector();
	private Vector note = new Vector();
	public int getSize() {
        return courses.size();
    }
	
	public void addCourseGrade (String course, int nota) {
		int s = note.size();
		note.add(s, nota);
		courses.add(s, course);
		
	}
	
	public void printGrades() {
		for (int i = 0; i < note.size(); i++) {
			System.out.print(note.get(i) + ", ");
		}
		System.out.println();
		
	}
	
	public double getAverageGrade() {
		double avg = 0;
		
		for (int i = 0; i < note.size(); i++) {
			avg += (double)note.get(i);
		}
		
		avg /= note.size();
		return avg;
	}
	
	
	public String toString() {
		
		String student = new String();
		
		student = "{\"" + super.nume + "\"; \"" + super.adresa + "\"; " ;
	        for(int i = 0; i < this.getSize(); i++) {
	            student += courses.get(i) + ", " + note.get(i) + "; ";
	        }
	        //student += this.getAverageGrade(); de ce nu vrea??????
	        student += "}";
	        return student;
	}

}
