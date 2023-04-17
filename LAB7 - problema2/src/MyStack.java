
public class MyStack extends Array{

	
	
	public void push(int x) {
		super.addElement(x, super.getSize());
	
	}
	
	public int pop() {
		int aux = super.get(super.getSize()-1);
		super.remove(super.getSize()-1);
		
		
		return aux;
	}
}
