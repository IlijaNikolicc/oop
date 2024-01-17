
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUI extends JFrame {
	Logika igra = new Logika();
	JPanel tabla = new JPanel(new GridLayout(8,8));
	JPanel inf = new JPanel(new GridLayout(2,1));
	Dugme[][] matrica = new Dugme[8][8];
	Color boja = new Color(235,119,19);
	JLabel naPotezu = new JLabel("Na potezu je: "+ igra.koIgra);
	JLabel poeni = new JLabel("CRNI: "+ igra.brojPoenaCrnih + "CRVENI: " + igra.brojPoenaCrvenih);
	
	public GUI() {
		setBounds(100, 100, 400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Dame");
		setVisible(true);
		
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				Dugme d = new Dugme(i,j);
				d.setPreferredSize(new Dimension(60,60));
				if((i+j)%2==0) d.setBackground(Color.white);
				else d.setBackground(Color.black);
				matrica[i][j] = d;
				tabla.add(d);
				d.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						Dugme d = (Dugme)e.getSource();
						Polje p = igra.tabla[d.i][d.j];
						if(p.id!=0) d.setBackground(boja);
						if(igra.odigrajPotez(d.i, d.j)) {
							osveziGui();
						}
						else
						{
							JOptionPane.showConfirmDialog(null, "Nije moguce odigrati potez!","GRESKA",JOptionPane.OK_OPTION);
						}
						
						if(igra.krajIgre())
						{
							int odgovor = JOptionPane.showConfirmDialog(null, "Pobedio je " + igra.pobednik,"Kraj igre",JOptionPane.YES_NO_CANCEL_OPTION);
							if(odgovor == JOptionPane.YES_OPTION)
							{
								new Logika();
							}
						}
					}	
						
				});
			}
		}
		inf.add(naPotezu);
		inf.add(poeni);
		getContentPane().add(tabla, BorderLayout.CENTER);
		getContentPane().add(inf, BorderLayout.NORTH);
		pack();
		
	}
	
	public void osveziGui() {
		
	}
}
