import java.util.Scanner;
public class Ques8 {
    public static void main(String[] args) {

        method1();
        method2();
    }
    public static void method1() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = keyboard.next();
        while (!word.equals("done")) {
            if (word.charAt(0) == word.charAt(word.length() - 1)) {
                System.out.println("First and last character are equals for the word: " + word);
            } else {
                System.out.println("First and last character are NOT equals for the word: " + word);
            }
            word = keyboard.next();
        }
    }
    public static void method2() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = keyboard.next();
        do {
            if (word.charAt(0) == word.charAt(word.length() - 1)) {
                System.out.println("First and last character are equals for the word: " + word);
            } else {
                System.out.println("First and last character are NOT equals for the word: " + word);
            }
            word = keyboard.next();
        } while (!word.equals("done"));
    }
}