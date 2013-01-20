package com.example.zkproject.domain;

import org.zkoss.bind.annotation.DependsOn;

public class Osoba {
	

	private String imie;
	private String nazwisko;
	private String telefon;
	
	
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	
	public Osoba(String imie, String nazwisko, String telefon) {
		setImie(imie);
		setNazwisko(nazwisko);
		setTelefon(telefon);
		
	}
	
	public Osoba(){
		
		
		
	}
	
	
	@DependsOn({ "imie", "nazwisko" })
	public String getPobierzImieNazwisko() {
		return getImie() + " " + getNazwisko();
	}
	

}
