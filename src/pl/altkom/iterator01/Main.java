package pl.altkom.iterator01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("ala");
        l.add("ma");
        l.add("kota");
//        for (String s : l) {
//            System.out.println(s);
//        }

        Iterator<String> it = l.iterator();
//        Iterator<String> it = l.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }

    }
}
