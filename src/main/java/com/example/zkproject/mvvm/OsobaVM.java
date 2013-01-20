package com.example.zkproject.mvvm;

import java.util.ArrayList;
import java.util.List;

import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;

import org.zkoss.zk.ui.select.annotation.Wire;




import com.example.zkproject.domain.Osoba;
import com.example.zkproject.service.OsobaManager;







public class OsobaVM {
	
	private Osoba selected;
	private Osoba nowaOsoba = new Osoba();
	
	 public Osoba getNowaOsoba() {
		return nowaOsoba;
	}

	public void setNowaOsoba(Osoba nowaOsoba) {
		this.nowaOsoba = nowaOsoba;
	}

	public OsobaManager getOsobaManager() {
	        return osobaManager;
	    }
    @Wire("#mojeOkno")
	

	
	OsobaManager osobaManager = new OsobaManager();
	



	private List<Osoba> osoby = new ArrayList<Osoba>(new OsobaManager().getOsoby());
	
	

	
	

	@Init
	public void init() {	// Initialize
		selected = osoby.get(0); // Selected First One
		//osoby = new OsobaManager().getOsoby();
	}
	
	public List<Osoba> getOsobaList() {
		return osoby;
	}

	public void setSelectedOsoba(Osoba selected) {
		this.selected = selected;
	}

	public Osoba getSelectedOsoba() {
		return selected;
	}
	
	
	 @Command
	 @NotifyChange("osobaManager")
	public void usun(@BindingParam("osb") Osoba mojaOsoba) {
     osobaManager.usunOsoba(mojaOsoba);
	}
	   
	 
	 @Command
	 @NotifyChange("osobaManager")
		public void dodaj(){
			
			osobaManager.dodajOsobe(nowaOsoba);
		}

	
    

	


}
