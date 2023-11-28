package geometrija._3D;

import java.lang.Math;

public class Lopta extends GeometrijskoTelo {
	private Tacka3D centarLopte;
	double r;
	
	public Lopta(Tacka3D centarLopte, double r) {
		this.centarLopte = centarLopte;
		this.r = r;
	}

	@Override
	public double dajZapreminu() {
		return (4 / 3) * Math.pow(r, 3) * Math.PI;
	}
	
	public double dajPovrsinu()
	{
		return 4 * Math.pow(r, 2) * Math.PI;
	}
}
