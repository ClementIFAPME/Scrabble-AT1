import java.util.ArrayList;

public class Plateau {

    public Plateau() {

    }

    public void afficherPlateau() {

        int taille = 15;

        // Création des colonnes : ArrayList de ArrayList
        ArrayList<ArrayList<Tuile>> colonnes = new ArrayList<>();

        // Initialisation des lignes avec des espaces vides
        for (int i = 0; i < taille; i++) {
            ArrayList<Tuile> rangees = new ArrayList<>();
            for (int j = 0; j < taille; j++) {
                rangees.add(new Tuile( ' ', 0 )); // chaque case (emplacement dans le tableau rangees) est vide au départ
            }
            colonnes.add(rangees);
        }

        // Exemple (à effacer et remplacer) : placer quelques lettres
        colonnes.get(0).set(0, new Tuile('X', 10));
        colonnes.get(7).set(7, new Tuile('O', 1));
        colonnes.get(14).set(14, new Tuile('E', 1));

        // Affichage des colonnes
        for (int i = 0; i < taille; i++) {
            // lignes horizontales
            for (int j = 0; j < taille; j++) {
                System.out.print("+---");
            }
            System.out.println("+");    // Ne pas oublier de passer à la ligne

            // lignes verticales avec contenu des cellules
            for (int j = 0; j < taille; j++) {
                System.out.print("| " + colonnes.get(i).get(j).getLettre() + " ");
            }
            System.out.println("|");    // Ne pas oublier de passer à la ligne
        }
        // rangee horizontale finale
        for (int j = 0; j < taille; j++) {
            System.out.print("+---");
        }
        System.out.println("+");
    }

}
