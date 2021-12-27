public class Main {

    public static void main(String[] args) {


        Kwadrat kwadrat=new Kwadrat("Kwadrat");
        Prostokąt prostokąt=new Prostokąt("Prostokąt");
        Kwadrat kwadrat1=new Kwadrat("Kwadrat");
        Prostokąt prostokąt1=new Prostokąt("Prostokąt");

        kwadrat1.nazwaFigury("Kwadrat");
        kwadrat.obwod();
        prostokąt.pole();
        prostokąt1.pole();

        /* zad.1
        a) stworzyć klasę abstrakcyjną Figura
        b) stworzyć metody abstrakcyjne pole() i obwod()
        c) stworzyć zwykłą metodę nazwaFigury(String figura), która będzie zwracała tekst 'To jest figura: .....',
        */

        /* zad.2
        a) stworzyć klasę kwadrat i prostokat które będą dziedziczyć po klasie Figura
        b) zaimplementować metody abstrakcyjne odpowiednimi wzorami,
        c) stworzyć objekty tych klas i wyświetlić przykładowe wyliczenia
        */

    }
}
