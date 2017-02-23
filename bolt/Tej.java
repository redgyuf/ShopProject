package bolt;
import java.util.Date;

public class Tej {

	private long vonalKod;
	
	private final int LITER = 10;
	private final int FELLITER = 5;
	private final int POHAR = 2;
	private final double ZSIROS = 3.6;
	private final double FELZSIROS = 2.8;
	
	private int urtaratalom;
	private String gyarto;
	private Date szavatossagiIdo;
	private double zsirtartalom;
	private long ar;
	
	public Tej(long vonalKod, int urtaratalom, String gyarto, Date szavatossagiIdo, double zsirtartalom, long ar) {
		super();
		this.vonalKod = vonalKod;
		this.urtaratalom = urtaratalom;
		this.gyarto = gyarto;
		this.szavatossagiIdo = szavatossagiIdo;
		this.zsirtartalom = zsirtartalom;
		this.ar = ar;
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

	public long getAr() {
		return ar;
	}

	@Override
	public String toString() {
		return "Tej [urtaratalom=" + urtaratalom + ", gyarto=" + gyarto + ", szavatossagiIdo=" + szavatossagiIdo
				+ ", zsirtartalom=" + zsirtartalom + ", ar=" + ar + "]";
	}
	
	
	
	
}
