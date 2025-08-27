import java.util.Scanner;
public class ReplaceSubString {
    public static void main(String[]args){
Scanner scan = new Scanner(System.in);
System.out.println("Enter a sentence: ");
String sentence = scan.nextLine();

System.out.println("Enter substring to be replaced");
String word = scan.nextLine();

System.out.println("Enter the replacement String");

String word1 = scan.nextLine();

int position = sentence.indexOf(word);
// System.out.println("Positin of substring :" + position);

// String newsentence = sentence.replace(word,word1); 
// System.out.println("new sentence : " + newsentence);
// int position = sentence.indexOf(word);
// System.out.println("Position of substring: " + position);

if (position != -1) {
    String newSentence = sentence.substring(0, position) + word1 + sentence.substring(position + word.length());
    System.out.println("New sentence: " + newSentence);
} else {
    System.out.println("Substring not found.");
}
    }
   
}
