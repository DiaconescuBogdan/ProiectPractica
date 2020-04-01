package model;

public class desert {
	
	 String nume;
     float cantitate;
     float pret;

	public desert(String nume, float cantitate, float pret) {
		super();
		this.nume = nume;
		this.cantitate = cantitate;
		this.pret = pret;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public float getCantitate() {
		return cantitate;
	}

	public void setCantitate(float cantitate) {
		this.cantitate = cantitate;
	}

	public float getPret() {
		return pret;
	}

	public void setPret(float pret) {
		this.pret = pret;
	}

	public desert() {
		// TODO Auto-generated constructor stub
	}

}
