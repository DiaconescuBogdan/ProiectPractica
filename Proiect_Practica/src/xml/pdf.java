package xml;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.MalformedURLException;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.xhtmlrenderer.pdf.ITextRenderer;

import com.lowagie.text.DocumentException;

public class pdf {

	public pdf() {
		// TODO Auto-generated constructor stub
	}

	public void createHTML() throws FileNotFoundException, TransformerException, MalformedURLException {
		TransformerFactory tFactory = TransformerFactory.newInstance();

		// specify the input xsl file location to apply the styles for the pdf
		// output file
		Transformer transformer = tFactory.newTransformer(new StreamSource("./restaurant.xsl"));

		// specify the input xml file location
		transformer.transform(new StreamSource("./restaurantDOM.xml"),
				new StreamResult(new FileOutputStream("./HTMLFromXML.html")));

		// Specifying the location of the html file (xml converted to html)
		String File_To_Convert = "./HTMLFromXML.html";

		String url = new File(File_To_Convert).toURI().toURL().toString();
		System.out.println("" + url);

		ITextRenderer renderer = new ITextRenderer();
		renderer.setDocument(url);
		renderer.layout();

	}

	public void createPdf_Html() throws IOException, DocumentException, TransformerException,
			TransformerConfigurationException, FileNotFoundException {

		TransformerFactory tFactory = TransformerFactory.newInstance();

		// specify the input xsl file location to apply the styles for the pdf
		// output file
		Transformer transformer = tFactory.newTransformer(new StreamSource("./restaurant.xsl"));

		// specify the input xml file location
		transformer.transform(new StreamSource("./restaurantDOM.xml"),
				new StreamResult(new FileOutputStream("./PDF+HTMLFromXML.html")));

		// Specifying the location of the html file (xml converted to html)
		String File_To_Convert = "./PDF+HTMLFromXML.html";

		String url = new File(File_To_Convert).toURI().toURL().toString();
		System.out.println("" + url);

		// Specifying the location of the outpuf pdf file.
		String HTML_TO_PDF = "./PdfFromXml.pdf";

		OutputStream os = new FileOutputStream(HTML_TO_PDF);
		ITextRenderer renderer = new ITextRenderer();
		renderer.setDocument(url);
		renderer.layout();
		renderer.createPDF(os);
		os.close();

	}

}
