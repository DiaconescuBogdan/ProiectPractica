package model;

public class racoritoare {
	
	String nume;
	int cantitate;
	String tip;
	float pret;

	public racoritoare(String nume, int cantitate, String tip, float pret) {
		super();
		this.nume = nume;
		this.cantitate = cantitate;
		this.tip = tip;
		this.pret = pret;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getCantitate() {
		return cantitate;
	}

	public void setCantitate(int cantitate) {
		this.cantitate = cantitate;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public float getPret() {
		return pret;
	}

	public void setPret(float pret) {
		this.pret = pret;
	}

	public racoritoare() {
		// TODO Auto-generated constructor stub
	}

}
