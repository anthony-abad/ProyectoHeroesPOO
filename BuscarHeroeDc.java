package com.buscar;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import com.heroes.dominio.Heroe;
import com.heroes.repository.HeroeRepositoryDC;
import com.personajes.SuperHeroeDc1;
import com.personajes.SuperHeroeMarvel2;

public class BuscarHeroeDc extends JFrame{
	
	public BuscarHeroeDc (String dato) {

		setSize(700, 500);

		HeroeRepositoryDC repository = new HeroeRepositoryDC();
		ArrayList<Heroe> heroes = repository.getHeroes();
		
		int posicionx1 = 20;
		int posiciony1 = 40;
		int posiciony2 = 50;
		int numerobase = 1;
		int posicionx2 = 400;
		int posiciony3 = 130;
		
		JPanel p = new JPanel();
		p.setLayout(null);
		p.setBackground(Color.green);
		
		JScrollPane scroll = new JScrollPane();
		scroll.setBounds(5, 10, 500, 500);
		p.setPreferredSize(new Dimension(400, 2000));
		scroll.setViewportView(p);
		p.setBackground(Color.orange);
		
		
		for(Heroe heroe: heroes) {
			String nom = heroe.getSuperhero().toLowerCase();
			
			if(nom.contains(dato)) {
							
				JLabel lb2 = new JLabel(heroe.getSuperhero());
				lb2.setLocation(posicionx1, posiciony1);
				lb2.setSize(100, 50);
				p.add(lb2);
				
				posiciony1 += 230;
				
				switch(numerobase) {
				case 1: Image imagen = new ImageIcon(this.getClass().getResource("/dc-batman.jpg")).getImage().getScaledInstance(220, 200, Image.SCALE_SMOOTH);
				JLabel sh1 = new JLabel();
				sh1.setBounds(160, posiciony2, 220, 200);
				sh1.setIcon(new ImageIcon(imagen));
				p.add(sh1); 
				JButton btn1 = new JButton("MÁS");
				btn1.setBounds(posicionx2, posiciony3, 100, 50);
				btn1.setBackground(Color.cyan);
				btn1.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						int opcion = 1;
						SuperHeroeDc1 frm3 = new SuperHeroeDc1(opcion);
						frm3.setVisible(true);
						
					}
				});
				p.add(btn1);
				posiciony3 += 200;
				break;
				
				case 2: Image imagen1 = new ImageIcon(this.getClass().getResource("/dc-superman.jpg")).getImage().getScaledInstance(220, 200, Image.SCALE_SMOOTH);
				JLabel sh2 = new JLabel();
				sh2.setBounds(150, posiciony2, 220, 200);
				sh2.setIcon(new ImageIcon(imagen1));
				p.add(sh2); 
				JButton btn2 = new JButton("MÁS");
				btn2.setBounds(posicionx2, posiciony3, 100, 50);
				btn2.setBackground(Color.cyan);
				btn2.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						int opcion = 2;
						SuperHeroeDc1 frm3 = new SuperHeroeDc1(opcion);
						frm3.setVisible(true);
						
					}
				});
				posiciony3 += 200;
				p.add(btn2);
				break;
				case 3: Image imagen2 = new ImageIcon(this.getClass().getResource("/dc-flash.jpg")).getImage().getScaledInstance(220, 200, Image.SCALE_SMOOTH);
				JLabel sh3 = new JLabel();
				sh3.setBounds(150, posiciony2, 220, 200);
				sh3.setIcon(new ImageIcon(imagen2));
				p.add(sh3); 
				JButton btn3 = new JButton("MÁS");
				btn3.setBounds(posicionx2, posiciony3, 100, 50);
				btn3.setBackground(Color.cyan);
				btn3.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						int opcion = 3;
						SuperHeroeDc1 frm3 = new SuperHeroeDc1(opcion);
						frm3.setVisible(true);
						
					}
				});
				posiciony3 += 200;
				p.add(btn3);
				break;
				case 4: Image imagen3 = new ImageIcon(this.getClass().getResource("/dc-green.jpg")).getImage().getScaledInstance(220, 200, Image.SCALE_SMOOTH);
				JLabel sh4 = new JLabel();
				sh4.setBounds(150, posiciony2, 220, 200);
				sh4.setIcon(new ImageIcon(imagen3));
				p.add(sh4); 
				JButton btn4 = new JButton("MÁS");
				btn4.setBounds(posicionx2, posiciony3, 100, 50);
				btn4.setBackground(Color.cyan);
				btn4.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						int opcion = 4;
						SuperHeroeDc1 frm3 = new SuperHeroeDc1(opcion);
						frm3.setVisible(true);
					}
				});
				posiciony3 += 200;
				p.add(btn4);
				break;
				case 5: Image imagen4 = new ImageIcon(this.getClass().getResource("/dc-arrow.jpg")).getImage().getScaledInstance(220, 200, Image.SCALE_SMOOTH);
				JLabel sh5 = new JLabel();
				sh5.setBounds(150, posiciony2, 220, 200);
				sh5.setIcon(new ImageIcon(imagen4));
				JButton btn5 = new JButton("MÁS");
				btn5.setBounds(posicionx2, posiciony3, 100, 50);
				btn5.setBackground(Color.cyan);
				btn5.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						int opcion = 5;
						SuperHeroeDc1 frm3 = new SuperHeroeDc1(opcion);
						frm3.setVisible(true);
						
					}
				});
				p.add(btn5);
				p.add(sh5); 
				posiciony3 += 200;
				
				break;
				case 6: Image imagen5 = new ImageIcon(this.getClass().getResource("/dc-wonder.jpg")).getImage().getScaledInstance(220, 200, Image.SCALE_SMOOTH);
				JLabel sh6 = new JLabel();
				sh6.setBounds(150, posiciony2, 220, 200);
				sh6.setIcon(new ImageIcon(imagen5));
				//getContentPane().add(sh6);
				p.add(sh6); 
				JButton btn6 = new JButton("MÁS");
				btn6.setBounds(posicionx2, posiciony3, 100, 50);
				btn6.setBackground(Color.cyan);
				btn6.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						int opcion = 6;
						SuperHeroeDc1 frm3 = new SuperHeroeDc1(opcion);
						frm3.setVisible(true);
						
					}
				});
				p.add(btn6);
				posiciony3 += 200;
				
				break;
				case 7: Image imagen6 = new ImageIcon(this.getClass().getResource("/dc-martin.jpg")).getImage().getScaledInstance(220, 200, Image.SCALE_SMOOTH);
				JLabel sh7 = new JLabel();
				sh7.setBounds(150, posiciony2, 220, 200);
				sh7.setIcon(new ImageIcon(imagen6));
				//getContentPane().add(sh7);
				p.add(sh7); 
				JButton btn7 = new JButton("MÁS");
				btn7.setBounds(posicionx2, posiciony3, 100, 50);
				btn7.setBackground(Color.cyan);
				btn7.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						int opcion = 7;
						SuperHeroeDc1 frm3 = new SuperHeroeDc1(opcion);
						frm3.setVisible(true);
						
					}
				});
				p.add(btn7);
				posiciony3 += 200;
				
				break;
				case 8: Image imagen7 = new ImageIcon(this.getClass().getResource("/dc-robin.jpg")).getImage().getScaledInstance(220, 200, Image.SCALE_SMOOTH);
				JLabel sh8 = new JLabel();
				sh8.setBounds(150, posiciony2, 220, 200);
				sh8.setIcon(new ImageIcon(imagen7));
				//getContentPane().add(sh8);
				p.add(sh8); 
				JButton btn8 = new JButton("MÁS");
				btn8.setBounds(posicionx2, 720, 100, 50);
				btn8.setBackground(Color.cyan);
				btn8.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						int opcion = 8;
						SuperHeroeDc1 frm3 = new SuperHeroeDc1(opcion);
						frm3.setVisible(true);
						
					}
				});
				p.add(btn8);
				posiciony3 += 200;
				
				break;
				case 9: Image imagen8 = new ImageIcon(this.getClass().getResource("/dc-blue.jpg")).getImage().getScaledInstance(220, 200, Image.SCALE_SMOOTH);
				JLabel sh9 = new JLabel();
				sh9.setBounds(150, posiciony2, 220, 200);
				sh9.setIcon(new ImageIcon(imagen8));
				//getContentPane().add(sh9);
				p.add(sh9); 
				JButton btn9 = new JButton("MÁS");
				btn9.setBounds(posicionx2, 720, 100, 50);
				btn9.setBackground(Color.cyan);
				btn9.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						int opcion = 9;
						SuperHeroeDc1 frm3 = new SuperHeroeDc1(opcion);
						frm3.setVisible(true);
						
					}
				});
				p.add(btn9);
				posiciony3 += 200;
				
				break;
				case 10: Image imagen9 = new ImageIcon(this.getClass().getResource("/dc-black.jpg")).getImage().getScaledInstance(220, 200, Image.SCALE_SMOOTH);
				JLabel sh10 = new JLabel();
				sh10.setBounds(150, posiciony2, 220, 200);
				sh10.setIcon(new ImageIcon(imagen9));
				p.add(sh10); 
				JButton btn10 = new JButton("MÁS");
				btn10.setBounds(posicionx2, posiciony3, 100, 50);
				btn10.setBackground(Color.cyan);
				btn10.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						int opcion = 10;
						SuperHeroeDc1 frm3 = new SuperHeroeDc1(opcion);
						frm3.setVisible(true);
						
					}
				});
				p.add(btn10);
				posiciony3 += 200;
				break;
			}
			posiciony2 += 220;
		}
		numerobase += 1;
	}
		
		add(scroll);
		
	}

}
