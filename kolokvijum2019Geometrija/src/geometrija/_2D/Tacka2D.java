package geometrija._2D;

import geometrija.Tacka;
import geometrija.TackeNisuUIstojDimenziji;
import java.lang.Math;

public class Tacka2D extends Tacka{
	
	private double x;
	private double y;
	
	public Tacka2D(double x, double y)
	{
		this.x = x;
		this.y = y;
	}

	@Override
	public double rastojanje(Tacka t) throws TackeNisuUIstojDimenziji 
	{
		if(this instanceof Tacka)
			return this.rastojanje(((Tacka2D)t).x,((Tacka2D)t).y);
		else
			throw new TackeNisuUIstojDimenziji(this, t);
	}
	
	public double rastojanje(double x, double y)
	{
		return Math.sqrt((this.x - x) * (this.x-x) + (this.y - y) * (this.y - y));
	}
	
	public double getX() 
	{
		return x;
	}
	
	public double getY()
	{
		return y;
	}
	
	
	
	
	
}
