import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello User what is your name?");
        String name = scanner.nextLine();

        System.out.println("How many cycles have you been in this world");
        int cycles = scanner.nextInt();

        System.out.println("Ah I see, Welcome Home " + name);
        System.out.println("You have been in the system for " + cycles + " cycles you must be the creator!");

    }
}