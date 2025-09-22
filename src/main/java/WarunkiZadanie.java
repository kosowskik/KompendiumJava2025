import java.util.Scanner;

public class WarunkiZadanie {
    public static void main(String[] args) {
        double cenaTowaru;
        int liczbaRat;

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj cenę towaru");
        double cena = scan.nextDouble();
        if (cena > 10000 || cena < 100) {
            System.out.println("Niepoprawna cena");
            System.exit(1);
        }

        System.out.println("Podaj liczbę rat");
        int raty = scan.nextInt();
        if (raty > 48 || raty < 6) {
            System.out.println("Niepoprawna ilość rat");
            System.exit(1);
        }

        double rataMiesieczna = cena / raty;

        double niskieOprocentowanie = 1.025;
        double normalneOprocentowanie = 1.05;
        double wysokieOprocentowanie = 1.1;

        System.out.println("Cena towaru: " + cena);
        System.out.println("Wybrana ilość rat: " + raty);

        if (raty <= 12) {
            System.out.println("rata miesięczna wynosi: " + (rataMiesieczna * niskieOprocentowanie));
        } else if (raty <= 24) {
            System.out.println("rata miesięczna wynosi: " + (rataMiesieczna * normalneOprocentowanie));
        } else if (raty <= 48) {
            System.out.println("rata miesięczna wynosi: " + (rataMiesieczna * wysokieOprocentowanie));
        }
    }
}
