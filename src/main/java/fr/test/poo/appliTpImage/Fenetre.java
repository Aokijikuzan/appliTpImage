package fr.test.poo.appliTpImage;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.*;
public class Fenetre extends JFrame {

	public static final int WIDTH=880;
	public static final int HEIGHT=590;
	private  ImageAppli imapp;
	public Graphics g;
	public Fenetre(ImageAppli image)
	{
		this.setLocation((int)((Toolkit.getDefaultToolkit().getScreenSize().getWidth()- WIDTH)/2),
				((int)(Toolkit.getDefaultToolkit().getScreenSize().getHeight()-HEIGHT)/2));	
		this.setTitle("tp Projet");
		this.setSize(WIDTH, HEIGHT);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		//imapp.paint();
		this.add(image);
		image.grabFocus();
		image.requestFocusInWindow();
		
		//this.setContentPane(image);
	
	}
	
	
}
