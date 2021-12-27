public class Pracownik implements Pracownik1 {
    public Pracownik() {
    }

    @Override
    public String toString() {
        return "Pracownik{}";
    }

    @Override
    public void czasPracy(int czas) {
        System.out.println("Mój czas pracy wynosi"+czas);
    }

    @Override
    public void kwotaWypłaty(int kwota) {
        System.out.println("Moja wypłata wynosi:"+kwota);
    }

    @Override
    public void PodajStażPracy(int staż) {
        System.out.println("Mój staż pracy wynosi"+staż);
    }
}
