import java.util.Random;

public class ThreeOfaKind
{
    static void main ()
    {
        Random rnd = new Random();
        int die1, die2, die3, tries;

        die1 = rnd.nextInt(6) + 1;
        die2 = rnd.nextInt(6) + 1;
        die3 = rnd.nextInt(6) + 1;
        tries = 0;

        while (die1 != die2 || die2 != die3)
        {
            die1 = rnd.nextInt(6) + 1;
            die2 = rnd.nextInt(6) + 1;
            die3 = rnd.nextInt(6) + 1;
            tries++;

            System.out.printf("%5d\t%3d\t%3d\t%3d\n", tries, die1, die2, die3 );
        }
    }
}
