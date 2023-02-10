import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String question = "Which color is a primary color?";
        String choiceOne = "Green";
        String choiceTwo = "Yellow";
        String choiceThree = "Brown";

        String correctAnswer = choiceTwo;

        System.out.println(question);
        System.out.println(choiceOne);
        System.out.println(choiceTwo);
        System.out.println(choiceThree);

        Scanner input = new Scanner(System.in);
        String userInput = input.next();

        if (userInput.equals(correctAnswer)) {
            System.out.println("Congratulations, you picked the right color!");
        } else  {
            System.out.println("You picked the wrong color :(");
        }
    }
}
