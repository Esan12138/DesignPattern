package principle.ocp;


import principle.util.XMLUtil;

public class Windows {
    public static void main(String[] args) {
        SpecificSubject specificSubject = new SpecificSubject1();
        specificSubject.display();

        specificSubject=new SpecificSubject2();
        specificSubject.display();

        specificSubject= new SpecificSubject3();
        specificSubject.display();

        System.out.println("------------------------");

        specificSubject = (SpecificSubject) XMLUtil.getBean("src/main/java/principle/util/config.xml");
        specificSubject.display();

    }
}
