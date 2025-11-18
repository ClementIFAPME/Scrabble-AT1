import java.util.*;

public class Sac {

    ArrayList<Tuile> sac = new ArrayList<>();

    public Sac() {

        // Lettres à 1 point
        for (int i = 0; i < 15; i++) sac.add(new Tuile('E', 1));
        for (int i = 0; i < 9; i++)  sac.add(new Tuile('A', 1));
        for (int i = 0; i < 8; i++)  sac.add(new Tuile('I', 1));
        for (int i = 0; i < 6; i++)  sac.add(new Tuile('N', 1));
        for (int i = 0; i < 6; i++)  sac.add(new Tuile('O', 1));
        for (int i = 0; i < 6; i++)  sac.add(new Tuile('R', 1));
        for (int i = 0; i < 6; i++)  sac.add(new Tuile('S', 1));
        for (int i = 0; i < 6; i++)  sac.add(new Tuile('T', 1));
        for (int i = 0; i < 6; i++)  sac.add(new Tuile('U', 1));
        for (int i = 0; i < 5; i++)  sac.add(new Tuile('L', 1));

        // Lettres à 2 points
        for (int i = 0; i < 3; i++) sac.add(new Tuile('D', 2));
        for (int i = 0; i < 2; i++) sac.add(new Tuile('G', 2));
        for (int i = 0; i < 3; i++) sac.add(new Tuile('M', 2));

        // Lettres à 3 points
        for (int i = 0; i < 2; i++) sac.add(new Tuile('B', 3));
        for (int i = 0; i < 2; i++) sac.add(new Tuile('C', 3));
        for (int i = 0; i < 2; i++) sac.add(new Tuile('P', 3));

        // Lettres à 4 points
        for (int i = 0; i < 2; i++) sac.add(new Tuile('F', 4));
        for (int i = 0; i < 2; i++) sac.add(new Tuile('H', 4));
        for (int i = 0; i < 2; i++) sac.add(new Tuile('V', 4));

        // Lettres à 8 points
        sac.add(new Tuile('J', 8));
        sac.add(new Tuile('Q', 8));

        // Lettres à 10 points
        sac.add(new Tuile('K', 10));
        sac.add(new Tuile('W', 10));
        sac.add(new Tuile('X', 10));
        sac.add(new Tuile('Y', 10));
        sac.add(new Tuile('Z', 10));

        System.out.println("Tuiles remplies : " + sac.size());
    }


    public void afficherSac() {
        for (int i = 0; i < sac.size(); i++) {
            Tuile t = sac.get(i);
            System.out.println(i + " : " + t.lettre + " (" + t.valeur + ")");
        }
    }

    public Tuile piocher() {
        Random rand = new Random();

        if (sac.isEmpty()) {
            System.out.println("Le sac est vide !");
            return null;
        }

        int index = rand.nextInt(sac.size());
        Tuile pioche = sac.get(index);
        sac.remove(index);

//        System.out.println("Tu as pioché : " + pioche.lettre + " (" + pioche.valeur + ")");
        return pioche;
    }

//    public static void main(String[] args) {
//        Sac sac = new Sac();
//        sac.afficherSac();
//
//        System.out.println("\nPiochage :");
//        sac.piocher();
//        sac.piocher();
//        sac.piocher();
//
//        System.out.println("\nSac après piochage :");
//        sac.afficherSac();
//    }
}
