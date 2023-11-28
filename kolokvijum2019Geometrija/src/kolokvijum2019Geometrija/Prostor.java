package kolokvijum2019Geometrija;

import geometrija.GeometrijskiOblik;
import geometrija._3D.GeometrijskoTelo;
import geometrija._3D.ITeloSaBazom;
import geometrija._3D.TrostranaPiramida;

public class Prostor {
	
	GeometrijskiOblik[] geometrijskiOblici;
	
	public Prostor(int kapacitet)
	{
		geometrijskiOblici = new GeometrijskiOblik[kapacitet];
	}
	
	public void dodajGeometrijskiOblik(GeometrijskiOblik noviGeometrijskiOblik)
	{
		for(int i=0;i<geometrijskiOblici.length;i++)
		{
			if(geometrijskiOblici[i] == null)
			{
				geometrijskiOblici[i] = noviGeometrijskiOblik;
				return;
			}
		}
	}
	
	public double dajZapreminuSvihOblikaKojiJeImaju()
	{
		double zapremina = 0.0;
		for(GeometrijskiOblik geometrijskiOblik : geometrijskiOblici)
		{
			if(geometrijskiOblik instanceof GeometrijskoTelo)
				zapremina += ((GeometrijskoTelo)geometrijskiOblik).dajZapreminu();
		}
		return zapremina;
	}
	
	public double dajPovrsinuSvihOblika()
	{
		double povrsina = 0.0;
		for(GeometrijskiOblik geometrijskiOblik : geometrijskiOblici)
		{
			povrsina += geometrijskiOblik.dajPovrsinu();
		}
		return povrsina;
	}
	
	public double dajBazeSvihOblikaKojiJeImaju()
	{
		double zapremina = 0.0;
		for(GeometrijskiOblik geometrijskiOblik : geometrijskiOblici)
		{
			if(geometrijskiOblik instanceof ITeloSaBazom)
				zapremina += ((GeometrijskoTelo)geometrijskiOblik).dajZapreminu();
		}
		return zapremina;
	}
	
	
	
	
	
	
}
