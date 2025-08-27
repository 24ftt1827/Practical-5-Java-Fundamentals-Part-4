import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.Random;
public class ModulusQuestion {
    public static void main(String[] args) throws IOException {
         Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int a = (int) rand.nextDouble(100);
        int b = (int) rand.nextDouble(100);

        String filename = "/Users/ryl/Documents/practical5/ModulusQuestion.txt";
        FileWriter fw = new FileWriter(filename, true);
        fw.write("What is " + a + " % " + b + " = ? \n");
        fw.close();
    }
}
