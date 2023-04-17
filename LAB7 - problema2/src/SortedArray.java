
public class SortedArray extends Array{
	public SortedArray(Array v) {
			Array aux = new Array();
			for (int i = 0; i<v.getSize(); i++) {
				aux.addElement(v.get(i),i);
			}
			aux.sort();
			for (int i = 0; i<aux.getSize(); i++) {
				super.addElement(aux.get(i),i);
			}
	}
}
