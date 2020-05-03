import java.util.Scanner;

public class S1115
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int X, Y;

        do 
        {
            X = scanner.nextInt();
            Y = scanner.nextInt();

            if (X != 0 && Y != 0) 
            {
                if (X > 0)
                {
                    if (Y > 0) 
                    {
                        System.out.println("primeiro");
                    } 
                    else 
                    {
                        System.out.println("quarto");
                    }
                } 
                else 
                {
                    if (Y > 0) 
                    {
                        System.out.println("segundo");
                    }
                    else
                    {
                        System.out.println("terceiro");
                    }
                }
            }

        } while (X != 0 && Y != 0);

        scanner.close();
    }
}