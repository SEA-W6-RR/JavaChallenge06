import org.w3c.dom.ls.LSOutput;

public class Classroom {

    public static void main(String[] args) {

        Wilder arthur = new Wilder("Arthur", true);
        Wilder ford = new Wilder("Ford", true);
        Wilder zaphod = new Wilder("Zaphod", false);
        Wilder tricia = new Wilder("Tricia", false);
        Wilder marvin = new Wilder("Marvin", true);

        Wilder[] presenceDay1 = new Wilder[]{arthur, ford, zaphod, tricia, marvin};

        for (int i = 0; i < presenceDay1.length; i++) {
            System.out.println(presenceDay1[i].whoAmI());
        }
    }
}