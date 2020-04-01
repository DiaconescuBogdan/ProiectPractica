package model;

public class fel2 {
	
      String nume;
      float cantitate;
      float pret;
      String garnitura;
      
	public fel2(String nume, float cantitate, float pret, String garnitura) {
		super();
		this.nume = nume;
		this.cantitate = cantitate;
		this.pret = pret;
		this.garnitura = garnitura;
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

	public String getGarnitura() {
		return garnitura;
	}

	public void setGarnitura(String garnitura) {
		this.garnitura = garnitura;
	}

	public fel2() {
		// TODO Auto-generated constructor stub
	}

}
