package model;

public class fel1 {
  
	String  nume;
	float cantitate;
	float pret;
	String ingrediente;
	
	public fel1(String nume, float cantitate, float pret, String ingrediente) {
		super();
		this.nume = nume;
		this.cantitate = cantitate;
		this.pret = pret;
		this.ingrediente = ingrediente;
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

	public String getIngrediente() {
		return ingrediente;
	}

	public void setIngrediente(String ingrediente) {
		this.ingrediente = ingrediente;
	}

	public fel1() {
		// TODO Auto-generated constructor stub
	}

}
