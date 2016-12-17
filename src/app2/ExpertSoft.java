package app2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 29.11.2016.
 */
public class ExpertSoft {

    static void merge(ArrayList a, ArrayList b) {
        ArrayList c = new ArrayList(a.size() * 2);
        for (int i = 0; i < a.size(); i++) {
            c.add(a.get(i));
            c.add(b.get(i));
        }

      System.out.println("a = " + a);
        a.clear();
        a.addAll(c);
        System.out.println("a = " + a);
    }

    public static void main(String[] args) {


        ArrayList listA = new ArrayList();
        listA.add("1");
        listA.add("3");
        listA.add("5");

        System.out.println("listA = " + listA);

        ArrayList listB = new ArrayList();
        listB.add("2");
        listB.add("4");
        listB.add("6");

        System.out.println("listB = " + listB);
        merge(listA, listB);
        System.out.println("listA = " + listA);
    }
}
