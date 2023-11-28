package Test;

import geometrija.*;
import geometrija._2D.*;
import geometrija._3D.Tacka3D;
import geometrija._3D.TrostranaPiramida;

public class Main {
	
	public static void main(String[] args) {
		
		Tacka2D t1 = new Tacka2D(0,0);
		Tacka2D t2 = new Tacka2D(0,1);
		Tacka2D t3 = new Tacka2D(1,0);
		Tacka3D t4 = new Tacka3D(0,0,0);
		Tacka3D t5 = new Tacka3D(1,0,0);
		Tacka3D t6 = new Tacka3D(0,1,0);
		Tacka3D t7 = new Tacka3D(0,0,5);
		
		try 
		{
			Pravougaonik p1 = new Pravougaonik(t1,t2);
			System.out.println("povrsina pravougaonika "+p1.dajPovrsinu());
			Trougao t = new Trougao(t2, t1, t3);
			System.out.println("povrsina trougla je "+t.dajPovrsinu());
			System.out.println("3d rastojanje "+t5.toString());
			TrostranaPiramida tr = new TrostranaPiramida(t4, t5, t6, t7);
			System.out.println("povrsina piramide "+tr.dajPovrsinu());
			
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
