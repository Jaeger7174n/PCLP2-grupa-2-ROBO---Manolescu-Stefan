import java.util.*;

public class Tren implements Comparable{

	
	Vector <Vagon> tren = new  Vector <Vagon>();
	
	public Tren() {
		// TODO Auto-generated constructor stub
	}
	
	public void addVagon(Object v, int type) {
		switch (type) {
			case 0: 
				this.tren.add((Marfa) v);
			case 1:
				this.tren.add((CalatoriA) v);
			case 2:
				this.tren.add((CalatoriB) v);
		}
	}
	
	@Override
	public int compareTo(Object o) {
		
		int sum1 = 0;
		int sum2 = 0;
		Tren t1 = (Tren) o;
		for(int i = 0; i < this.tren.size(); i++) {
			sum1 += this.tren.get(i).colete_max;
		}
		for(int j = 0; j < t1.tren.size(); j++) {
			sum2 += t1.tren.get(j).colete_max;
		}
		
		return sum1-sum2;
			
	}

}
