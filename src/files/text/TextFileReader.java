package files.text;

import java.io.*;

public class TextFileReader {
    public static void main(String[] args) {
        try {
            File f = new File("names.txt");
            BufferedReader reader = new BufferedReader(new FileReader(f));
            String line = reader.readLine();
            while (line != null) {
                // κάποια ενέργεια με τη γραμμή
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            // δεν εντοπίστηκε το συγκεκριμένο αρχείο
            e.printStackTrace();
        } catch (IOException e) {
            // κάποιο πρόβλημα προέκυψε στην ανάγνωση ή στο κλείσιμο
            e.printStackTrace();
        }
    }
}
