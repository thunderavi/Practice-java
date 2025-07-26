package File_Handling.Challenge;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FnotExc_handling {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print
                ("Enter the filename to read :");
        String filename = read.next();
        try(FileReader reader = new FileReader(filename))
        {
            int reada = 0;
            while ((reada = reader.read()) != -1){
                System.out.print((char) reada);
            }
        }
        catch (FileNotFoundException exception){
            System.out.printf("File not found %s ",filename);

        }

        catch (IOException exception){
            System.out.printf("Exceeption occured %s ",exception.getMessage());
        }
    }
}
