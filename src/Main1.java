import java.util.Random;

public class Main1
{
    public static void main(String[] args)
    {
        int[] dataPoints = new int[100];
        Random rnd = new Random();

        for(int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }
    }
}