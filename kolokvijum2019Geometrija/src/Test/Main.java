package Test;

import geometrija.*;
import geometrija._2D.*;

public class Main {
	
	public static void main(String[] args) {
		
		Tacka2D t1 = new Tacka2D(0,0);
		Tacka2D t2 = new Tacka2D(0,1);
		Tacka2D t3 = new Tacka2D(1,0);
		
		try 
		{
			Pravougaonik p1 = new Pravougaonik(t1,t2);
			System.out.println("povrsina pravougaonika "+p1.dajPovrsinu());
			Trougao t = new Trougao(t2, t1, t3);
			System.out.println("povrsina trougla je "+t.dajPovrsinu());
			
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
