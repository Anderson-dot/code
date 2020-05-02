import java.util.Scanner;

public class S1113 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int X, Y;
        
        do 
        {
            X = scanner.nextInt();
            Y = scanner.nextInt();

            if (X != Y) 
            {
                if (X > Y) 
                {
                    System.out.println("Decrescente");
                }
                else
                {
                    System.out.println("Crescente");
                }
            }

        } while (!(X == Y));

        scanner.close();
    }
}