package bolt;

import java.util.Date;

public class Tej {

	
	
	private final int LITER = 10;
	private final int FELLITER = 5;
	private final int POHAR = 2;
	private final double ZSIROS = 3.6;
	private final double FELZSIROS = 2.8;
	
	protected long vonalKod;
	protected int urtaratalom;
	protected String gyarto;
	protected Date szavatossagiIdo;
	protected double zsirtartalom;
	
	public Tej(long vonalKod, int urtaratalom, String gyarto, Date szavatossagiIdo, double zsirtartalom) {
		super();
		this.vonalKod = vonalKod;
		this.urtaratalom = urtaratalom;
		this.gyarto = gyarto;
		this.szavatossagiIdo = szavatossagiIdo;
		this.zsirtartalom = zsirtartalom;
	}

	public boolean joMeg(){
		return false;	
	}
	
	public long getVonalKod() {
		return vonalKod;
	}

	public int getUrtaratalom() {
		return urtaratalom;
	}

	public String getGyarto() {
		return gyarto;
	}

	public Date getSzavatossagiIdo() {
		return szavatossagiIdo;
	}

	public double getZsirtartalom() {
		return zsirtartalom;
	}


	@Override
	public String toString() {
		return "Tej [urtaratalom=" + urtaratalom + ", gyarto=" + gyarto + ", szavatossagiIdo=" + szavatossagiIdo
				+ ", zsirtartalom=" + zsirtartalom + "]";
	}
	
	
	
	
}
