import java.util.Random;
import java.util.Scanner;

public class Task8
{
    static void main()
    {
        Random rnd = new Random();
        Scanner input = new Scanner(System.in);
        String answer = "y";

        while (answer.equalsIgnoreCase("y"))
        {
            int die1, die2, die3, tries;
            int sum;

            tries = 0;

            System.out.printf("%5s%8s%8s%8s%8s\n",
                    "Roll", "Die1", "Die2", "Die3", "Sum");
            System.out.println("-------------------------------------");

            do
            {
                die1 = rnd.nextInt(6) + 1;
                die2 = rnd.nextInt(6) + 1;
                die3 = rnd.nextInt(6) + 1;

                tries++;
                sum = die1 + die2 + die3;

                System.out.printf("%5d%8d%8d%8d%8d\n",
                        tries, die1, die2, die3, sum);

            }
            while (die1 != die2 || die2 != die3);

            System.out.println("Play again? (y/n)");
            answer = input.nextLine();
        }
    }
}
