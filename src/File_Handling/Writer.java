package File_Handling;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void main(String[] args) {
        String fileName = "java-course.txt";

        try( FileWriter writer = new FileWriter(fileName))
        {
        writer.write("This is the best java cource");
            for (int i = 0; i < 10000; i++) {
                writer.write("*\n");
            }
        writer.flush();
            System.out.println("File written Succesfully");
        } catch (IOException exception){
            System.out.printf("Exception occured %s\n",
                    exception.getMessage());
        }

        }

    }

