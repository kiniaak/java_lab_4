public class Kierownik implements  Pracownik1 {
    public Kierownik() {
    }

    @Override
    public String toString() {
        return "Kierownik{}";
    }

    @Override
    public void czasPracy(int czas) {
        System.out.println("Moj czas pracy to"+czas);
    }

    @Override
    public void kwotaWypłaty(int kwota) {
        System.out.println("Wypłata wynosi"+kwota);
    }

    @Override
    public void PodajStażPracy(int staż) {
        System.out.println("Moj staz pracy wynosi"+staż+"lat");
    }
}
