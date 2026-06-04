import java.util.Scanner;
public class Basics {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String a = scanner.nextLine();

    if (a.equals(new StringBuilder(a).reverse().toString())) {
        System.out.println("Palindrome");
    } else {
        System.out.println("Not a palindrome");

    }
  }
}