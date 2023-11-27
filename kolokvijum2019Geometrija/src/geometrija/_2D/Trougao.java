package geometrija._2D;

import java.lang.Math;
import geometrija.Tacka;

public class Trougao extends GeometrijskaFigura {
	
	protected Tacka A,B,C;

	public Trougao(Tacka A, Tacka B, Tacka C)
	{
		this.A = A;
		this.B = B;
		this.C = C;
	}
	
	public Tacka getA() {
		return A;
	}
	public Tacka getB() {
		return B;
	}
	public Tacka getC() {
		return C;
	}
	@Override
	public double dajObim(){
		
		double c = ((Tacka2D)A).rastojanje(((Tacka2D)B).getX(),((Tacka2D)B).getY());
		double a = ((Tacka2D)B).rastojanje(((Tacka2D)C).getX(),((Tacka2D)C).getY());
		double b = ((Tacka2D)A).rastojanje(((Tacka2D)C).getX(),((Tacka2D)C).getY());
		
		return a+b+c;
	}

	@Override
	public double dajPovrsinu() {
		double c = ((Tacka2D)A).rastojanje(((Tacka2D)B).getX(),((Tacka2D)B).getY());
		double a = ((Tacka2D)B).rastojanje(((Tacka2D)C).getX(),((Tacka2D)C).getY());
		double b = ((Tacka2D)A).rastojanje(((Tacka2D)C).getX(),((Tacka2D)C).getY());
		
		double poluObim = this.dajObim() / 2;
		
		return Math.sqrt(poluObim * (poluObim - a) * (poluObim - b) * (poluObim - c));
	}
	
	//KAKO OVO TREBA
	public String toString() {
		return "Tacka A: " + A + ", tacka B: " + B + ", tacka C: " + C;
	}
}
