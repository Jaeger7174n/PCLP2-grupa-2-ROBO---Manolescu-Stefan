
public class fractie extends problema2{
		private int numarator, numitor;
		
		public fractie(int numarator, int numitor) {
			this.numarator = numarator;
			this.numitor = numitor;
		}
		
		public fractie() {
			new fractie(this.numarator, this.numitor);
		}
		
		public int getNumitor() {
			return this.numitor;
		}
		public int getNumarator() {
			return this.numarator;
		}
		
		public void setNumitor(int numitor) {
			this.numitor = numitor;
		}
		public void setNumarator(int numarator) {
			this.numarator = numarator;
		}
		
		public static int cmmdc (int a, int b) {
			
			    while (b != 0) {
			        int r = a % b;
			        a = b;
			        b = r;
			    }
			    return a;
		}
		public static int cmmmc (int a, int b) {
			return a*b/cmmdc(a,b);
		}
		
		public static fractie suma(fractie a, fractie b) {
			fractie sum = new fractie(0,0);
			
			sum.numitor = cmmmc(a.numitor, b.numitor);
			sum.numarator = a.numarator * sum.numitor / a.numitor + b.numarator * sum.numitor / b.numitor;
			
			return sum;
			
		}
		
		public static void toString(fractie a) {
			System.out.println(a.numarator + "/" + a.numitor);
		}
		
		public static boolean equals(fractie a, fractie b) {
			if ((float)a.numitor / b.numitor == (float)a.numarator/b.numarator) {
				return true;
			}
			else {
				return false;
			}
		}
	
		
	}

