package com.heroes.repository;

import java.util.ArrayList;

import com.heroes.dominio.Heroe;

public class HeroeRepositoryMarvel {
	ArrayList<Heroe> heroesMarvel = new ArrayList<>();
	
	public HeroeRepositoryMarvel() {
		
		Heroe  h1 = new Heroe("marvel-captain",
				"Captain America",
				"Marvel Comics",
				"Steve Rogers",
				"Captain America Comics #1",
				"Steve Rogers");
		
		Heroe  h2 = new Heroe("marvel-spider",
				"Spider Man",
				"Marvel Comics",
				"Peter Parker",
				"Amazing Fantasy #15",
				"Peter Parker");
		
		Heroe  h3 = new Heroe("marvel-iron",
				"Iron Man",
				"Marvel Comics",
				"Tony Stark",
				"Tales of Suspense #39",
				"Tony Stark");
		
		Heroe  h4 = new Heroe("marvel-thor",
				"Thor",
				"Marvel Comics",
				"Thor Odinson",
				"Journey into Myster #83",
				"Thor Odinson");
		
		Heroe  h5 = new Heroe("marvel-hulk",
				"Hulk",
				"Marvel Comics",
				"Bruce Banner",
				"The Incredible Hulk #1",
				"Bruce Banner");
		
		Heroe  h6 = new Heroe("marvel-wolverine",
				"Wolverine ",
				"Marvel Comics",
				"James Howlett",
				"The Incredible Hulk #180",
				"James Howlett");
		
		Heroe  h7 = new Heroe("marvel-daredevil",
				"Daredevil",
				"Marvel Comics",
				"Matthew Michael Murdock",
				"Daredevil #1",
				"Matthew Michael Murdock");
		
		Heroe  h8 = new Heroe("marvel-hawkeye",
				"Hawkeye",
				"Marvel Comics",
				"Clinton Francis Barton",
				"Tales of Suspense #57",
				"Clinton Francis Barton");
		
		Heroe  h9 = new Heroe("marvel-cyclops",
				"Cyclops",
				"Marvel Comics",
				"Scott Summers",
				"X-Men #1",
				"Scott Summers");
		
		Heroe  h10 = new Heroe("marvel-silver",
				"Silver Surfer",
				"Marvel Comics",
				"Norrin Radd",
				"The Fantastic Four #48",
				"Norrin Radd");
		
		
		
		heroesMarvel.add(h1);
		heroesMarvel.add(h2);
		heroesMarvel.add(h3);
		heroesMarvel.add(h4);
		heroesMarvel.add(h5);
		heroesMarvel.add(h6);
		heroesMarvel.add(h7);
		heroesMarvel.add(h8);
		heroesMarvel.add(h9);
		heroesMarvel.add(h10);
	}
	
	
	public ArrayList<Heroe> getHeroePorPublisher(String publisher){
		ArrayList<Heroe> result = new ArrayList<>();
		
		for(Heroe h: heroesMarvel) {
			if(h.getPublisher().equals(publisher))
				result.add(h);
		}
		
		return result;
	}

	public ArrayList<Heroe> getHeroes() {
		return heroesMarvel;
	}
	
	
}
