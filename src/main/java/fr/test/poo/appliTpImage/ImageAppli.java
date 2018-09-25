package fr.test.poo.appliTpImage;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;

import java.io.*;
public  class ImageAppli  extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5741555206684640391L;
	//private Image imag;
	public String nom= "C:\\Users\\hp\\eclipse-workspace\\appliTpImage\\images\\arpeggio of blue steel.jpg";
	public Image img;

	public void paintComponent(Graphics g){
		try {
			Image img = ImageIO.read(new File(nom));
			g.drawImage(img,0,0, this.getWidth(),this.getHeight(),this);
			//dessinGrille(g);
			//Pour une image de fond
			//g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
		} catch (IOException e) {
			e.printStackTrace();
		}    
	
		dessinGrille(g);
	}
	public void dessinGrille(Graphics g)
	{
		
		for(int i=0;i<Fenetre.WIDTH;i++)
		{
			g.drawLine(0, i*100,Fenetre.WIDTH, i*100);
			g.drawLine(i*100, 0, i*100,Fenetre.HEIGHT);
		}
		
	}

}
