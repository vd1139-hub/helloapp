import java.util.Scanner;

public class HelloApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();   // taking input

        System.out.println("Hello, " + name + "!");
    }
}