import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Random;
import java.time.format.DateTimeFormatter;
public class QueueReceipt {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formatteddate = ldt.format(dtf);
        Random rand = new Random();
        int a = (int) rand.nextDouble(100);
        String filename = "/Users/ryl/Documents/practical5/QReceipt.txt";

        FileWriter fw = new FileWriter (filename, false);
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        name.toUpperCase();
        fw.write(formatteddate + "\n");
        fw.write("Hi , " + name + "\n");
        fw.write("Queue number: " + a + "\n");
        fw.close();

}
}
