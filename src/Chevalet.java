import java.util.*;

public class Chevalet {

    ArrayList<Tuile> chevalet;

    public Chevalet(Sac sac) {
        chevalet =  new ArrayList<>();

        for (int i = 0; i < 7 ; i++) {
            Tuile t = sac.piocher();
            if (t != null) {
                chevalet.add(t);
            }
        }
    }

    public void afficherChevalet() {
        System.out.println("Chevalet : ");
        for (Tuile t : chevalet) {
            System.out.print("["+t.getLettre()+"-"+t.getValeur()+"] ");
        }
    }

//    public static void main(String[] args) {
//
//        Chevalet chevalet = new Chevalet(new Sac());
//        chevalet.afficherChevalet();
//    }
}
