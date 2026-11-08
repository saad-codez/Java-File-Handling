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

        // to count the number of chars in the file
        int countChars = 0;

        // to count number of lines in the file
        int countLines = 0;

        int countWords = 0;

        // let's loop through the file and fetch all the characters

        while ((c = br.read()) != -1) { // while number of characters fetched is != -1
            System.out.print(((char)c)); // type casting to cast from int to char
            countChars++; // counts the number of chars in the file
            if ((char)c == '\n') {
                countLines++; // prints number of the new lines ; it usually prints 1 less than the original value
            }
           //to count the words
            if((char)c == ' '|| (char)c == '\n'){
                countWords++;
            }
        }
        countWords++;
        countLines++; // this adds to the correct number of lines.

        System.out.println("\n[File has been read and printed on console!]");

        System.out.println("Total number of characters in this file are: "+ countChars);
        System.out.println("Total number of lines are: "+countLines);
        System.out.println("Total number of words in this file are: "+ countWords);

    }
}
