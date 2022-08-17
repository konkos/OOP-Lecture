package files;

public class Main {

    public static void main(String[] args) {
        //Save Object To File
//        File file = new File("student.ser");
//        Student st = new Student("name",10);
//        try {
//            FileOutputStream fouts = new FileOutputStream(file);
//            ObjectOutputStream douts = new ObjectOutputStream(fouts);
//            douts.writeObject(st);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//        //Read Object From File
//        File file = new File("student.ser");
//        try {
//            FileInputStream fins = new FileInputStream(file);
//            ObjectInputStream dins = new ObjectInputStream(fins);
//            Student student = (Student) dins.readObject();
//            System.out.println(student);
//        } catch (IOException | ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }

        //Save List To File
//        ArrayList<Student> studentArrayList = new ArrayList<>();
//
//        for (int i = 0; i < 10; i++) {
//            studentArrayList.add(new Student("name " + i, i));
//        }
//        File file = new File("studentList.ser");
//        try {
//            FileOutputStream fouts = new FileOutputStream(file);
//            ObjectOutputStream douts = new ObjectOutputStream(fouts);
//            douts.writeObject(studentArrayList);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        //Get List From File
//        File file = new File("studentList.ser");
//        try {
//            FileInputStream fins = new FileInputStream(file);
//            ObjectInputStream dins = new ObjectInputStream(fins);
//            //Cast Object To ArrayList
//            ArrayList student = (ArrayList) dins.readObject();
//            System.out.println(student);
//        } catch (IOException | ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }

//        //Save String to File
//        File file = new File("message.ser");
//        String message = "This is a message";
//        try {
//            FileOutputStream fouts = new FileOutputStream(file);
//            ObjectOutputStream douts = new ObjectOutputStream(fouts);
//            douts.writeObject(message);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//        //Read String from File
//        File file = new File("message.ser");
//        try {
//            FileInputStream fins = new FileInputStream(file);
//            ObjectInputStream dins = new ObjectInputStream(fins);
//            String message = (String) dins.readObject();
//            System.out.println(message);
//        } catch (IOException | ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }

        //MY READER / WRITER

        //write
//        Student st = new Student("STUDENT IS SAVED",32);
//        FileWriter<Student> studentFileWriter = new FileWriter<>(st, "myWriter.ser");
//        studentFileWriter.saveObj();

        //Read
//        try {
//            FileReader<Student> fileReader = new FileReader<>("myWriter.ser");
//            Student student = fileReader.readObj();
//            System.out.println(student);
//        } catch (IOException | ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
    }
}
