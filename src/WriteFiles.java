import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFiles {
    static void main() throws IOException {
        // Steps to create and write a file

        String filePath = "src/TestFiles1";
        File file = new File(filePath);

        FileWriter fw = new FileWriter(file);

        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("This File is written with the help of a Program!");
        System.out.println("File Created and Written!");

        bw.close();
        fw.close();
    }
}
