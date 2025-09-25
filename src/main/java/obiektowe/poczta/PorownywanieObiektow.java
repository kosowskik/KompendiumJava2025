package obiektowe.poczta;

import obiektowe.Produkt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PorownywanieObiektow {
    public static void main(String[] args) {
        int liczba = 10;
        int liczba2 = 20;
        System.out.println(liczba == liczba2);

        Produkt product = new Produkt(20, "magazyn");
        Produkt product2 = new Produkt(20, "magazyn");

        //==w kontekście obiektów porównuje referencje/adresy w pamięci
        System.out.println(product == product2);
        //equals domyślnie również porównuje adresy
        System.out.println(product.equals(product2));

        List<Produkt> products = new ArrayList<>();
        products.add(product);
        products.remove(new Produkt(20, "magazyn"));
        System.out.println(products);

        String text = "abs";
        System.out.println(text == "abc");

        System.out.println(text == new String("abc"));
        Scanner scan = new Scanner(System.in);
        System.out.println(text == scan.nextLine());

        System.out.println(text.equals(scan.nextLine()));


    }
}
