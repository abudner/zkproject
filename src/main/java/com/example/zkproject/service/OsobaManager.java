package com.example.zkproject.service;

import java.util.ArrayList;

import java.util.List;



import com.example.zkproject.domain.Osoba;






public class OsobaManager {
	
	
	private List<Osoba> osoby = new ArrayList<Osoba>();
	public void dodajOsobe(Osoba osoba) {
		osoby.add(osoba);
	}
	public List<Osoba> getOsoby() {
		return osoby;
	}
	
	
	  public OsobaManager() {
	        initManager();
	    }
	 

	
	private void initManager() {
	
		
		osoby.add(new Osoba("Aneta" , "Budner", "564-845-687") );
		osoby.add(new Osoba("Katarzyna" , "Nowak", "345-765-567") );
		osoby.add(new Osoba("Tomasz" , "Kowalski", "342-346-643") );
		osoby.add(new Osoba("Marta" , "Tomaszewska", "645-375-956") );
		
		
		
		
		
	}
	

	public void usunOsoba(Osoba m) {
		osoby.remove(m);
	}
	
	

	 
	  
	  
	


}
