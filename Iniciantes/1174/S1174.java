import java.util.Scanner;

public class S1174
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        double[] A = new double[100];

        for (int i = 0; i < A.length; i++) 
        {
            A[i] = scanner.nextDouble();

            if (A[i] <= 10)
            {
                System.out.println("A[" + i + "] = " + A[i]);
            }
        }

        scanner.close();
    }
}