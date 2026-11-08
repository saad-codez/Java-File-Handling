import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ConsoleReadAndWriteInFile {
    //Let us take the output from the console and print it in the file
    static void main() throws IOException {

        Scanner scanner = new Scanner(System.in);

        // TO create a file
        String filePath = "src/TestFiles2";
        FileWriter f_write = new FileWriter(filePath);
        BufferedWriter b_write = new BufferedWriter(f_write);

        System.out.print("Enter the Message to Write in the file: ");
        String message = scanner.nextLine();
        b_write.write(message);

        System.out.println("File Created and Message Writter!");

        b_write.close();
        f_write.close();
        scanner.close();

    }
}