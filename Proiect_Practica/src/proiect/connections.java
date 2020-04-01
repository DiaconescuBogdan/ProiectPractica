package proiect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import model.*;
import xml.*;

public class connections {

	private ArrayList<racoritoare> lista_racoritoare;
	private ArrayList<bauturi_alcoolice> lista_bauturi_alcoolice;
	private ArrayList<fel1> lista_fel1;
	private ArrayList<fel2> lista_fel2;
	private ArrayList<desert> lista_desert;

	public connections(ArrayList<racoritoare> lista_racoritoare, ArrayList<bauturi_alcoolice> lista_bauturi_alcoolice,
			ArrayList<fel1> lista_fel1, ArrayList<fel2> lista_fel2, ArrayList<desert> lista_desert) {
		super();
		this.lista_racoritoare = lista_racoritoare;
		this.lista_bauturi_alcoolice = lista_bauturi_alcoolice;
		this.lista_fel1 = lista_fel1;
		this.lista_fel2 = lista_fel2;
		this.lista_desert = lista_desert;
	}

	public connections() {
		// TODO Auto-generated constructor stub
	}

	public ArrayList<racoritoare> getLista_racoritoare() {
		return lista_racoritoare;
	}

	public ArrayList<bauturi_alcoolice> getLista_bauturi_alcoolice() {
		return lista_bauturi_alcoolice;
	}

	public ArrayList<fel1> getLista_fel1() {
		return lista_fel1;
	}

	public ArrayList<fel2> getLista_fel2() {
		return lista_fel2;
	}

	public ArrayList<desert> getLista_desert() {
		return lista_desert;
	}

	public ArrayList<racoritoare> getRacoritoareFromDB() {

		ArrayList<racoritoare> lista_racoritoare1 = new ArrayList<racoritoare>();

		try {
			// create our mysql database connection
			String myDriver = "org.gjt.mm.mysql.Driver";
			String myUrl = "jdbc:mysql://localhost:3306/restaurant";
			Class.forName(myDriver);
			Connection conn = DriverManager.getConnection(myUrl, "root", "");

			String query = "SELECT * FROM racoritoare";

			// create the java statement
			Statement st = conn.createStatement();

			// execute the query, and get a java resultset
			ResultSet rs = st.executeQuery(query);

			// iterate through the java resultset

			while (rs.next()) {
				racoritoare u = new racoritoare();
				u.setNume(rs.getString("nume"));
				u.setCantitate(rs.getInt("cantitate"));
				u.setTip(rs.getString("tip"));
				u.setPret(rs.getFloat("pret"));

				lista_racoritoare1.add(u);

			}

			for (int i = 0; i < lista_racoritoare1.size(); i++)
				System.out.println("Racoritoare nume= " + lista_racoritoare1.get(i).getNume() + " cantitate= "
						+ lista_racoritoare1.get(i).getCantitate() + "ml" + " tip= "
						+ lista_racoritoare1.get(i).getTip() + " pret= " + lista_racoritoare1.get(i).getPret() + "lei");
			System.out.println();

		} catch (Exception e) {
			System.err.println("Got an exception! ");
			System.err.println(e.getMessage());
		}
		return lista_racoritoare1;

	}

	public ArrayList<bauturi_alcoolice> getBauturiAlcooliceFromDB() {

		ArrayList<bauturi_alcoolice> lista_bauturi_alcoolice = new ArrayList<bauturi_alcoolice>();

		try {
			// create our mysql database connection
			String myDriver = "org.gjt.mm.mysql.Driver";
			String myUrl = "jdbc:mysql://localhost:3306/restaurant";
			Class.forName(myDriver);
			Connection conn = DriverManager.getConnection(myUrl, "root", "");
			String query1 = "SELECT * FROM bauturi_alcoolice";

			// create the java statement
			Statement st1 = conn.createStatement();

			// execute the query, and get a java resultset
			ResultSet rs1 = st1.executeQuery(query1);

			// iterate through the java resultset

			while (rs1.next()) {
				bauturi_alcoolice u = new bauturi_alcoolice();
				u.setNume(rs1.getString("nume"));
				u.setCantitate(rs1.getInt("cantitate"));
				u.setVol_alc(rs1.getFloat("vol_alc"));
				u.setPret(rs1.getFloat("pret"));

				lista_bauturi_alcoolice.add(u);

			}

			for (int i = 0; i < lista_bauturi_alcoolice.size(); i++)
				System.out.println("Bauturi_alcoolice nume= " + lista_bauturi_alcoolice.get(i).getNume()
						+ " cantitate= " + lista_bauturi_alcoolice.get(i).getCantitate() + "ml" + " vol_alc= "
						+ lista_bauturi_alcoolice.get(i).getVol_alc() + "%" + " pret= "
						+ lista_bauturi_alcoolice.get(i).getPret() + "lei");
			System.out.println();

		} catch (Exception e) {
			System.err.println("Got an exception! ");
			System.err.println(e.getMessage());
		}
		return lista_bauturi_alcoolice;

	}

