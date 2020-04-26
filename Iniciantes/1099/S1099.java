import java.util.Scanner;

public class S1099 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        
        for (int i = 0; i < N; i++) 
        {
            int X = scanner.nextInt(),
                Y = scanner.nextInt(),
                contador = 0;
            
            if (X != Y)
            {
                if (X > Y) 
                {
                    for (Y = Y+1; Y < X; Y++) 
                    {
                        if (Y%2 == 1) 
                        {
                            contador += Y;
                        }
                    }
                } 
                else 
                {
                    for (X = X+1; X < Y; X++) 
                    {
                        if (X%2 == 1) 
                        {
                            contador += X;
                        }
                    }
                }

                System.out.println(contador);
            }
            else
            {
                System.out.println(0);
            }
        }

        scanner.close();
    }
}