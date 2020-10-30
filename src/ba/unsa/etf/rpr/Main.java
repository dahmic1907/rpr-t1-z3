package ba.unsa.etf.rpr;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Sat s  = new Sat(15, 30, 45);
        s.ispis();
        s.sljedeci();
        s.ispis();
        s.pomjeriZa(-48);
        s.ispis();
        s.postavi(0, 0, 0);
        // s.ispis();
    }
}
