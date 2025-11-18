import java.util.*;

public class Sac {

    Tuile[] sac = new Tuile[102];

    public Sac() {

        int compteLettre = 0;

        // Lettres à 1 point
        for (int i = 0; i < 15; i++) sac[compteLettre++] = new Tuile('E', 1);
        for (int i = 0; i < 9; i++)  sac[compteLettre++] = new Tuile('A', 1);
        for (int i = 0; i < 8; i++)  sac[compteLettre++] = new Tuile('I', 1);
        for (int i = 0; i < 6; i++)  sac[compteLettre++] = new Tuile('N', 1);
        for (int i = 0; i < 6; i++)  sac[compteLettre++] = new Tuile('O', 1);
        for (int i = 0; i < 6; i++)  sac[compteLettre++] = new Tuile('R', 1);
        for (int i = 0; i < 6; i++)  sac[compteLettre++] = new Tuile('S', 1);
        for (int i = 0; i < 6; i++)  sac[compteLettre++] = new Tuile('T', 1);
        for (int i = 0; i < 6; i++)  sac[compteLettre++] = new Tuile('U', 1);
        for (int i = 0; i < 6; i++)  sac[compteLettre++] = new Tuile('L', 1);

        // Lettres à 2 points
        for (int i = 0; i < 3; i++) sac[compteLettre++] = new Tuile('D', 2);
        for (int i = 0; i < 2; i++) sac[compteLettre++] = new Tuile('G', 2);
        for (int i = 0; i < 3; i++) sac[compteLettre++] = new Tuile('M', 2);

        // Lettres à 3 points
        for (int i = 0; i < 2; i++) sac[compteLettre++] = new Tuile('B', 3);
        for (int i = 0; i < 2; i++) sac[compteLettre++] = new Tuile('C', 3);
        for (int i = 0; i < 2; i++) sac[compteLettre++] = new Tuile('P', 3);

        // Lettres à 4 points
        for (int i = 0; i < 2; i++) sac[compteLettre++] = new Tuile('F', 4);
        for (int i = 0; i < 2; i++) sac[compteLettre++] = new Tuile('H', 4);
        for (int i = 0; i < 2; i++) sac[compteLettre++] = new Tuile('V', 4);

        // Lettres à 8 points
        sac[compteLettre++] = new Tuile('J', 8);
        sac[compteLettre++] = new Tuile('Q', 8);

        // Lettres à 10 points
        sac[compteLettre++] = new Tuile('K', 10);
        sac[compteLettre++] = new Tuile('W', 10);
        sac[compteLettre++] = new Tuile('X', 10);
        sac[compteLettre++] = new Tuile('Y', 10);
        sac[compteLettre++] = new Tuile('Z', 10);

        // Jokers (à ajouter dans la version 2.0)
    }

    public void piocher(Scanner sc) {

        Random rand = new Random();

        for (int i = 0; i < sac.length; i++) {

        }
    }
}
