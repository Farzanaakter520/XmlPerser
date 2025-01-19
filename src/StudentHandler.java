import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class StudentHandler extends DefaultHandler {
    private String currentElement = "";
    private String name, id, studentClass;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        currentElement = qName;
    }


    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String value = new String(ch, start, length).trim();
        if (!value.isEmpty()) {
            switch (currentElement) {
                case "Name":
                    name = value;
                    break;
                case "ID":
                    id = value;
                    break;
                case "Class":
                    studentClass = value;
                    break;
            }
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equals("Student")) {
            System.out.println("name: " + name + ", ID: " + id + ", Class: " + studentClass);
        }
        currentElement = "";
    }
}



