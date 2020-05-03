import java.util.Scanner;

public class S1116 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) 
        {
            double X = scanner.nextDouble();
            double Y = scanner.nextDouble();
            
            if (Y == 0) 
            {
                System.out.println("divisao impossivel");
            } 
            else 
            {
                System.out.format("%.1f%n", (X/Y));
            }
        }

        scanner.close();
    }
}
