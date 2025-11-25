import java.io.*;
import java.util.HashSet;

public class Dictionnaire {

    private HashSet<String> dico = new HashSet<>();

    public Dictionnaire() {

        String filePath = "C:/CS/AT1-2025/Scrabble/liste_francais.txt";

        File file = new File(filePath);
        if (!file.exists()) {
            System.err.println("Le fichier " + filePath + " n'existe pas.");
            return;
        }

        try(FileInputStream fis = new FileInputStream(filePath);
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            BufferedReader br = new BufferedReader(isr);
        ){

            String line;
            while ((line = br.readLine()) != null) {
                dico.add(line);
//                System.out.println(line);
            }

        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture du fichier : " + e.getMessage());
            e.printStackTrace();
        }
    }

    public HashSet<String> getDico() {
        return dico;
    }
}