	public ArrayList<fel1> getFel1FromDB() {

		ArrayList<fel1> lista_fel1 = new ArrayList<fel1>();

		try {
			// create our mysql database connection
			String myDriver = "org.gjt.mm.mysql.Driver";
			String myUrl = "jdbc:mysql://localhost:3306/restaurant";
			Class.forName(myDriver);
			Connection conn = DriverManager.getConnection(myUrl, "root", "");

			String query2 = "SELECT * FROM fel1";

			// create the java statement
			Statement st2 = conn.createStatement();

			// execute the query, and get a java resultset
			ResultSet rs2 = st2.executeQuery(query2);

			while (rs2.next()) {
				fel1 u = new fel1();
				u.setNume(rs2.getString("nume"));
				u.setCantitate(rs2.getInt("cantitate"));
				u.setIngrediente(rs2.getString("ingrediente"));
				u.setPret(rs2.getFloat("pret"));

				lista_fel1.add(u);

			}

			for (int i = 0; i < lista_fel1.size(); i++)
				System.out.println("Fel1 nume= " + lista_fel1.get(i).getNume() + "cantitate= "
						+ lista_fel1.get(i).getCantitate() + "gr" + " ingrediente= "
						+ lista_fel1.get(i).getIngrediente() + " pret= " + lista_fel1.get(i).getPret() + "lei");
			System.out.println();

		} catch (Exception e) {
			System.err.println("Got an exception! ");
			System.err.println(e.getMessage());
		}
		return lista_fel1;
	}

	public ArrayList<fel2> getFel2FromDB() {

		ArrayList<fel2> lista_fel2 = new ArrayList<fel2>();

		try {
			// create our mysql database connection
			String myDriver = "org.gjt.mm.mysql.Driver";
			String myUrl = "jdbc:mysql://localhost:3306/restaurant";
			Class.forName(myDriver);
			Connection conn = DriverManager.getConnection(myUrl, "root", "");

			String query3 = "SELECT * FROM fel2";

			// create the java statement
			Statement st3 = conn.createStatement();

			// execute the query, and get a java resultset
			ResultSet rs3 = st3.executeQuery(query3);

			while (rs3.next()) {
				fel2 u = new fel2();
				u.setNume(rs3.getString("nume"));
				u.setCantitate(rs3.getInt("cantitate"));
				u.setGarnitura(rs3.getString("garnitura"));
				u.setPret(rs3.getFloat("pret"));

				lista_fel2.add(u);

			}

			for (int i = 0; i < lista_fel2.size(); i++)
				System.out.println("Fel2 nume= " + lista_fel2.get(i).getNume() + " cantitate= "
						+ lista_fel2.get(i).getCantitate() + "gr " + " garnitura= " + lista_fel2.get(i).getGarnitura()
						+ " pret= " + lista_fel2.get(i).getPret() + "lei");
			System.out.println();

		} catch (Exception e) {
			System.err.println("Got an exception! ");
			System.err.println(e.getMessage());
		}
		return lista_fel2;
	}

	public ArrayList<desert> getDesertFromDB() {

		ArrayList<desert> lista_desert = new ArrayList<desert>();

		try {
			// create our mysql database connection
			String myDriver = "org.gjt.mm.mysql.Driver";
			String myUrl = "jdbc:mysql://localhost:3306/restaurant";
			Class.forName(myDriver);
			Connection conn = DriverManager.getConnection(myUrl, "root", "");

			String query4 = "SELECT * FROM desert";

			// create the java statement
			Statement st4 = conn.createStatement();

			// execute the query, and get a java resultset
			ResultSet rs4 = st4.executeQuery(query4);

			// iterate through the java resultset

			while (rs4.next()) {
				desert u = new desert();
				u.setNume(rs4.getString("nume"));
				u.setCantitate(rs4.getInt("cantitate"));

				u.setPret(rs4.getFloat("pret"));

				lista_desert.add(u);

			}

			for (int i = 0; i < lista_desert.size(); i++)
				System.out.println("Desert nume= " + lista_desert.get(i).getNume() + " cantitate= "
						+ lista_desert.get(i).getCantitate() + "gr " + " pret= " + lista_desert.get(i).getPret()
						+ "lei");
			System.out.println();

		} catch (Exception e) {
			System.err.println("Got an exception! ");
			System.err.println(e.getMessage());
		}
		return lista_desert;
	}
}
