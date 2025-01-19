import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class Main {
    public static void main(String[] args) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();

            StudentHandler handler = new StudentHandler();
            saxParser.parse("C:\\JAVA\\JAVA CLASS\\XmlPerser\\resource\\students.xml", handler);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}