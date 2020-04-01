package xml;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import model.restaurant;
import proiect.connections;

public class marshalingExample {

	public void createJAXB() throws JAXBException {

		restaurant restaurant = new restaurant();
		connections con = new connections();
		restaurant.setLista_racoritoare(con.getRacoritoareFromDB());
		restaurant.setLista_bauturi_alcoolice(con.getBauturiAlcooliceFromDB());
		restaurant.setLista_fel1(con.getFel1FromDB());
		restaurant.setLista_fel2(con.getFel2FromDB());
		restaurant.setLista_desert(con.getDesertFromDB());

		JAXBContext jaxbContext = JAXBContext.newInstance(restaurant.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		// Marshal the employees list in console
		jaxbMarshaller.marshal(restaurant, System.out);

		// Marshal the employees list in file
		jaxbMarshaller.marshal(restaurant, new File("./restaurantJAXB.xml"));
	}
}
