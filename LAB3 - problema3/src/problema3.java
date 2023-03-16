
public class problema3 {

	public static void main(String[] args) {
		int i = 3, num_div, j, div;
		System.out.print("2, ");
		while (i <= 100) {
			j = i;
			div = 2;
			num_div = 1;
			
			if (j % div == 0) {
				j /= div;
				num_div++;
			}
			div++;
			
			while (j > 1) {
				if (j % div == 0) {
					j /= div;
					num_div++;
				}
				div += 2;
				if (num_div > 2) {
					break;
				}
			}
			
			if (num_div == 2) {
				System.out.print(i + ", ");
			}
			i += 2;
		}
	}

}
