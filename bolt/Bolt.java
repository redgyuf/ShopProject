package bolt;

import java.util.Vector;

public class Bolt {
	private String nev;
	private String cim;
	private String tulajdonos;
	private Vector tejpult;
	private int flag;
	
	public Bolt(String nev, String cim, String tulajdonos, Vector tejpult) {
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
	
	public Tej vasrolTej(Tej m){
		return m;		
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
	
	
	
}
