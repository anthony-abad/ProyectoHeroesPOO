package com.heroes;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTextField;

import com.buscar.BuscarHeroeDc;
import com.buscar.BuscarHeroeMarvel;
import com.heroes.dominio.Heroe;
import com.heroes.repository.HeroeRepositoryDC;
import com.heroes.repository.HeroeRepositoryMarvel;

public class VentanaPrincipal extends JFrame {
	String name;
	String buscarHeroe;
	public VentanaPrincipal() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(null);
		
		this.getContentPane().setBackground(Color.orange);
		this.setTitle("SUPER HEROES");
		setSize(550, 600);
		
		//BOTONES
	
		JButton btn = new JButton("MARVEL");
		btn.setBounds(100, 100, 100, 100);
		btn.setBackground(Color.cyan);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// procesos de click
				SuperHeroeMarvel frm = new SuperHeroeMarvel();
				frm.setVisible(true);
				setVisible(false);
			}
		});
		
		
		
		JButton btn1 = new JButton("DC");
		btn1.setBounds(300, 100, 100, 100);
		btn1.setBackground(Color.magenta);
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// procesos de click
				SuperHeroeDc frm = new SuperHeroeDc();
				frm.setVisible(true);
				setVisible(false);
			}
		});
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.green);
		panel.setBounds(100, 300, 350, 150);
		panel.setVisible(true);
		
		//CAJA DE REGISTRAR
		
		JLabel registrese = new JLabel("REGISTRESE");
		registrese.setBackground(Color.cyan);
		registrese.setBounds(150, -10, 100, 50);
		
		JLabel nombre = new JLabel("INGRESE SU NOMBRE: ");
		nombre.setBackground(Color.cyan);
		nombre.setBounds(10, 20, 150, 50);
		
		JTextField registro = new JTextField();
		registro.setBounds(170, 35, 150, 20);
		registro.setText("registrese...");
		registro.setBackground(Color.cyan);
		registro.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String nombre = registro.getText();
				JLabel bienvenido = new JLabel("BIENVENIDO A LA PLATAFORMA: " + nombre);
				bienvenido.setBounds(10, 50, 200, 50);
				bienvenido.setBackground(Color.cyan);
				panel.add(bienvenido);
			}
				
		});
		
		
		
		
		
		//CAJAS DE BUSCAR
		
		JTextField cajadc = new JTextField();
		cajadc.setBounds(300, 20, 150, 20);
		cajadc.setText("Buscar en DC...");
		cajadc.setBackground(Color.cyan);
		cajadc.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String valor = cajadc.getText();
				BuscarHeroeDc ventana = new BuscarHeroeDc(valor);
				ventana.setVisible(true);
			}
		});
		
		JTextField cajamarvel = new JTextField();
		cajamarvel.setBounds(100, 20, 150, 20);
		cajamarvel.setText("Buscar en Marvel...");
		cajamarvel.setBackground(Color.cyan);
		cajamarvel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String valor = cajamarvel.getText();
				BuscarHeroeMarvel ventana = new BuscarHeroeMarvel(valor);
				ventana.setVisible(true);
				
			}
		});
		
		
		panel.add(registrese);
		panel.add(registro);
		panel.add(nombre);
		
		
		
		
		getContentPane().add(btn);
		getContentPane().add(btn1);
		getContentPane().add(cajadc);
		getContentPane().add(cajamarvel);
		getContentPane().add(panel);
		

		

	}
	

}