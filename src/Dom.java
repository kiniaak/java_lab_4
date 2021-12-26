public class Dom implements Budynek{

    public Dom() {
    }

    @Override
    public String toString() {
        return "Dom{}";
    }



    @Override
    public double powierzchnia(double pow) {
        return 2;
    }

    @Override
    public String adresBudynku(String adres) {
        return null;
    }

    @Override
    public int liczbaOkien(int value) {
        return 8;
    }

    @Override
    public void liczbaMieszkancow(int value) {
        System.out.println("Liczba mieszkanców wynosi "+value);
    }



    @Override
    public void kolorDomu(kolorEnum kolor) {
        System.out.println("Kolor domu to "+kolor);
    }

    @Override
    public void liczbaPokoi(int liczba, double pow) {
        System.out.println("Liczba pokoi wynosi"+liczba+"zaś ich powierzchnia "+pow);
    }
}
