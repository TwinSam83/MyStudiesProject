package AllHomeworks.HomeworkCh6;

public class MainProgram {
    public static void main(String[] args) {
        Cosmodrome cosmodrome = new Cosmodrome();
        Shuttle x30Nasp = new Shuttle();
        cosmodrome.launch(x30Nasp);
        Nasda Fuji = new Nasda();
        cosmodrome.launch(Fuji);
        Spiral Bor5 = new Spiral();
        cosmodrome.launch(Bor5);
    }
}
