package Chap17;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Chap17Part2 {
    public static void main(String[] args) throws IOException {
        String fileName = "grades.txt";
        PrintWriter outFile = new PrintWriter(new FileWriter(fileName));
        outFile.println(85);
        outFile.println(77);
        outFile.close();
    }
}
