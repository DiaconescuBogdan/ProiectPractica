package model;

public class bauturi_alcoolice {

	String nume;
	int cantitate;
	float pret;
	float vol_alc;

	public bauturi_alcoolice(String nume, int cantitate, float pret, float vol_alc) {
		super();
		this.nume = nume;
		this.cantitate = cantitate;
		this.pret = pret;
		this.vol_alc = vol_alc;
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

	public float getPret() {
		return pret;
	}

	public void setPret(float pret) {
		this.pret = pret;
	}

	public float getVol_alc() {
		return vol_alc;
	}

	public void setVol_alc(float vol_alc) {
		this.vol_alc = vol_alc;
	}

	public bauturi_alcoolice() {
		// TODO Auto-generated constructor stub
	}

}
