package geometrija;

public class TackeNisuUIstojDimenziji extends Exception {
	
	private Tacka t1,t2;
	
	public TackeNisuUIstojDimenziji(Tacka t1, Tacka t2)
	{
		this.t1 = t1;
		this.t2 = t2;
	}
	
	public String toString()
	{
		return "Tacke nisu u istoj dimenziji";
	}
	
}
