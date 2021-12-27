public class Dyrektor implements Pracownik1,Student1,Człowiek1 {
    public Dyrektor() {
    }

    @Override
    public void PrzedstawSie(String imie, String nazwisko) {
        System.out.println("Nazywam się"+imie+nazwisko);
    }

    @Override
    public void PodajWiek(int wiek) {
        System.out.println("Mam lat"+wiek);
    }

    @Override
    public void czasPracy(int czas) {
        System.out.println("Dziś pracuje"+czas+"godzin");
    }

    @Override
    public void kwotaWypłaty(int kwota) {
        System.out.println("Zarabiam miesięcznie"+kwota);
    }

    @Override
    public void PodajStażPracy(int staż) {
        System.out.println("Pracuje od lat"+staż);
    }

    @Override
    public void PodajNrIndeksu(int indeks) {
        System.out.println("Numer indeksu to"+indeks);
    }

    @Override
    public void PodajKierunek(String kierunek) {
        System.out.println("Mój kierunek to"+kierunek);
    }

    @Override
    public void PodajRokStudiow(int rok) {
        System.out.println("Studiuje już"+rok+"rok");
    }
}
