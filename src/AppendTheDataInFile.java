import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendTheDataInFile {
     static Scanner scanner = new Scanner(System.in);
    static void main() throws IOException {

        String filePath = "src/TestFiles1";
        File file = new File(filePath);

        FileWriter fw = new FileWriter(file, true); // this true makes sure that the file is appended

        BufferedWriter bw = new BufferedWriter(fw);

        System.out.println("Enter a data to append in the TestFiles1: ");
        String newData = scanner.nextLine();

        bw.write("\n"+newData);
        System.out.println("The file data is appended successfully!");

        bw.close();
        fw.close();

    }
}
