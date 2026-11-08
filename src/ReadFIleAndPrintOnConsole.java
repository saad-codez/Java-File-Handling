import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFIleAndPrintOnConsole {
    static void main() throws IOException {
        String filePath = "src/TestFiles2";
        File file = new File(filePath);

        //File reader object
        FileReader fr = new FileReader(file);

        BufferedReader br = new BufferedReader(fr);

        int c; //read() returns only int, so we need int

        // to count the number of chars
        int countChars = 0;

        // let's loop through the file and fetch all the characters

        while ((c = br.read()) != -1) { // while number of characters fetched is != -1
            System.out.print(((char)c)); // type casting to cast from int to char
            countChars++; // counts the number of chars in the file
        }
        System.out.println("\n[File has been read and printed on console!]");

        System.out.println("Total number of characters in this file are: "+ countChars);

    }
}
