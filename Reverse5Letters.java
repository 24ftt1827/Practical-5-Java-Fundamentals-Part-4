import java.util.Scanner;
public class Reverse5Letters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a 5-letter word: ");
        String word = scan.nextLine();
              char a = word.charAt(4);
            char b = word.charAt(3);
            char c = word.charAt(2);
            char d = word.charAt(1);
            char e = word.charAt(0);
        System.out.println("Reversed word: " + a + b + c + d + e);
        scan.close();
        
}
}
