import java.util.Scanner;

public class AcceptingUserInput {
    public static void acceptingUserInput(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello User what is your name?");

        String name = scanner.nextLine();

        System.out.println("Ah I see, Welcome Home " + name);
    }
}
