import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SaxHandler extends DefaultHandler {

    private static String CLASSNAME = "class";
    private Object object = null;
    private String element = null;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if ( qName != CLASSNAME){
            element = qName;
        } else {
            String className = attributes.getValue(0);
            System.out.println("Class name " + className);

        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        element = null;
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (element != null){
            String value = new String(ch,start,length);
            System.out.println(element + " = " + value);

        }
    }

    public Object getObject() {
        return object;
    }


}
