
public class Student implements Persoana {

	private String nume = new String();
	private int medii_length = 0;
	private double [] medii = new double[medii_length];
	
	public Student(String nume) {
		this.nume = nume;
	}
	@Override
	public int compareTo(Object o) {
		Student obj = (Student) o;
		
		if (this.nume.compareTo(obj.nume) != 0)
			return this.nume.compareTo(obj.nume);
		else if(this.calculMedieGenerala() - obj.calculMedieGenerala() > 0)
			return -1;
		else if (this.calculMedieGenerala() - obj.calculMedieGenerala() < 0)
			return 1;
		else 
			return 0;
	}

	@Override
	public double calculMedieGenerala() {
		double sum = 0;
		for (int i=0 ; i<this.medii_length; i++) {
			sum += this.medii[i];
		}
		return sum/this.medii_length;
	}

	@Override
	public String getNume() {
		// TODO Auto-generated method stub
		return this.nume;
	}

	@Override
	public void setNume(String nume) {
		this.nume = nume;
		
	}

	@Override
	public void addMedie(double medie) {
		this.medii_length += 1;
		double[] aux = this.medii;
		this.medii = new double [this.medii_length];
		for (int i=0 ; i<this.medii_length-1; i++) {
			this.medii[i] = aux[i];
		}
		this.medii[this.medii_length-1] = medie;
		
	}
	
	public String toString() {
		return this.nume + " " + this.calculMedieGenerala();
	}

}
