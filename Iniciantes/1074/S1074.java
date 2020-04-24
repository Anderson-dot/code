import java.util.Scanner;

public class S1074 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) 
        {
            int X = scanner.nextInt();

            if (X != 0) 
            {
                if (X%2 == 0) 
                {
                    System.out.print("EVEN ");
                } 
                else 
                {
                    System.out.print("ODD ");
                }

                if (X > 0) 
                {
                    System.out.println("POSITIVE");
                }
                else
                {
                    System.out.println("NEGATIVE");
                }
            } 
            else 
            {
                System.out.println("NULL");
            }
        }

        scanner.close();
    }
}