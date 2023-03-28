package principle.util;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtil {
    public static Object getBean(String path){
        DocumentBuilderFactory dFactory=DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder=dFactory.newDocumentBuilder();
            Document doc;
            doc=builder.parse(new File(path));
            NodeList nl=doc.getElementsByTagName("className");
            Node node=nl.item(0).getFirstChild();
            String cName=node.getNodeValue();
            Class<?> aClass = Class.forName(cName);
            Object obj=aClass.newInstance();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }


    }
}
