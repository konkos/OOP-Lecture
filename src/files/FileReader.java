package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FileReader<T> {

    private T objToRead;
    private final String fileName;

    public FileReader(String fileName) {
        this.fileName = fileName;
    }

    public T readObj() throws IOException, ClassNotFoundException {
        File file = new File(fileName);
        FileInputStream fins = new FileInputStream(file);
        ObjectInputStream dins = new ObjectInputStream(fins);
        objToRead = (T) dins.readObject();
        return objToRead;
    }
}
