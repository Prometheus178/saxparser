import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class XmlReader {
    public static Object readXML(String xmlFile){
        try{
            SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
            SAXParser saxParser = saxParserFactory.newSAXParser();

            SaxHandler saxHandler = new SaxHandler();
            saxParser.parse(xmlFile, saxHandler);

            return saxHandler.getObject();
        }catch( Exception e ){
            e.printStackTrace();
        }
        return null;
    }

}
