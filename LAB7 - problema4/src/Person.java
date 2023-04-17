
public class Person {
	protected String nume;
	protected String adresa;
	public Person(String nume, String adresa) {
		this.nume = nume;
		this.adresa = adresa;
	}
	
	public String getName() {
		return this.nume;
	}
	public String getAddress() {
		return this.adresa;
	}
	
	public void setAddress (String adresa) {
		this.adresa = adresa;
	}
	
	public String toString() {
		String person = new String();
		
		person = "\"" + this.nume + "\", \"" + this.adresa + "\"";
		return person;
	}
}
