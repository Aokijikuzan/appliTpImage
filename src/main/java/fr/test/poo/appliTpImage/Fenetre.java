package fr.test.poo.appliTpImage;
import java.awt.Graphics;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.*;
public class Fenetre extends JFrame {

	public final int LARGEUR=890;
	public final int LONGUEUR=490;
	private  ImageAppli imapp;
	public Graphics g;
	public Fenetre()
	{
		this.setTitle("tp Projet");
		this.setSize(LARGEUR, LONGUEUR);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		//imapp.paint();
		//this.add(imapp);
		this.setContentPane(new ImageAppli());
		
	}
	public void paintComponent(Graphics g)
	{
	}
}
