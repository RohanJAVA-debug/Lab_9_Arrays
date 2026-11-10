import java.util.Random;

public class Main7
{
    public static void main(String[] args)
    {
        int[] dataPoints = new int[100];
        Random rnd = new Random();

        for(int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        System.out.println("Average of dataPoints is: "
                + getAverage(dataPoints));
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
}