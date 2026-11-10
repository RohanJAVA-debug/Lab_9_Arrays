import java.util.Random;

public class Main6
{
    public static void main(String[] args)
    {
        int[] dataPoints = new int[100];
        Random rnd = new Random();

        for(int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        int min = dataPoints[0];
        int max = dataPoints[0];

        for(int i = 1; i < dataPoints.length; i++)
        {
            if(dataPoints[i] < min)
            {
                min = dataPoints[i];
            }

            if(dataPoints[i] > max)
            {
                max = dataPoints[i];
            }
        }

        System.out.println("Minimum Value: " + min);
        System.out.println("Maximum Value: " + max);
    }
}