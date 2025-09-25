package obiektowe;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListyDemo {
    public static void main(String[] args) {
        //tablice to nie kolekcja ale rowniez struktury danych

        //Collections
        //List, Set, Queue, Map

        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println(numbers.size());
        numbers.add(10);
        numbers.add(20);
        System.out.println(numbers.size());

        ArrayList<Produkt> produkts = new ArrayList<>();
        produkts.add(new Produkt(3, "gazeta"));

        List<String> names = new ArrayList<>();
        names.add("Jeden");
        names.add("Dwa");
        names.add("Trzy");
        names.add("Jeden");
        names.remove("Jeden");

        System.out.println(names);

        LinkedList<String> names2 = new LinkedList<>();
        names2.add("Jeden");
        names2.add("Dwa");
        names2.add("Trzy");
        names2.add("Cztery");


        List<String> names3 = List.of("Jeden", "Dwa", "Trzy");
        System.out.println(names3);
        names2.removeAll(names3);
        System.out.println(names2);

    }
}
