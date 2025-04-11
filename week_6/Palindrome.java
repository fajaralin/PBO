import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FancyTextGame game = new FancyTextGame();

        System.out.print("Masukkan kata: ");
        String input = scanner.nextLine();

        game.displayResult(input);
    }
}
