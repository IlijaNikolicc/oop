package geometrija._3D;

import geometrija.*;
import geometrija._2D.*;

public class TrostranaPiramida extends GeometrijskoTelo {
		
	private GeometrijskaFigura baza;
	Tacka vrhPiramide;
	
	public TrostranaPiramida(Tacka A, Tacka B, Tacka C, Tacka D)
	{
		baza = new Trougao(A,B,C);
		this.vrhPiramide = D;
	}
	@Override
	public double dajZapreminu() 
	{
		double povrsinaBaze = baza.dajPovrsinu();
		double visina = ((Tacka3D)vrhPiramide).rastojanje(((Tacka3D)vrhPiramide).getX(),((Tacka3D)vrhPiramide).getY(),((Tacka3D)(((Trougao)baza).getA())).getZ());         
		return povrsinaBaze * visina;
	}
	
	public double dajPovrsinu()
	{
		double povrsinaBaze = baza.dajPovrsinu();
		
		Trougao t1 = new Trougao((Tacka3D)vrhPiramide,((Tacka3D)((Trougao)baza).getA()),((Tacka3D)((Trougao)baza).getB()));
		Trougao t2 = new Trougao((Tacka3D)vrhPiramide,((Tacka3D)((Trougao)baza).getA()),((Tacka3D)((Trougao)baza).getC()));
		Trougao t3 = new Trougao((Tacka3D)vrhPiramide,((Tacka3D)((Trougao)baza).getB()),((Tacka3D)((Trougao)baza).getC()));
		
		System.out.println("\n"+t1+"\n"+t2+"\n"+t3+"\n"+"t1 t2 t3  \n"+t1.dajPovrsinu()+ " \n"+t2.dajPovrsinu()+" \n"+t3.dajPovrsinu()+"\nBaza "+baza.dajPovrsinu());
		double omotac = t1.dajPovrsinu() + t2.dajPovrsinu() + t3.dajPovrsinu();
		
		return povrsinaBaze + omotac;
	}
	public double dajPovrsinuBaze()
	{
		return baza.dajPovrsinu();
	}
	
	public double dajObimBaze() 
	{
		return baza.dajObim();
	}
	
	public void dajBazu()
	{
		baza.toString();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
