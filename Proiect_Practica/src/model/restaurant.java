package model;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Restaurant")
@XmlAccessorType(XmlAccessType.FIELD)
public class restaurant {

	@XmlElement(name = "Bauturi Alcoolice")
	private ArrayList<bauturi_alcoolice> lista_bauturi_alcoolice = null;

	@XmlElement(name = "Racoritoare")
	private ArrayList<racoritoare> lista_racoritoare = null;

	@XmlElement(name = "Fel1")
	private ArrayList<fel1> lista_fel1 = null;

	@XmlElement(name = "Fel2")
	private ArrayList<fel2> lista_fel2 = null;

	@XmlElement(name = "Desert")
	private ArrayList<desert> lista_desert = null;

	public restaurant(ArrayList<bauturi_alcoolice> lista_bauturi_alcoolice, ArrayList<racoritoare> lista_racoritoare,
			ArrayList<fel1> lista_fel1, ArrayList<fel2> lista_fel2, ArrayList<desert> lista_desert) {
		super();
		this.lista_bauturi_alcoolice = lista_bauturi_alcoolice;
		this.lista_racoritoare = lista_racoritoare;
		this.lista_fel1 = lista_fel1;
		this.lista_fel2 = lista_fel2;
		this.lista_desert = lista_desert;
	}

	public ArrayList<bauturi_alcoolice> getLista_bauturi_alcoolice() {
		return lista_bauturi_alcoolice;
	}

	public void setLista_bauturi_alcoolice(ArrayList<bauturi_alcoolice> lista_bauturi_alcoolice) {
		this.lista_bauturi_alcoolice = lista_bauturi_alcoolice;
	}

	public ArrayList<racoritoare> getLista_racoritoare() {
		return lista_racoritoare;
	}

	public void setLista_racoritoare(ArrayList<racoritoare> lista_racoritoare) {
		this.lista_racoritoare = lista_racoritoare;
	}

	public ArrayList<fel1> getLista_fel1() {
		return lista_fel1;
	}

	public void setLista_fel1(ArrayList<fel1> lista_fel1) {
		this.lista_fel1 = lista_fel1;
	}

	public ArrayList<fel2> getLista_fel2() {
		return lista_fel2;
	}

	public void setLista_fel2(ArrayList<fel2> lista_fel2) {
		this.lista_fel2 = lista_fel2;
	}

	public ArrayList<desert> getLista_desert() {
		return lista_desert;
	}

	public void setLista_desert(ArrayList<desert> lista_desert) {
		this.lista_desert = lista_desert;
	}

	public restaurant() {
		super();
		// TODO Auto-generated constructor stub
	}

}
