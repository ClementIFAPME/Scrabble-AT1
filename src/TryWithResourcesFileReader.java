

import java.io.*;

public class TryWithResourcesFileReader{

    public static void main(String[] args) {

        String filePath = "JDBCTryWithResources/src/fichier.txt";

        File file = new File(filePath);
        if (!file.exists()) {
            System.err.println("Le fichier " + filePath + " n'existe pas.");
            return;
        }

        try( FileInputStream fis = new FileInputStream(filePath);
             InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
             BufferedReader br = new BufferedReader(isr);
             ){

            String line;
            System.out.println("Contenu du fichier :");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture du fichier : " + e.getMessage());
            e.printStackTrace();
        }
    }
}




