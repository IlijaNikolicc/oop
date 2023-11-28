package geometrija._3D;

import java.lang.Math;
import geometrija.Tacka;
import geometrija.TackeNisuUIstojDimenziji;
import geometrija._2D.Tacka2D;

public class Tacka3D extends Tacka2D{

	private double z;
	
	public Tacka3D(double x, double y, double z) {
		super(x, y);
		this.z = z;
	}
	
	public double rastojanje(Tacka t) throws TackeNisuUIstojDimenziji{
		if(this instanceof Tacka)
			return rastojanje(((Tacka3D)t).getX(), ((Tacka3D)t).getY(), ((Tacka3D)t).z);
		else
			throw new TackeNisuUIstojDimenziji(this, t);
		
	}
	public double rastojanje(double x, double y, double z) {
		return Math.sqrt(Math.pow(this.getX() - x, 2) + Math.pow(this.getY() - y, 2) + Math.pow(this.z - z, 2));
	}
	
	public double getZ() {
		return z;
	}
	
	public String toString()
	{
		return "Koordinate tacke: ("+this.getX()+","+this.getY()+","+this.z+")";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
