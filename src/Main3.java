import java.util.Random;

public class Main3
{
    public static void main(String[] args)
    {
        int[] dataPoints = new int[100];
        Random rnd = new Random();

        for(int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        int sum = 0;

        for(int value : dataPoints)
        {
            sum += value;
        }

        double average = (double)sum / dataPoints.length;

        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + average);
    }
}
