package proiect;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;

import com.lowagie.text.DocumentException;

import model.racoritoare;
import xml.createXml;
import xml.marshalingExample;
import xml.pdf;

public class Controller implements ActionListener {

	private View view;
	private createXml createXml;
	private pdf pdf;
	private connections con;
	private marshalingExample jaxb;

	public Controller(View view, xml.createXml createXml, xml.pdf pdf, connections con, marshalingExample jaxb) {
		super();
		this.view = view;
		this.createXml = createXml;
		this.pdf = pdf;
		this.con = con;
		this.jaxb = jaxb;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Create XML using DOM")) {
			createXml.writeXmlFile(con.getRacoritoareFromDB(), con.getBauturiAlcooliceFromDB(), con.getFel1FromDB(),
					con.getFel2FromDB(), con.getDesertFromDB());

		} else if (e.getActionCommand().equals("Load From DB")) {
			ArrayList<racoritoare> r = con.getRacoritoareFromDB();
			con.getBauturiAlcooliceFromDB();
			con.getFel1FromDB();
			con.getFel2FromDB();
			con.getDesertFromDB();
		} else if (e.getActionCommand().equals("Create HTML")) {
			try {
				pdf.createHTML();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (TransformerException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		} else if (e.getActionCommand().equals("Create PDF+HTML")) {
			try {
				pdf.createPdf_Html();
			} catch (TransformerConfigurationException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (DocumentException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (TransformerException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} else if (e.getActionCommand().equals("Create XML using JAXB")) {
			try {
				jaxb.createJAXB();
			} catch (JAXBException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
