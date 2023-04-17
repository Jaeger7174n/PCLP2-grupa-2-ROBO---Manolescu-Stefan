import java.lang.Math;



public class ComplexNumber extends problema4 {
		
		private double re, im;
		public ComplexNumber(double re, double im) {
			this.re = re;
			this.im = im;
		}
		public ComplexNumber(ComplexNumber z) {
			this.re = z.re;
			this.im = z.im;
		}
		
		
		public double getRe () {
			return this.re;
		}
		public double getIm () {
			return this.im;
		}
		
		public void setRe(double re) {
			this.re = re;
		}
		public void setIm(double im) {
			this.im = im;
		}
		
		public String toString() {
			return this.re + " + (" + this.im +")i";
		}
		
		public ComplexNumber add(double re, double im) {
			ComplexNumber aux = new ComplexNumber(this.re, this.im);
			aux.re += re;
			aux.im += im;
			return aux;
		}
		
		public ComplexNumber add(ComplexNumber z) {
			ComplexNumber aux = new ComplexNumber(this.re, this.im);

			aux.re += z.re;
			aux.im += z.im;
			return aux;
		}
		
		public ComplexNumber addRe(double re) {
			ComplexNumber aux = new ComplexNumber(this.re, this.im);

			aux.re += re;
			return aux;
		}
		public ComplexNumber addIm(double im) {
			ComplexNumber aux = new ComplexNumber(this.re, this.im);

			aux.im += im;
			return aux;
		}
		
		public ComplexNumber subtract(double re, double im) {
			ComplexNumber aux = new ComplexNumber(this.re, this.im);

			aux.re -= re;
			aux.im -= im;
			return aux;
		}
		public ComplexNumber subtract(ComplexNumber z) {
			ComplexNumber aux = new ComplexNumber(this.re, this.im);

			aux.re -= z.re;
			aux.im -= z.im;
			return aux;
		}
		
		public ComplexNumber subtractIm(double im) {
			ComplexNumber aux = new ComplexNumber(this.re, this.im);

			aux.im -= im;
			return aux;
		}
		public ComplexNumber subtractRe(double re) {
			ComplexNumber aux = new ComplexNumber(this.re, this.im);

			aux.re -= re;
			return aux;
		}
		
		public double absValue() {
			return Math.sqrt(this.re * this.re + this.im * this.im);
		}
		
		
	}

