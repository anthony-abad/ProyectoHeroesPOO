package com.heroes;

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
import com.heroes.repository.HeroeRepositoryMarvel;
import com.personajes.SuperHeroeDc1;
import com.personajes.SuperHeroeMarvel2;

public class SuperHeroeMarvel extends JFrame {
	
	
	
	public SuperHeroeMarvel() {
		setSize(500, 500);
		
		setExtendedState(MAXIMIZED_BOTH);
		
		JPanel p = new JPanel();
		p.setLayout(null);
		p.setVisible(true);
		
		JScrollPane scroll = new JScrollPane();
		scroll.setBounds(5, 10, 500, 500);
		p.setPreferredSize(new Dimension(1500, 1500));
		scroll.setViewportView(p);
		p.setBackground(Color.orange);
		
		
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		//this.getContentPane().setBackground(Color.orange);
		this.setTitle("SUPER HEROES DE MARVEL");
		//setLayout(null);
		
		JButton btn = new JButton("ATRAS");
		btn.setBounds(0, 0, 150, 50);
		btn.setBackground(Color.cyan);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// procesos de click
				SuperHeroeMarvel frm7 = new SuperHeroeMarvel();
				setVisible(false);
				
				VentanaPrincipal frm = new VentanaPrincipal();
				frm.setVisible(true);
				
			}
		});
		//getContentPane().add(btn);
		p.add(btn);
		
		
		//BOTONES MÁS
		JButton btn1 = new JButton("MÁS");
		btn1.setBounds(300, 160, 100, 50);
		btn1.setBackground(Color.cyan);
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// procesos de click
				int opcion = 1;
				SuperHeroeMarvel2 frm3 = new SuperHeroeMarvel2(opcion);
				frm3.setVisible(true);
				
			}
		});
		//getContentPane().add(btn1);
		p.add(btn1);
		
		
		
		JButton btn2 = new JButton("MÁS");
		btn2.setBounds(800, 160, 100, 50);
		btn2.setBackground(Color.cyan);
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// procesos de click
				int opcion = 2;
				SuperHeroeMarvel2 frm3 = new SuperHeroeMarvel2(opcion);
				frm3.setVisible(true);
				
			}
		});
		//getContentPane().add(btn2);
		p.add(btn2);
		JButton btn3 = new JButton("MÁS");
		btn3.setBounds(1300, 160, 100, 50);
		btn3.setBackground(Color.cyan);
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// procesos de click
				int opcion = 3;
				SuperHeroeMarvel2 frm3 = new SuperHeroeMarvel2(opcion);
				frm3.setVisible(true);
				
			}
		});
		//getContentPane().add(btn3);
		p.add(btn3);
		
		JButton btn4 = new JButton("MÁS");
		btn4.setBounds(300, 420, 100, 50);
		btn4.setBackground(Color.cyan);
		btn4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// procesos de click
				int opcion = 4;
				SuperHeroeMarvel2 frm3 = new SuperHeroeMarvel2(opcion);
				frm3.setVisible(true);
			}
		});
		getContentPane().add(btn4);
		p.add(btn4);
		
		JButton btn5 = new JButton("MÁS");
		btn5.setBounds(800, 420, 100, 50);
		btn5.setBackground(Color.cyan);
		btn5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// procesos de click
				int opcion = 5;
				SuperHeroeMarvel2 frm3 = new SuperHeroeMarvel2(opcion);
				frm3.setVisible(true);
				
			}
		});
		//getContentPane().add(btn5);
		p.add(btn5);
		JButton btn6 = new JButton("MÁS");
		btn6.setBounds(1300, 420, 100, 50);
		btn6.setBackground(Color.cyan);
		btn6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// procesos de click
				int opcion = 6;
				SuperHeroeMarvel2 frm3 = new SuperHeroeMarvel2(opcion);
				frm3.setVisible(true);
				
			}
		});
		//getContentPane().add(btn6);
		p.add(btn6);
		
		JButton btn7 = new JButton("MÁS");
		btn7.setBounds(300, 720, 100, 50);
		btn7.setBackground(Color.cyan);
		btn7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// procesos de click
				int opcion = 7;
				SuperHeroeMarvel2 frm3 = new SuperHeroeMarvel2(opcion);
				frm3.setVisible(true);
				
			}
		});
		//getContentPane().add(btn7);
		p.add(btn7);
		
		JButton btn8 = new JButton("MÁS");
		btn8.setBounds(800, 720, 100, 50);
		btn8.setBackground(Color.cyan);
		btn8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// procesos de click
				int opcion = 8;
				SuperHeroeMarvel2 frm3 = new SuperHeroeMarvel2(opcion);
				frm3.setVisible(true);
				
			}
		});
		//getContentPane().add(btn8);
		p.add(btn8);
		
		JButton btn9 = new JButton("MÁS");
		btn9.setBounds(1300, 720, 100, 50);
		btn9.setBackground(Color.cyan);
		btn9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// procesos de click
				int opcion = 9;
				SuperHeroeMarvel2 frm3 = new SuperHeroeMarvel2(opcion);
				frm3.setVisible(true);
				
			}
		});
		//getContentPane().add(btn9);
		p.add(btn9);
		
		JButton btn10 = new JButton("MÁS");
		btn10.setBounds(800, 1020, 100, 50);
		btn10.setBackground(Color.cyan);
		btn10.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// procesos de click
				int opcion = 10;
				SuperHeroeMarvel2 frm3 = new SuperHeroeMarvel2(opcion);
				frm3.setVisible(true);
				
			}
		});
		//getContentPane().add(btn10);
		p.add(btn10);	
				
				
		
		//IMAGENES
		
		Image imagen = new ImageIcon(this.getClass().getResource("/marvel-captain.jpg")).getImage().getScaledInstance(280, 220, Image.SCALE_SMOOTH);
		JLabel sh1 = new JLabel();
		sh1.setBounds(10, 60, 280, 220);
		sh1.setIcon(new ImageIcon(imagen));
		//getContentPane().add(sh1);
		p.add(sh1);
		
		Image imagen1 = new ImageIcon(this.getClass().getResource("/marvel-spider.jpg")).getImage().getScaledInstance(280, 220, Image.SCALE_SMOOTH);
		JLabel sh2 = new JLabel();
		sh2.setBounds(500, 60, 280, 220);
		sh2.setIcon(new ImageIcon(imagen1));
		//getContentPane().add(sh2);
		p.add(sh2);
		
		Image imagen2 = new ImageIcon(this.getClass().getResource("/marvel-iron.jpg")).getImage().getScaledInstance(280, 220, Image.SCALE_SMOOTH);
		JLabel sh3 = new JLabel();
		sh3.setBounds(1000, 60, 280, 220);
		sh3.setIcon(new ImageIcon(imagen2));
		//getContentPane().add(sh3);
		p.add(sh3);
		
		Image imagen3 = new ImageIcon(this.getClass().getResource("/marvel-thor.jpg")).getImage().getScaledInstance(280, 220, Image.SCALE_SMOOTH);
		JLabel sh4 = new JLabel();
		sh4.setBounds(10, 320, 280, 220);
		sh4.setIcon(new ImageIcon(imagen3));
		//getContentPane().add(sh4);
		p.add(sh4);
		
		Image imagen4 = new ImageIcon(this.getClass().getResource("/marvel-hulk.jpg")).getImage().getScaledInstance(280, 220, Image.SCALE_SMOOTH);
		JLabel sh5 = new JLabel();
		sh5.setBounds(500, 320, 280, 220);
		sh5.setIcon(new ImageIcon(imagen4));
		//getContentPane().add(sh5);
		p.add(sh5);
		
		Image imagen5 = new ImageIcon(this.getClass().getResource("/marvel-wolverine.jpg")).getImage().getScaledInstance(280, 220, Image.SCALE_SMOOTH);
		JLabel sh6 = new JLabel();
		sh6.setBounds(1000, 320, 280, 220);
		sh6.setIcon(new ImageIcon(imagen5));
		//getContentPane().add(sh6);
		p.add(sh6);
		
		Image imagen6 = new ImageIcon(this.getClass().getResource("/marvel-daredevil.jpg")).getImage().getScaledInstance(280, 220, Image.SCALE_SMOOTH);
		JLabel sh7 = new JLabel();
		sh7.setBounds(10, 600, 280, 220);
		sh7.setIcon(new ImageIcon(imagen6));
		//getContentPane().add(sh7);
		p.add(sh7);
		
		Image imagen7 = new ImageIcon(this.getClass().getResource("/marvel-hawkeye.jpg")).getImage().getScaledInstance(280, 220, Image.SCALE_SMOOTH);
		JLabel sh8 = new JLabel();
		sh8.setBounds(500, 600, 280, 220);
		sh8.setIcon(new ImageIcon(imagen7));
		//getContentPane().add(sh8);
		p.add(sh8);
		
		Image imagen8 = new ImageIcon(this.getClass().getResource("/marvel-cyclops.jpg")).getImage().getScaledInstance(280, 220, Image.SCALE_SMOOTH);
		JLabel sh9 = new JLabel();
		sh9.setBounds(1000, 600, 280, 220);
		sh9.setIcon(new ImageIcon(imagen8));
		//getContentPane().add(sh9);
		p.add(sh9);
		
		Image imagen9 = new ImageIcon(this.getClass().getResource("/marvel-silver.jpg")).getImage().getScaledInstance(280, 220, Image.SCALE_SMOOTH);
		JLabel sh10 = new JLabel();
		sh10.setBounds(500, 900, 280, 220);
		sh10.setIcon(new ImageIcon(imagen9));
		//getContentPane().add(sh10);
		p.add(sh10);
		
		
		//INFORMACION DE LOS HEROES
		
		HeroeRepositoryMarvel repository = new HeroeRepositoryMarvel();
		ArrayList<Heroe> heroes = repository.getHeroes();		
		
		int posicionx1 = 300;
		int numero = 1;
		
		for(Heroe heroe: heroes) {
			if(numero<=3) {
				
				JLabel lb1 = new JLabel(heroe.getId());
				lb1.setLocation(posicionx1, 40);
				lb1.setSize(100, 50);
				//getContentPane().add(lb1);
				p.add(lb1);
						
				JLabel lb2 = new JLabel(heroe.getSuperhero());
				lb2.setLocation(posicionx1, 60);
				lb2.setSize(100, 50);
				//getContentPane().add(lb2);
				p.add(lb2);
				
				JLabel lb3 = new JLabel(heroe.getPublisher());
				lb3.setLocation(posicionx1, 80);
				lb3.setSize(100, 50);
				//getContentPane().add(lb3);
				p.add(lb3);
				
				JLabel lb4 = new JLabel(heroe.getAlter_ego());
				lb4.setLocation(posicionx1, 100);
				lb4.setSize(200, 50);
				//getContentPane().add(lb4);
				p.add(lb4);
				
				JLabel lb5 = new JLabel(heroe.getFirst_appearance());
				lb5.setLocation(posicionx1, 120);
				lb5.setSize(200, 50);
				//getContentPane().add(lb5);
				p.add(lb5);
				
				JLabel lb6 = new JLabel(heroe.getCharacters());
				lb6.setLocation(posicionx1, 140);
				lb6.setSize(200, 50);
				//getContentPane().add(lb6);				
				p.add(lb6);
				
				posicionx1 += 500;
				
				
				//getContentPane().add(new MiPanel(heroe));
				
				//ORDENAR LOS HEROES
				
				}if(numero==4) {
					posicionx1 = 300;
					JLabel lb1 = new JLabel(heroe.getId());
					lb1.setLocation(posicionx1, 300);
					lb1.setSize(100, 50);
					//getContentPane().add(lb1);
					p.add(lb1);
					
					JLabel lb2 = new JLabel(heroe.getSuperhero());
					lb2.setLocation(posicionx1, 320);
					lb2.setSize(100, 50);
					//getContentPane().add(lb2);
					p.add(lb2);
					
					JLabel lb3 = new JLabel(heroe.getPublisher());
					lb3.setLocation(posicionx1, 340);
					lb3.setSize(100, 50);
					//getContentPane().add(lb3);
					p.add(lb3);
					
					JLabel lb4 = new JLabel(heroe.getAlter_ego());
					lb4.setLocation(posicionx1, 360);
					lb4.setSize(200, 50);
					//getContentPane().add(lb4);
					p.add(lb4);
					
					JLabel lb5 = new JLabel(heroe.getFirst_appearance());
					lb5.setLocation(posicionx1, 380);
					lb5.setSize(200, 50);
					//getContentPane().add(lb5);
					p.add(lb5);
					
					JLabel lb6 = new JLabel(heroe.getCharacters());
					lb6.setLocation(posicionx1, 400);
					lb6.setSize(200, 50);
					//getContentPane().add(lb6);
					p.add(lb6);
					
					posicionx1 += 500;

				}if(numero>4 && numero<=6){
					
					JLabel lb1 = new JLabel(heroe.getId());
					lb1.setLocation(posicionx1, 300);
					lb1.setSize(100, 50);
					//getContentPane().add(lb1);
					p.add(lb1);
					
					JLabel lb2 = new JLabel(heroe.getSuperhero());
					lb2.setLocation(posicionx1, 320);
					lb2.setSize(100, 50);
					//getContentPane().add(lb2);
					p.add(lb2);
					
					JLabel lb3 = new JLabel(heroe.getPublisher());
					lb3.setLocation(posicionx1, 340);
					lb3.setSize(100, 50);
					//getContentPane().add(lb3);
					p.add(lb3);
					
					JLabel lb4 = new JLabel(heroe.getAlter_ego());
					lb4.setLocation(posicionx1, 360);
					lb4.setSize(200, 50);
					//getContentPane().add(lb4);
					p.add(lb4);
					
					JLabel lb5 = new JLabel(heroe.getFirst_appearance());
					lb5.setLocation(posicionx1, 380);
					lb5.setSize(200, 50);
					//getContentPane().add(lb5);
					p.add(lb5);
					
					JLabel lb6 = new JLabel(heroe.getCharacters());
					lb6.setLocation(posicionx1, 400);
					lb6.setSize(200, 50);
					//getContentPane().add(lb6);
					p.add(lb6);
					
					posicionx1 += 500;
					
				}if (numero==7){
					posicionx1 = 300;
					
					JLabel lb1 = new JLabel(heroe.getId());
					lb1.setLocation(posicionx1, 600);
					lb1.setSize(100, 20);
					//getContentPane().add(lb1);
					p.add(lb1);

					JLabel lb2 = new JLabel(heroe.getSuperhero());
					lb2.setLocation(posicionx1, 620);
					lb2.setSize(100, 20);
					//getContentPane().add(lb2);
					p.add(lb2);
					
					JLabel lb3 = new JLabel(heroe.getPublisher());
					lb3.setLocation(posicionx1, 640);
					lb3.setSize(100, 20);
					//getContentPane().add(lb3);
					p.add(lb3);
					
					JLabel lb4 = new JLabel(heroe.getAlter_ego());
					lb4.setLocation(posicionx1, 660);
					lb4.setSize(200, 20);
					//getContentPane().add(lb4);
					p.add(lb4);
					
					JLabel lb5 = new JLabel(heroe.getFirst_appearance());
					lb5.setLocation(posicionx1, 680);
					lb5.setSize(200, 20);
					//getContentPane().add(lb5);
					p.add(lb5);
					
					JLabel lb6 = new JLabel(heroe.getCharacters());
					lb6.setLocation(posicionx1, 700);
					lb6.setSize(200, 20);
					//getContentPane().add(lb6);
					p.add(lb6);
					
					posicionx1 += 500;
					
				}if(numero>7 && numero<=9) {
					
					JLabel lb1 = new JLabel(heroe.getId());
					lb1.setLocation(posicionx1, 600);
					lb1.setSize(100, 20);
					//getContentPane().add(lb1);
					p.add(lb1);

					JLabel lb2 = new JLabel(heroe.getSuperhero());
					lb2.setLocation(posicionx1, 620);
					lb2.setSize(100, 20);
					//getContentPane().add(lb2);
					p.add(lb2);
					
					JLabel lb3 = new JLabel(heroe.getPublisher());
					lb3.setLocation(posicionx1, 640);
					lb3.setSize(100, 20);
					//getContentPane().add(lb3);
					p.add(lb3);
					
					JLabel lb4 = new JLabel(heroe.getAlter_ego());
					lb4.setLocation(posicionx1, 660);
					lb4.setSize(200, 20);
					//getContentPane().add(lb4);
					p.add(lb4);
					
					JLabel lb5 = new JLabel(heroe.getFirst_appearance());
					lb5.setLocation(posicionx1, 680);
					lb5.setSize(200, 20);
					//getContentPane().add(lb5);
					p.add(lb5);
					
					JLabel lb6 = new JLabel(heroe.getCharacters());
					lb6.setLocation(posicionx1, 700);
					lb6.setSize(200, 20);
					//getContentPane().add(lb6);
					p.add(lb6);
					
					posicionx1 += 500;
					
				}if(numero==10) {
					posicionx1 = 800;
					
					JLabel lb1 = new JLabel(heroe.getId());
					lb1.setLocation(posicionx1, 900);
					lb1.setSize(100, 20);
					//getContentPane().add(lb1);
					p.add(lb1);
					
					JLabel lb2 = new JLabel(heroe.getSuperhero());
					lb2.setLocation(posicionx1, 920);
					lb2.setSize(100, 20);
					//getContentPane().add(lb2);
					p.add(lb2);
					
					JLabel lb3 = new JLabel(heroe.getPublisher());
					lb3.setLocation(posicionx1, 940);
					lb3.setSize(100, 20);
					//getContentPane().add(lb3);
					p.add(lb3);
					
					JLabel lb4 = new JLabel(heroe.getAlter_ego());
					lb4.setLocation(posicionx1, 960);
					lb4.setSize(200, 20);
					//getContentPane().add(lb4);
					p.add(lb4);
					
					JLabel lb5 = new JLabel(heroe.getFirst_appearance());
					lb5.setLocation(posicionx1, 980);
					lb5.setSize(200, 20);
					//getContentPane().add(lb5);
					p.add(lb5);
					
					JLabel lb6 = new JLabel(heroe.getCharacters());
					lb6.setLocation(posicionx1, 1000);
					lb6.setSize(200, 20);
					//getContentPane().add(lb6);
					p.add(lb6);
				}
				
				numero += 1;
			}
		
		
		
		add(scroll);
		
		
		
		

		
	
	}
}
