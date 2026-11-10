import java.util.Random;
import java.util.Scanner;

public class Main5
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

        int searchValue =
                SafeInput.getRangedInt(in,
                        "Enter a value",
                        1,
                        100);

        int foundIndex = -1;

        for(int i = 0; i < dataPoints.length; i++)
        {
            if(dataPoints[i] == searchValue)
            {
                foundIndex = i;
                break;
            }
        }

        if(foundIndex != -1)
        {
            System.out.println("The value " +
                    searchValue +
                    " was found at index " +
                    foundIndex);
        }
        else
        {
            System.out.println("Value not found.");
        }
    }
}