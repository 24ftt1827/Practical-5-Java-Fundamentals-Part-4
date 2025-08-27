import java.util.Scanner;
public class WordComparison{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a word ");
        String word = scan.nextLine();

        System.out.print("Enter another word ");
        String word2 = scan.nextLine();
        word = word.toLowerCase();
        word2 = word2.toLowerCase();

        if (word.equals(word2)){
            System.out.println("are both words the same? :true");
        } else {
            System.out.println("are both words the same? :false");
        }

        

    }
}