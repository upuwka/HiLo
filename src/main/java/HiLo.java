import javax.swing.JFrame;
import java.util.Scanner;

public class HiLo {
    public static void main(String[] args) {
        JFrame myFrame = new JFrame("Hello!");
        myFrame.setSize (300,200);
        myFrame.setVisible(true);

        Scanner scan = new Scanner(System.in);
        String playAgain = "";
        do{
        int theNumber = (int)(Math.random() * 10 + 1);
        int guess = 0;
        while (guess != theNumber) {
            System.out.println("Guess a number between 1 and 10:");
            guess = scan.nextInt();
            if (guess < theNumber)
                System.out.println(guess + " is too low. Try again.");
            else if (guess > theNumber)
                System.out.println(guess + " is too high. Try again.");
            else
                System.out.println(guess + " is correct. You win!");
                    }System.out.println("Would you like to play again (y/n)?");
        playAgain = scan.next();
    } while (playAgain.equalsIgnoreCase("y"));
        System.out.println("Thank you for playing! Goodbye.");
        scan.close();
    }
}