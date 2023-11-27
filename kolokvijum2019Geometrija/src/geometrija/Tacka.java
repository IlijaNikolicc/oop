package geometrija;

public abstract class Tacka {
	
	private static int autoID;
	public int id;
	
	public Tacka()
	{
		id = autoID;
		autoID++;
	}
	public Tacka(int id)
	{
		this.id = id;
	}
	
	public abstract double rastojanje(Tacka t) throws TackeNisuUIstojDimenziji;
}
