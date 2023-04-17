
public class problema2 {

	public static void main(String[] args) {
		Array vect = new Array();
		vect.addElement(1);
		vect.addElement(3);
		vect.addElement(4);
		vect.addElement(5);
		vect.addElement(2);

		SortedArray vect_sort = new SortedArray(vect);
		System.out.println(vect.toString());
		System.out.println(vect_sort.toString());
		
		MyStack stack = new MyStack();
		
		stack.addElement(1);
		stack.addElement(2);
		stack.addElement(4);
		stack.addElement(1);
		stack.addElement(2);
		System.out.println(stack.toString());
		
		System.out.println(stack.pop());
		System.out.println(stack.toString());
		stack.push(1);
		System.out.println(stack.toString());
		stack.push(10);
		System.out.println(stack.toString());
		
		
	}

}
