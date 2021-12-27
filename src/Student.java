public class Student implements Student1 {

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{}";
    }

    @Override
    public void PodajNrIndeksu(int indeks) {
        System.out.println("Nr indeksu to "+indeks);
    }

    @Override
    public void PodajKierunek(String kierunek) {
        System.out.println("Kierunek studiow to"+ kierunek);
    }

    @Override
    public void PodajRokStudiow(int rok) {
        System.out.println("Jestem na "+rok+"roku studiów");
    }
}
