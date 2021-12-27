import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[]tab=new int[6];
        tab[0]=4;
        tab[1]=78;
        tab[2]=89;
        tab[3]=90;
        tab[4]=120;
        tab[5]=7;
        boolean isIndexCorrect=false;
       Scanner scan=new Scanner(System.in);
        while(!isIndexCorrect)
        {
        System.out.println("Podaj numer indeksu");
         int index;
        try {
            index = Integer.parseInt(scan.next());
        } catch (NumberFormatException e) {
            System.out.println("Błąd, wprowadzony znak nie jest cyfrą!");
            throw e;
        }

        if (index < tab.length && index >= 0) {
            try {
                System.out.println(tab[index]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Błąd Podałeś index: " + index + ", a dozwolone są od 0 do " + (tab.length - 1));
            } finally {
                System.out.println("Koniec programu");
            }
        }

        }

        /* zad.1
        a) stworzyć tablicę 6-cio elementową, uzupełnić przykładowymi wartościami (dowolny typ tablicy),
        b) wprowadzić z klawiatury numer indexu tablicy który chcemy wyświetlić, użyć metody next() --> scan.next();
        c) zabezpieczyć kod przed wprowadzeniem:
           - za dużej liczby (index > tab.length),
           - wprowadzeniem innego znaku niż liczba,
        d) użyć metody finally aby wyświetlić komunikat zakończenia programu
        e) wprowadzanie indeksu niech będzie zapętlone do momentu wprowadzenia poprawnego indeksu

           PODPOWIEDZI:
           scan.next() - można wprowadzać dowolny znak z klawiatury,
           index = Integer.parseInt(scan.next()); - parsowanie zmiennej do typu int (liczbowego calkowitego)

           warto stworzyć flagę np. isIndexCorrect = false, i niech pętla sie wykonuje, dopuki flaga jest false,
           boolean isIndexCorrect
           white(!isIndexCorrect) {}
        */



        /* zad.2
        a) stworzyć dowolny przykład z NullPonterException,
        b) stworzyć dowolny przykład z ArithmeticException ,
        c) stworzyć dowolny przykład z 2 lub 3 blokami catch i z blokiem finally,
         */

    }
}
