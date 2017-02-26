package bolt;


import java.util.Hashtable;

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



	public boolean vanMegTej(){
		return false;
	}
	
	public Tej vasrolTej(Long vonalKod){
		return null;		
	}
	
	public void feltoltTej(Tej m){
		
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
		private Tej t;
		private int mennyiseg;
		private int ar;
		
		public BoltBejegyzes(Tej t, int mennyiseg, int ar){
			this.t = t;
			this.mennyiseg = mennyiseg;
			this.ar = ar;
		}
		
		public Tej getT(){
			return t;			
		}
		
		public void setT(Tej t){
			
		}
		
		public int getMennyiseg(){
			return mennyiseg;
		}
		
		public void setMennyiseg(int mennyiseg){
			this.mennyiseg = mennyiseg;
		}
		
		public void adMennyiseg(int mennyiseg){
			this.mennyiseg += mennyiseg;
		}
		
		public void levonMennyiseg(int mennyiseg){
			this.mennyiseg -= mennyiseg;
		}
		
		public int getAr(){
			return ar;
		}
		
		public void setAr(int ar){
			this.ar = ar;
		}
		
	}
	
}
