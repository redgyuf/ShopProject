package bolt;


import java.util.Hashtable;

import bolt.aruk.Elelmiszer;
import bolt.aruk.Tej;

public class Bolt {
	private String nev;
	private String cim;
	private String tulajdonos;
	private Hashtable tejpult;
	
	public Bolt(String nev, String cim, String tulajdonos, Hashtable tejpult) {
		super();
		this.nev = nev;
		this.cim = cim;
		this.tulajdonos = tulajdonos;
		this.tejpult = tejpult;
	}	
		
	public Bolt(String nev, String cim, String tulajdonos) {
		super();
		this.nev = nev;
		this.cim = cim;
		this.tulajdonos = tulajdonos;
	}



	private boolean vanMegAdottAru(Class<?> c){
		return false;
	}
	
	public boolean vanMegTej(){
		return false;
	}
	
	public boolean vanMegSajt(){
		return false;
	}
	
	public void vasrolElelmiszert(Long vonalKod, long mennyiseg){		
	}
	public void torolElelmiszert(Long vonalKod){		
	}
	
	public void feltoltElelmiszerrel(Long vonalKod, long mennyiseg){		
	}
	
	public void feltoltUjElelmiszerrel(Elelmiszer e, long mennyiseg, long ar){	
	}

	public String getNev() {
		return nev;
	}

	public String getCim() {
		return cim;
	}

	public String getTulajdonos() {
		return tulajdonos;
	}
	
	class BoltBejegyzes {
		private Elelmiszer e;
		private long mennyiseg;
		private long ar;
		
		public BoltBejegyzes(Elelmiszer e, long mennyiseg, long ar){
			this.e = e;
			this.mennyiseg = mennyiseg;
			this.ar = ar;
		}
		
		public Elelmiszer getElelmiszer(){
			return e;			
		}
		
		public void setElelmiszer(Elelmiszer e){
			this.e = e;
		}
		
		public long getMennyiseg(){
			return mennyiseg;
		}
		
		public void setMennyiseg(long mennyiseg){
			this.mennyiseg = mennyiseg;
		}
		
		public void adMennyiseg(long mennyiseg){
			this.mennyiseg += mennyiseg;
		}
		
		public void levonMennyiseg(long mennyiseg){
			this.mennyiseg -= mennyiseg;
		}
		
		public long getAr(){
			return ar;
		}
		
		public void setAr(int ar){
			this.ar = ar;
		}
		
	}
	
}
