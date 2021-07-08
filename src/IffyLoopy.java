import java.util.Scanner;

public class IffyLoopy {
    public static void main(String[] args) {
       Scanner kb = new Scanner(System.in);
        String words = "";

       for (int i = 1; i <= 5;) {
           System.out.println("Enter a word: ");
           words += kb.nextLine();
    }
       System.out.println("Done!");
       System.out.println("words: " + words);
}

