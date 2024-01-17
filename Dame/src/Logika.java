import java.util.*;

enum NaPotezu{
	CRNI, CRVENI;
}

public class Logika {

	Polje[][] tabla;
	public static NaPotezu koIgra = NaPotezu.CRNI;
	Polje prviklik = null, drugiklik = null;
	int brojFiguraCrvenih = 0, brojFiguraCrnih = 0, brojCrnihPolja =0;
	public int brojPoenaCrnih = 0;
	public int brojPoenaCrvenih = 0;
	NaPotezu pobednik;
	int brojacCrno = 0;
	int brojacCrveno = 0;
	
	public Logika() {
		tabla = new Polje[8][8];
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				if((i+j)%2 != 0)
				{
					if( brojFiguraCrvenih < 12)
					{
						tabla[i][j] = new Polje(i,j,"CRNO",-1);
						brojFiguraCrvenih++;
						
					}
					else if(brojCrnihPolja < 8) {
						tabla[i][j] = new Polje(i,j,"CRNO",0);
						brojCrnihPolja++;
					}
					else if( brojFiguraCrnih < 12)
					{
						tabla[i][j] = new Polje(i,j,"CRNO",1);
						brojFiguraCrnih++;
						
					}
				}
				else
				{
					tabla[i][j] = new Polje(i,j,"BELO",0);
				}
			}
		}
		
	}
	
	
	
	public boolean odigrajPotez(int i, int j)
	{
		
		
		boolean potezOdigran = false;
		Polje polje = tabla[i][j];
		
		if(prviklik != null && drugiklik != null)
		{
			int i1 = prviklik.i;
			int j1 = prviklik.j;
			int i2 = drugiklik.i;
			int j2 = drugiklik.j;
			
			if((i1-i2)==1 && Math.abs(j1-j2)==1 && drugiklik.id==0 && koIgra.equals(NaPotezu.CRNI)) {
				tabla[i2][j2].id = tabla[i1][j1].id;
				tabla[i1][j1].id = 0;
				prviklik = null;
				drugiklik = null;
				koIgra = NaPotezu.CRVENI;
				potezOdigran = true;
			}
			if((i2-i1)==1 && Math.abs(j1-j2)==1 && drugiklik.id==0 && koIgra.equals(NaPotezu.CRVENI)) {
				tabla[i2][j2].id = tabla[i1][j1].id;
				tabla[i1][j1].id = 0;
				prviklik = null;
				drugiklik = null;
				koIgra = NaPotezu.CRNI;
				potezOdigran = true;
			}
			if((i1-i2)==2 && (j1-j2)==2 && drugiklik.id==0 && koIgra.equals(NaPotezu.CRNI) ) {
				if(tabla[i2+1][j2+1].id == tabla[i1][j1].id*(-1)) {
					tabla[i2][j2].id = tabla[i1][j1].id;
					tabla[i1][j1].id = 0;
					tabla[i2+1][j2+1].id = 0;
					brojPoenaCrnih+=1;
					if(i2==0) brojacCrno++;
					potezOdigran = true;
				}
			}
			if((i1-i2)==2 && (j1-j2)==-2 && drugiklik.id==0 && koIgra.equals(NaPotezu.CRNI) ) {
				if(tabla[i2+1][j2-1].id == tabla[i1][j1].id*(-1)) {
					tabla[i2][j2].id = tabla[i1][j1].id;
					tabla[i1][j1].id = 0;
					tabla[i2+1][j2-1].id = 0;
					brojPoenaCrnih+=1;
					if(i2==0) brojacCrno++;
					potezOdigran = true;
				}
			}
			if((i1-i2)==-2 && (j1-j2)==-2 && drugiklik.id==0 && koIgra.equals(NaPotezu.CRVENI) ) {
				if(tabla[i1+1][j1+1].id == tabla[i1][j1].id*(-1)) {
					tabla[i2][j2].id = tabla[i1][j1].id;
					tabla[i1][j1].id = 0;
					tabla[i1+1][j1+1].id = 0;
					brojPoenaCrvenih+=1;
					if(i2==0) brojacCrveno++;
					potezOdigran = true;
				}
			}
			if((i1-i2)==-2 && (j1-j2)==2 && drugiklik.id==0 && koIgra.equals(NaPotezu.CRVENI) ) {
				if(tabla[i1+1][j1-1].id == tabla[i1][j1].id*(-1)) {
					tabla[i2][j2].id = tabla[i1][j1].id;
					tabla[i1][j1].id = 0;
					tabla[i1+1][j1-1].id = 0;
					brojPoenaCrvenih+=1;
					if(i2==0) brojacCrveno++;
					potezOdigran = true;
				}
			}
		}
		else if(prviklik == null)
		{
			prviklik = polje;
		}
		else if(prviklik != null && drugiklik == null ) {
			drugiklik = polje;
		}
		return potezOdigran;
	}
	
	
	public boolean krajIgre() {
		if(brojPoenaCrnih==12) {
			pobednik = NaPotezu.CRNI;
			return true;
		}
		if(brojPoenaCrvenih==12) {
			pobednik = NaPotezu.CRVENI;
			return true;
		}
		if(brojacCrno>0) {
			pobednik = NaPotezu.CRNI;
			return true;
		}
		if(brojacCrveno>0) {
			pobednik = NaPotezu.CRVENI;
			return true;
		}
		return false;
		
	}
}
