package DailyProgram;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

public class report {
	
	public static void writeResults() {
		Document doc = new SAXBuilder().build(Main.class.getResource("/mailtemplate/DefaultMail.html"));

	    // XPath that finds the `p` element with id="first"
	    XPathExpression<Element> xpe = XPathFactory.instance().compile(
	            "//p[@id='first']", Filters.element());
	    Element p = xpe.evaluateFirst(doc);

	    p.setText("This is my text");

	    XMLOutputter xout = new XMLOutputter(Format.getPrettyFormat());
	    xout.output(doc, System.out);

	}
} 
