import java.util.*;

public class Plateau {

    Chevalet chevalet;
    public Plateau(Chevalet chevalet) {
        this.chevalet = chevalet;
    }

    public void afficherPlateau() {
        int taille = 15;

        // Création des colonnes : ArrayList de ArrayList de tuiles
        ArrayList<ArrayList<Tuile>> colonnes = new ArrayList<>();

        // Initialisation des lignes avec des espaces vides
        for (int i = 0; i < taille; i++) {
            ArrayList<Tuile> rangees = new ArrayList<>();
            for (int j = 0; j < taille; j++) {
                rangees.add(new Tuile( ' ', 0 )); // chaque case (emplacement dans le tableau rangees) est vide au départ
            }
            colonnes.add(rangees);
        }

        // Affichage de la ligne des lettres (A à O)
        System.out.print("   "); // décalage pour aligner avec les numéros
        for (int j = 0; j < taille; j++) {
            System.out.print("  " + (char)('A' + j) + " ");
        }
        System.out.println();

        // Affichage du centre (H-8)
        colonnes.get(7).get(7).setLettre('O');

        // Affichage des colonnes
        for (int i = 0; i < taille; i++) {
            // lignes horizontales
            System.out.print("   ");
            for (int j = 0; j < taille; j++) {
                System.out.print("+---");
            }
            System.out.println("+");    // Ne pas oublier de passer à la ligne

            // lignes verticales avec contenu des cellules
            System.out.printf("%2d ", i + 1); // numéro de ligne à gauche
            for (int j = 0; j < taille; j++) {
                System.out.print("| " + colonnes.get(i).get(j).getLettre() + " ");
            }
            System.out.println("|");    // Ne pas oublier de passer à la ligne
        }
        // rangee horizontale finale
        System.out.print("   ");
        for (int j = 0; j < taille; j++) {
            System.out.print("+---");
        }
        System.out.println("+");
    }

    public void afficherChevalet() {
        chevalet.afficherChevalet();
    }

    public void jouerTuile() {

    }

}
