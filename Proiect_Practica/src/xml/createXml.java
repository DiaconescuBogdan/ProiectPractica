package xml;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
//import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
//import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import model.*;

public class createXml {

	public createXml() {
		// TODO Auto-generated constructor stub
	}

	public void writeXmlFile(ArrayList<racoritoare> list, ArrayList<bauturi_alcoolice> list1, ArrayList<fel1> list2,
			ArrayList<fel2> list3, ArrayList<desert> list4) {

		try {
			DocumentBuilderFactory dFact = DocumentBuilderFactory.newInstance();
			DocumentBuilder build = dFact.newDocumentBuilder();
			Document doc = build.newDocument();

			Element root = doc.createElement("Restaurant");
			doc.appendChild(root);

			for (racoritoare dtl : list) {

				Element racoritoare = doc.createElement("Racoritoare");
				root.appendChild(racoritoare);

				Element nume = doc.createElement("Nume");
				nume.appendChild(doc.createTextNode(String.valueOf(dtl.getNume())));
				racoritoare.appendChild(nume);

				Element cantitate = doc.createElement("Cantitate");
				cantitate.appendChild(doc.createTextNode(String.valueOf(dtl.getCantitate())));
				racoritoare.appendChild(cantitate);

				Element tip = doc.createElement("Tip");
				tip.appendChild(doc.createTextNode(String.valueOf(dtl.getTip())));
				racoritoare.appendChild(tip);

				Element pret = doc.createElement("Pret");
				pret.appendChild(doc.createTextNode(String.valueOf(dtl.getPret())));
				racoritoare.appendChild(pret);

			}

			// bauturi alcoolice

			for (bauturi_alcoolice dtl : list1) {

				Element bauturi_alcoolice = doc.createElement("BauturiAlcoolice");
				root.appendChild(bauturi_alcoolice);

				Element nume1 = doc.createElement("Nume");
				nume1.appendChild(doc.createTextNode(String.valueOf(dtl.getNume())));
				bauturi_alcoolice.appendChild(nume1);

				Element cantitate1 = doc.createElement("Cantitate");
				cantitate1.appendChild(doc.createTextNode(String.valueOf(dtl.getCantitate())));
				bauturi_alcoolice.appendChild(cantitate1);

				Element vol = doc.createElement("Volum_alcol");
				vol.appendChild(doc.createTextNode(String.valueOf(dtl.getVol_alc())));
				bauturi_alcoolice.appendChild(vol);

				Element pret1 = doc.createElement("Pret");
				pret1.appendChild(doc.createTextNode(String.valueOf(dtl.getPret())));
				bauturi_alcoolice.appendChild(pret1);

			}

			// fel1
			for (fel1 dtl : list2) {

				Element fel1 = doc.createElement("Fel1");
				root.appendChild(fel1);

				Element nume = doc.createElement("Nume");
				nume.appendChild(doc.createTextNode(String.valueOf(dtl.getNume())));
				fel1.appendChild(nume);

				Element cantitate = doc.createElement("Cantitate");
				cantitate.appendChild(doc.createTextNode(String.valueOf(dtl.getCantitate())));
				fel1.appendChild(cantitate);

				Element ingrediente = doc.createElement("Ingrediente");
				ingrediente.appendChild(doc.createTextNode(String.valueOf(dtl.getIngrediente())));
				fel1.appendChild(ingrediente);

				Element pret = doc.createElement("Pret");
				pret.appendChild(doc.createTextNode(String.valueOf(dtl.getPret())));
				fel1.appendChild(pret);

			}

			// fel2
			for (fel2 dtl : list3) {

				Element fel2 = doc.createElement("Fel2");
				root.appendChild(fel2);

				Element nume = doc.createElement("Nume");
				nume.appendChild(doc.createTextNode(String.valueOf(dtl.getNume())));
				fel2.appendChild(nume);

				Element cantitate = doc.createElement("Cantitate");
				cantitate.appendChild(doc.createTextNode(String.valueOf(dtl.getCantitate())));
				fel2.appendChild(cantitate);

				Element garnitura = doc.createElement("Garnitura");
				garnitura.appendChild(doc.createTextNode(String.valueOf(dtl.getGarnitura())));
				fel2.appendChild(garnitura);

				Element pret = doc.createElement("Pret");
				pret.appendChild(doc.createTextNode(String.valueOf(dtl.getPret())));
				fel2.appendChild(pret);

			}

			// desert
			for (desert dtl : list4) {

				Element desert = doc.createElement("Desert");
				root.appendChild(desert);

				Element nume = doc.createElement("Nume");
				nume.appendChild(doc.createTextNode(String.valueOf(dtl.getNume())));
				desert.appendChild(nume);

				Element cantitate = doc.createElement("Cantitate");
				cantitate.appendChild(doc.createTextNode(String.valueOf(dtl.getCantitate())));
				desert.appendChild(cantitate);

				Element pret = doc.createElement("Pret");
				pret.appendChild(doc.createTextNode(String.valueOf(dtl.getPret())));
				desert.appendChild(pret);

			}

			TransformerFactory tranFactory = TransformerFactory.newInstance();
			Transformer aTransformer = tranFactory.newTransformer();

			// format the XML nicely
			aTransformer.setOutputProperty(OutputKeys.ENCODING, "ISO-8859-1");

			aTransformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
			aTransformer.setOutputProperty(OutputKeys.INDENT, "yes");

			DOMSource source = new DOMSource(doc);
			try {
				// location and name of XML file you can change as per need
				FileWriter fos = new FileWriter("./restaurantDOM.xml");
				StreamResult result = new StreamResult(fos);
				aTransformer.transform(source, result);

				System.out.println("XML file was created");

			} catch (IOException e) {

				e.printStackTrace();
			}
		} catch (Exception ex) {
			System.out.println("Error building document");
		}

	}

}
