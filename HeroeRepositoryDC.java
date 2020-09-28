package com.heroes.repository;

import java.util.ArrayList;

import com.heroes.dominio.Heroe;

public class HeroeRepositoryDC {
	ArrayList<Heroe> heroesDC = new ArrayList<>();
	
	public HeroeRepositoryDC() {
		Heroe  h1 = new Heroe("dc-batman",
				"Batman",
				"DC Comics",
				"Bruce Wayne",
				"Detective Comics #27",
				"Bruce Wayne");
		
		Heroe h2 = new Heroe("dc-superman", 
				"Superman", 
				"DC Comics", 
				"Kal-El", 
				"Action Comics #1",
				"Kal-El");
		
		Heroe h3 = new Heroe("dc-flash", 
				"Flash", 
				"DC Comics", 
				"Jay Garrick", 
				"Flash Comics #1",
				"Jay Garrick, Barry Allen, Wally West, Bart Allen");
		
		Heroe h4 = new Heroe("dc-green", 
				"Green Lantern ", 
				"DC Comics", 
				"Alan Scott", 
				"All-American Comics #16", 
				"Alan Scott, Hal Jordan, Guy Gardner, John Stewart, Kyle Raynor, Jade, Sinestro, Simon Baz");
		
		Heroe h5 = new Heroe("dc-arrow", 
				"Green Arrow ", 
				"DC Comics", 
				"Oliver Queen", 
				"More Fun Comics #73", 
				"Oliver Queen");
		
		Heroe h6 = new Heroe("dc-wonder", 
				"Wonder Woman", 
				"DC Comics", 
				"Princess Diana", 
				"All Star Comics #8", 
				"Princess Diana");
		
		Heroe h7 = new Heroe("dc-martian", 
				"Martian Manhunter", 
				"DC Comics", 
				"J\\onn J\\onzz", 
				"Detective Comics #225", 
				"Martian Manhunter");
		
		Heroe h8 = new Heroe("dc-robin", 
				"Robin/Nightwing", "DC Comics",
				"Dick Grayson", 
				"Detective Comics #38",
				"Dick Grayson");
		
		Heroe h9 = new Heroe("dc-blue",
				"Blue Beetle", "DC Comics",
				"Dan Garret",
				"Mystery Men Comics #1",
				"Dan Garret, Ted Kord, Jaime Reyes");
		
		Heroe h10 = new Heroe("dc-black", 
				"Black Canary ", 
				"DC Comics", 
				"Dinah Drake", 
				"Flash Comics #86",
				"Dinah Drake, Dinah Lance");
		
		
		heroesDC.add(h1);
		heroesDC.add(h2);
		heroesDC.add(h3);
		heroesDC.add(h4);
		heroesDC.add(h5);
		heroesDC.add(h6);
		heroesDC.add(h7);
		heroesDC.add(h8);
		heroesDC.add(h9);
		heroesDC.add(h10);
		
	}
	
	/*
	public ArrayList<Heroe> getHeroePorPublisher(String publisher){
		ArrayList<Heroe> result = new ArrayList<>();
		
		for(Heroe h: heroesDC) {
			if(h.getPublisher().equals(publisher))
				result.add(h);
		}
		
		return result;
	}
*/
	public ArrayList<Heroe> getHeroes() {
		return heroesDC;
	}
	
	
}
