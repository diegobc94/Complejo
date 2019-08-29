package complejo;

public class Complejo implements Comparable<Complejo>{
	private double i;
	private double j;
	
	public Complejo(double i, double j) {
		this.i=i;
		this.j=j;
	}
	
	public Complejo() {
		
	}
	
	public void setI(double i) {
		this.i=i;
	}
	
	public void setJ(double j) {
		this.j=j;
	}
	
	public double getI() {
		return i;
	}
	
	public double getJ() {
		return j;
	}
	
	@Override
	public String toString() {
		return "[ i="+i+", j="+j+" ]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(i);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(j);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Complejo other = (Complejo) obj;
		if (Double.doubleToLongBits(i) != Double.doubleToLongBits(other.i))
			return false;
		if (Double.doubleToLongBits(j) != Double.doubleToLongBits(other.j))
			return false;
		return true;
	}
	
	public Complejo suma(Complejo c) {
		return new Complejo(this.i+c.getI(),this.j+c.getJ());
	}
	
	public static Complejo suma(Complejo c1, Complejo c2) {
		return new Complejo(c1.getI()+c2.getI(),c2.getJ()+c2.getJ());
	}
	
	public Complejo clone() {
		return new Complejo(this.i,this.j);
	}
	
	public double modulo() {
		return Math.sqrt(Math.pow(this.i, 2)+Math.pow(this.j, 2));
	}

	@Override
	public int compareTo(Complejo o) {
		double mod1 = this.modulo();
		double mod2 = o.modulo();
		if(mod1>mod2)
			return 1;
		else if(mod1<mod2)
			return -1;
		else
			return 0;
	}
	
	
	
}
