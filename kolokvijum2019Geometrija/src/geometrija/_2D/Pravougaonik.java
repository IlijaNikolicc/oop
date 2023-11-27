package geometrija._2D;

import java.lang.Math;
import geometrija.Tacka;
import geometrija.TackeNisuUIstojDimenziji;

public class Pravougaonik extends GeometrijskaFigura {
	
	protected Tacka2D gornjiLeviUgao, donjiDesniUgao;
	
	public Pravougaonik()
	{
		this.gornjiLeviUgao = new Tacka2D(-1,1);
		this.donjiDesniUgao = new Tacka2D(-1,1);
	}
	public Pravougaonik(Tacka gornjiLeviUgao, Tacka donjiDesniUgao) throws TackeNisuUIstojDimenziji
	{
		if(gornjiLeviUgao instanceof Tacka2D && donjiDesniUgao instanceof Tacka2D)
		{
			this.gornjiLeviUgao = (Tacka2D) gornjiLeviUgao;
			this.donjiDesniUgao = (Tacka2D) donjiDesniUgao;
		}
		else
			throw new TackeNisuUIstojDimenziji(donjiDesniUgao, donjiDesniUgao);
	}

	@Override
	public double dajObim() {
		return Math.abs((gornjiLeviUgao.getX() - donjiDesniUgao.getX()) * 2 + (gornjiLeviUgao.getY() - donjiDesniUgao.getY()) * 2);
	}

	@Override
	public double dajPovrsinu() {
		return Math.abs((gornjiLeviUgao.getX() - donjiDesniUgao.getX()) * (gornjiLeviUgao.getY() - donjiDesniUgao.getY()));
	}
	

}
