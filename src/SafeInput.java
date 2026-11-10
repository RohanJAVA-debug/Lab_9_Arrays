import java.util.Random;
import java.util.Scanner;

public class SafeInput
{
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int value;

        do
        {
            System.out.print(prompt + " [" + low + "-" + high + "]: ");

            while(!pipe.hasNextInt())
            {
                System.out.print("Invalid input. Enter an integer: ");
                pipe.next();
            }

            value = pipe.nextInt();

            if(value < low || value > high)
            {
                System.out.println("Value must be between " + low + " and " + high);
            }

        } while(value < low || value > high);

        return value;
    }

    public static double getAverage(int values[])
    {
        int sum = 0;

        for(int value : values)
        {
            sum += value;
        }

        return (double)sum / values.length;
    }

    public static void runLab()
    {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        // Task 1
        int[] dataPoints = new int[100];

        // Task 2
        for(int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        // Task 3
        for(int i = 0; i < dataPoints.length; i++)
        {
            System.out.print(dataPoints[i]);

            if(i < dataPoints.length - 1)
            {
                System.out.print(" | ");
            }
        }

        System.out.println();

        // Task 4
        int sum = 0;

        for(int value : dataPoints)
        {
            sum += value;
        }

        double average = (double)sum / dataPoints.length;

        System.out.println("\nThe sum is: " + sum);
        System.out.println("The average is: " + average);

        // Task 5
        int userValue = getRangedInt(
                in,
                "Enter a value between 1 and 100",
                1,
                100);

        // Task 6
        int count = 0;

        for(int value : dataPoints)
        {
            if(value == userValue)
            {
                count++;
            }
        }

        System.out.println(
                "The value " + userValue +
                        " occurred " + count + " times.");

        // Task 7
        int searchValue = getRangedInt(
                in,
                "Enter another value between 1 and 100",
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
            System.out.println(
                    "The value " +
                            searchValue +
                            " was found at index " +
                            foundIndex);
        }
        else
        {
            System.out.println(
                    "The value " +
                            searchValue +
                            " was not found.");
        }

        // Task 8
        int min = dataPoints[0];
        int max = dataPoints[0];

        for(int i = 1; i < dataPoints.length; i++)
        {
            if(dataPoints[i] < min)
            {
                min = dataPoints[i];
            }

            if(dataPoints[i] >  max)
            {
                max = dataPoints[i];
            }
        }

        System.out.println("Minimum Value: " + min);
        System.out.println("Maximum Value: " + max);

        // Task 9
        System.out.println(
                "Average of dataPoints is: " +
                        getAverage(dataPoints));

        in.close();
    }
}