package Code;

public class Triangulo {
	private double a, b, c;
	public boolean valid = true;
	public String type = null;

	public Triangulo (double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;		
	}
	
	public void definirTriangulo() {
		if (this.valid) {
			if(this.getA() == this.getB() && this.getA() == this.getC() && this.getB() == this.getC())
				this.type = "Equilátero";
			
			else if (this.getA() == this.getB() || this.getA() == this.getB() || this.getB() == this.getC())				this.type = "Isósceles";

			else 
				this.type = "Escaleno";			
		}	
	}
	
	public void validarTriangulo() {
		if( this.getA() - this.getB() > this.getC() || this.getA() + this.getB() < this.getC())
			this.valid = false;
		
		else if( this.getA() - this.getC() > this.getB() || this.getA() + this.getC() < this.getB())
			this.valid = false;
		
		else if( this.getB() - this.getC() > this.getA() || this.getB() + this.getC() < this.getA())
			this.valid = false;
		
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}
}
