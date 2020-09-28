package com.personajes;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.heroes.dominio.Heroe;
import com.heroes.repository.HeroeRepositoryDC;
import com.heroes.repository.HeroeRepositoryMarvel;


public class SuperHeroeMarvel2 extends JFrame{
	
	ArrayList<HeroeRepositoryDC> heroes = new ArrayList<>();
	
	
	
	public SuperHeroeMarvel2(int opcion) {
		
		setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.getContentPane().setBackground(Color.orange);
		this.setTitle("SUPER HEROE DE MARVEL");
		
		JButton btn1 = new JButton("ATRÁS");
		btn1.setBounds(900, 700, 100, 50);
		btn1.setBackground(Color.cyan);
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// procesos de click
				setVisible(false);
				
			}
		});
		getContentPane().add(btn1);
		
		HeroeRepositoryMarvel repository = new HeroeRepositoryMarvel();
		ArrayList<Heroe> heroes = repository.getHeroes();		
		
		int posicionx1 = 800;
		int tamaño = 500;
		
			if(opcion==1) {
				
				Image imagen = new ImageIcon(this.getClass().getResource("/marvel-captain.jpg")).getImage().getScaledInstance(700, 700, Image.SCALE_SMOOTH);
				JLabel sh1 = new JLabel();
				sh1.setBounds(50, 40, 700, 700);
				sh1.setIcon(new ImageIcon(imagen));
				getContentPane().add(sh1);
				
				JLabel lb1 = new JLabel(heroes.get(0).getId());
				lb1.setLocation(posicionx1, 40);
				lb1.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
				lb1.setSize(tamaño, 50);
				getContentPane().add(lb1);
				
				JLabel lb2 = new JLabel(heroes.get(0).getSuperhero());
				lb2.setLocation(posicionx1, 60);
				lb2.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
				lb2.setSize(tamaño, 50);
				getContentPane().add(lb2);
				
				JLabel lb3 = new JLabel(heroes.get(0).getPublisher());
				lb3.setLocation(posicionx1, 80);
				lb3.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
				lb3.setSize(tamaño, 50);
				getContentPane().add(lb3);
				
				JLabel lb4 = new JLabel(heroes.get(0).getAlter_ego());
				lb4.setLocation(posicionx1, 100);
				lb4.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
				lb4.setSize(tamaño, 50);
				getContentPane().add(lb4);
				
				JLabel lb5 = new JLabel(heroes.get(0).getFirst_appearance());
				lb5.setLocation(posicionx1, 120);
				lb5.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
				lb5.setSize(tamaño, 50);
				getContentPane().add(lb5);
				
				JLabel lb6 = new JLabel(heroes.get(0).getCharacters());
				lb6.setLocation(800, 140);
				lb6.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
				lb6.setSize(tamaño, 50);
				getContentPane().add(lb6);
				
				}if(opcion==2) {
					
					Image imagen = new ImageIcon(this.getClass().getResource("/marvel-spider.jpg")).getImage().getScaledInstance(700, 700, Image.SCALE_SMOOTH);
					JLabel sh1 = new JLabel();
					sh1.setBounds(50, 40, 700, 700);
					sh1.setIcon(new ImageIcon(imagen));
					getContentPane().add(sh1);
					
					JLabel lb1 = new JLabel(heroes.get(1).getId());
					lb1.setLocation(posicionx1, 40);
					lb1.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
					lb1.setSize(tamaño, 50);
					getContentPane().add(lb1);
					
					JLabel lb2 = new JLabel(heroes.get(1).getSuperhero());
					lb2.setLocation(posicionx1, 60);
					lb2.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
					lb2.setSize(tamaño, 50);
					getContentPane().add(lb2);
					
					JLabel lb3 = new JLabel(heroes.get(1).getPublisher());
					lb3.setLocation(posicionx1, 80);
					lb3.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
					lb3.setSize(tamaño, 50);
					getContentPane().add(lb3);
					
					JLabel lb4 = new JLabel(heroes.get(1).getAlter_ego());
					lb4.setLocation(posicionx1, 100);
					lb4.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
					lb4.setSize(tamaño, 50);
					getContentPane().add(lb4);
					
					JLabel lb5 = new JLabel(heroes.get(1).getFirst_appearance());
					lb5.setLocation(posicionx1, 120);
					lb5.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
					lb5.setSize(tamaño, 50);
					getContentPane().add(lb5);
					
					JLabel lb6 = new JLabel(heroes.get(1).getCharacters());
					lb6.setLocation(800, 140);
					lb6.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
					lb6.setSize(tamaño, 50);
					getContentPane().add(lb6);
					
				}if(opcion==3) {
					
					Image imagen = new ImageIcon(this.getClass().getResource("/marvel-iron.jpg")).getImage().getScaledInstance(700, 700, Image.SCALE_SMOOTH);
					JLabel sh1 = new JLabel();
					sh1.setBounds(50, 40, 700, 700);
					sh1.setIcon(new ImageIcon(imagen));
					getContentPane().add(sh1);
					
					JLabel lb1 = new JLabel(heroes.get(2).getId());
					lb1.setLocation(posicionx1, 40);
					lb1.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
					lb1.setSize(tamaño, 50);
					getContentPane().add(lb1);
					
					JLabel lb2 = new JLabel(heroes.get(2).getSuperhero());
					lb2.setLocation(posicionx1, 60);
					lb2.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
					lb2.setSize(tamaño, 50);
					getContentPane().add(lb2);
					
					JLabel lb3 = new JLabel(heroes.get(2).getPublisher());
					lb3.setLocation(posicionx1, 80);
					lb3.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
					lb3.setSize(tamaño, 50);
					getContentPane().add(lb3);
					
					JLabel lb4 = new JLabel(heroes.get(2).getAlter_ego());
					lb4.setLocation(posicionx1, 100);
					lb4.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
					lb4.setSize(tamaño, 50);
					getContentPane().add(lb4);
					
					JLabel lb5 = new JLabel(heroes.get(2).getFirst_appearance());
					lb5.setLocation(posicionx1, 120);
					lb5.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
					lb5.setSize(tamaño, 50);
					getContentPane().add(lb5);
					
					JLabel lb6 = new JLabel(heroes.get(2).getCharacters());
					lb6.setLocation(800, 140);
					lb6.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
					lb6.setSize(tamaño, 50);
					getContentPane().add(lb6);
					
				}if(opcion==4) {
					
					Image imagen = new ImageIcon(this.getClass().getResource("/marvel-thor.jpg")).getImage().getScaledInstance(700, 700, Image.SCALE_SMOOTH);
					JLabel sh1 = new JLabel();
					sh1.setBounds(50, 40, 700, 700);
					sh1.setIcon(new ImageIcon(imagen));
					getContentPane().add(sh1);
					
					JLabel lb1 = new JLabel(heroes.get(3).getId());
					lb1.setLocation(posicionx1, 40);
					lb1.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
					lb1.setSize(tamaño, 50);
					getContentPane().add(lb1);
					
					JLabel lb2 = new JLabel(heroes.get(3).getSuperhero());
					lb2.setLocation(posicionx1, 60);
					lb2.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
					lb2.setSize(tamaño, 50);
					getContentPane().add(lb2);
					
					JLabel lb3 = new JLabel(heroes.get(3).getPublisher());
					lb3.setLocation(posicionx1, 80);
					lb3.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
					lb3.setSize(tamaño, 50);
					getContentPane().add(lb3);
					
					JLabel lb4 = new JLabel(heroes.get(3).getAlter_ego());
					lb4.setLocation(posicionx1, 100);
					lb4.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
					lb4.setSize(tamaño, 50);
					getContentPane().add(lb4);
					
					JLabel lb5 = new JLabel(heroes.get(3).getFirst_appearance());
					lb5.setLocation(posicionx1, 120);
					lb5.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
					lb5.setSize(tamaño, 50);
					getContentPane().add(lb5);
					
					JLabel lb6 = new JLabel(heroes.get(3).getCharacters());
					lb6.setLocation(800, 140);
					lb6.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
					lb6.setSize(tamaño, 50);
					getContentPane().add(lb6);
					
				}if(opcion==5) {
					
					Image imagen = new ImageIcon(this.getClass().getResource("/marvel-hulk.jpg")).getImage().getScaledInstance(700, 700, Image.SCALE_SMOOTH);
					JLabel sh1 = new JLabel();
					sh1.setBounds(50, 40, 700, 700);
					sh1.setIcon(new ImageIcon(imagen));
					getContentPane().add(sh1);
					
					JLabel lb1 = new JLabel(heroes.get(4).getId());
					lb1.setLocation(posicionx1, 40);
					lb1.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
					lb1.setSize(tamaño, 50);
					getContentPane().add(lb1);
					
					JLabel lb2 = new JLabel(heroes.get(4).getSuperhero());
					lb2.setLocation(posicionx1, 60);
					lb2.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
					lb2.setSize(tamaño, 50);
					getContentPane().add(lb2);
					
					JLabel lb3 = new JLabel(heroes.get(4).getPublisher());
					lb3.setLocation(posicionx1, 80);
					lb3.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
					lb3.setSize(tamaño, 50);
					getContentPane().add(lb3);
					
					JLabel lb4 = new JLabel(heroes.get(4).getAlter_ego());
					lb4.setLocation(posicionx1, 100);
					lb4.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
					lb4.setSize(tamaño, 50);
					getContentPane().add(lb4);
					
					JLabel lb5 = new JLabel(heroes.get(4).getFirst_appearance());
					lb5.setLocation(posicionx1, 120);
					lb5.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
					lb5.setSize(tamaño, 50);
					getContentPane().add(lb5);
					
					JLabel lb6 = new JLabel(heroes.get(4).getCharacters());
					lb6.setLocation(800, 140);
					lb6.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
					lb6.setSize(tamaño, 50);
					getContentPane().add(lb6);
					
				}if(opcion==6) {
					
					Image imagen = new ImageIcon(this.getClass().getResource("/marvel-wolverine.jpg")).getImage().getScaledInstance(700, 700, Image.SCALE_SMOOTH);
					JLabel sh1 = new JLabel();
					sh1.setBounds(50, 40, 700, 700);
					sh1.setIcon(new ImageIcon(imagen));
					getContentPane().add(sh1);
					
					JLabel lb1 = new JLabel(heroes.get(5).getId());
					lb1.setLocation(posicionx1, 40);
					lb1.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
					lb1.setSize(tamaño, 50);
					getContentPane().add(lb1);
					
					JLabel lb2 = new JLabel(heroes.get(5).getSuperhero());
					lb2.setLocation(posicionx1, 60);
					lb2.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
					lb2.setSize(tamaño, 50);
					getContentPane().add(lb2);
					
					JLabel lb3 = new JLabel(heroes.get(5).getPublisher());
					lb3.setLocation(posicionx1, 80);
					lb3.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
					lb3.setSize(tamaño, 50);
					getContentPane().add(lb3);
					
					JLabel lb4 = new JLabel(heroes.get(5).getAlter_ego());
					lb4.setLocation(posicionx1, 100);
					lb4.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
					lb4.setSize(tamaño, 50);
					getContentPane().add(lb4);
					
					JLabel lb5 = new JLabel(heroes.get(5).getFirst_appearance());
					lb5.setLocation(posicionx1, 120);
					lb5.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
					lb5.setSize(tamaño, 50);
					getContentPane().add(lb5);
					
					JLabel lb6 = new JLabel(heroes.get(5).getCharacters());
					lb6.setLocation(800, 140);
					lb6.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
					lb6.setSize(tamaño, 50);
					getContentPane().add(lb6);
					
				}if(opcion==7) {
					
					Image imagen = new ImageIcon(this.getClass().getResource("/marvel-daredevil.jpg")).getImage().getScaledInstance(700, 700, Image.SCALE_SMOOTH);
					JLabel sh1 = new JLabel();
					sh1.setBounds(50, 40, 700, 700);
					sh1.setIcon(new ImageIcon(imagen));
					getContentPane().add(sh1);
					
					JLabel lb1 = new JLabel(heroes.get(6).getId());
					lb1.setLocation(posicionx1, 40);
					lb1.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
					lb1.setSize(tamaño, 50);
					getContentPane().add(lb1);
					
					JLabel lb2 = new JLabel(heroes.get(6).getSuperhero());
					lb2.setLocation(posicionx1, 60);
					lb2.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
					lb2.setSize(tamaño, 50);
					getContentPane().add(lb2);
					
					JLabel lb3 = new JLabel(heroes.get(6).getPublisher());
					lb3.setLocation(posicionx1, 80);
					lb3.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
					lb3.setSize(tamaño, 50);
					getContentPane().add(lb3);
					
					JLabel lb4 = new JLabel(heroes.get(6).getAlter_ego());
					lb4.setLocation(posicionx1, 100);
					lb4.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
					lb4.setSize(tamaño, 50);
					getContentPane().add(lb4);
					
					JLabel lb5 = new JLabel(heroes.get(6).getFirst_appearance());
					lb5.setLocation(posicionx1, 120);
					lb5.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
					lb5.setSize(tamaño, 50);
					getContentPane().add(lb5);
					
					JLabel lb6 = new JLabel(heroes.get(6).getCharacters());
					lb6.setLocation(800, 140);
					lb6.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
					lb6.setSize(tamaño, 50);
					getContentPane().add(lb6);
					
				}if(opcion==8) {
					
					Image imagen = new ImageIcon(this.getClass().getResource("/marvel-hawkeye.jpg")).getImage().getScaledInstance(700, 700, Image.SCALE_SMOOTH);
					JLabel sh1 = new JLabel();
					sh1.setBounds(50, 40, 700, 700);
					sh1.setIcon(new ImageIcon(imagen));
					getContentPane().add(sh1);
					
					JLabel lb1 = new JLabel(heroes.get(7).getId());
					lb1.setLocation(posicionx1, 40);
					lb1.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
					lb1.setSize(tamaño, 50);
					getContentPane().add(lb1);
					
					JLabel lb2 = new JLabel(heroes.get(7).getSuperhero());
					lb2.setLocation(posicionx1, 60);
					lb2.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
					lb2.setSize(tamaño, 50);
					getContentPane().add(lb2);
					
					JLabel lb3 = new JLabel(heroes.get(7).getPublisher());
					lb3.setLocation(posicionx1, 80);
					lb3.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
					lb3.setSize(tamaño, 50);
					getContentPane().add(lb3);
					
					JLabel lb4 = new JLabel(heroes.get(7).getAlter_ego());
					lb4.setLocation(posicionx1, 100);
					lb4.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
					lb4.setSize(tamaño, 50);
					getContentPane().add(lb4);
					
					JLabel lb5 = new JLabel(heroes.get(7).getFirst_appearance());
					lb5.setLocation(posicionx1, 120);
					lb5.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
					lb5.setSize(tamaño, 50);
					getContentPane().add(lb5);
					
					JLabel lb6 = new JLabel(heroes.get(7).getCharacters());
					lb6.setLocation(800, 140);
					lb6.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
					lb6.setSize(tamaño, 50);
					getContentPane().add(lb6);
					
				}if(opcion==9) {
					
					Image imagen = new ImageIcon(this.getClass().getResource("/marvel-cyclops.jpg")).getImage().getScaledInstance(700, 700, Image.SCALE_SMOOTH);
					JLabel sh1 = new JLabel();
					sh1.setBounds(50, 40, 700, 700);
					sh1.setIcon(new ImageIcon(imagen));
					getContentPane().add(sh1);
					
					JLabel lb1 = new JLabel(heroes.get(8).getId());
					lb1.setLocation(posicionx1, 40);
					lb1.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
					lb1.setSize(tamaño, 50);
					getContentPane().add(lb1);
					
					JLabel lb2 = new JLabel(heroes.get(8).getSuperhero());
					lb2.setLocation(posicionx1, 60);
					lb2.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
					lb2.setSize(tamaño, 50);
					getContentPane().add(lb2);
					
					JLabel lb3 = new JLabel(heroes.get(8).getPublisher());
					lb3.setLocation(posicionx1, 80);
					lb3.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
					lb3.setSize(tamaño, 50);
					getContentPane().add(lb3);
					
					JLabel lb4 = new JLabel(heroes.get(8).getAlter_ego());
					lb4.setLocation(posicionx1, 100);
					lb4.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
					lb4.setSize(tamaño, 50);
					getContentPane().add(lb4);
					
					JLabel lb5 = new JLabel(heroes.get(8).getFirst_appearance());
					lb5.setLocation(posicionx1, 120);
					lb5.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
					lb5.setSize(tamaño, 50);
					getContentPane().add(lb5);
					
					JLabel lb6 = new JLabel(heroes.get(8).getCharacters());
					lb6.setLocation(800, 140);
					lb6.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
					lb6.setSize(tamaño, 50);
					getContentPane().add(lb6);
					
				}if(opcion==10) {
					
					Image imagen = new ImageIcon(this.getClass().getResource("/marvel-silver.jpg")).getImage().getScaledInstance(700, 700, Image.SCALE_SMOOTH);
					JLabel sh1 = new JLabel();
					sh1.setBounds(50, 40, 700, 700);
					sh1.setIcon(new ImageIcon(imagen));
					getContentPane().add(sh1);
					
					JLabel lb1 = new JLabel(heroes.get(9).getId());
					lb1.setLocation(posicionx1, 40);
					lb1.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
					lb1.setSize(tamaño, 50);
					getContentPane().add(lb1);
					
					JLabel lb2 = new JLabel(heroes.get(9).getSuperhero());
					lb2.setLocation(posicionx1, 60);
					lb2.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
					lb2.setSize(tamaño, 50);
					getContentPane().add(lb2);
					
					JLabel lb3 = new JLabel(heroes.get(9).getPublisher());
					lb3.setLocation(posicionx1, 80);
					lb3.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
					lb3.setSize(tamaño, 50);
					getContentPane().add(lb3);
					
					JLabel lb4 = new JLabel(heroes.get(9).getAlter_ego());
					lb4.setLocation(posicionx1, 100);
					lb4.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
					lb4.setSize(tamaño, 50);
					getContentPane().add(lb4);
					
					JLabel lb5 = new JLabel(heroes.get(9).getFirst_appearance());
					lb5.setLocation(posicionx1, 120);
					lb5.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
					lb5.setSize(tamaño, 50);
					getContentPane().add(lb5);
					
					JLabel lb6 = new JLabel(heroes.get(9).getCharacters());
					lb6.setLocation(800, 140);
					lb6.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 20));
					lb6.setSize(tamaño, 50);
					getContentPane().add(lb6);
					
				}
				
				
				//setSize(800, 800);
			}
	

}
