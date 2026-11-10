import java.util.Random;
import java.util.Scanner;

public class Main4
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        int[] dataPoints = new int[100];

        for(int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        int userValue =
                SafeInput.getRangedInt(in,
                        "Enter a value",
                        1,
                        100);

        int count = 0;

        for(int value : dataPoints)
        {
            if(value == userValue)
            {
                count++;
            }
        }

        System.out.println("The value " +
                userValue +
                " occurred " +
                count +
                " times.");
    }
}