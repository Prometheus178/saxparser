public class Main {
    public static void main(String[] args) {
        User user = (User) XmlReader.readXML("data/data.xml");
        System.out.println(user);
        //System.out.println(user.toString());
    }
}
