import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        List<Person> myFamily = new ArrayList<Person>();
        myFamily.add(new Person("Dana", "Wyatt", 63));
        myFamily.add(new Person("Dave", "Dykes", 50));
        myFamily.add(new Person("Ian", "Auston", 16));
        myFamily.add(new Person("Aaron","Wyatt", 31));
        myFamily.add(new Person("Ian", "Auston", 72));

        Collections.sort(myFamily);
        System.out.println(myFamily);
    }

}
