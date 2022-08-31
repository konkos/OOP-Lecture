package files.text;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class TextFileWriter {
    public static void main(String[] args) {
        // Θα προσθέτουμε στοιχεία σε txt αρχείο.
        ArrayList<String> names = new ArrayList<>();

        names.add("John");
        names.add("Mary");
        names.add("Helen");
        names.add("Bob");
        names.add("Nick");

        // Δημιουργώ ένα αρχείο
        File f = new File("names.txt");
        try {
            FileWriter writer = new FileWriter(f);

            for (String name : names) {
                writer.write(name); // Εγγραφή στο αρχείο
                writer.write(System.lineSeparator()); // Αλλαγή γραμμής στο σύστημα που εκτελείται ο κώδικας
            }

            writer.close(); // Κλείνω το ρεύμα...

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
