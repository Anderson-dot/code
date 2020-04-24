import java.util.Scanner;

public class S1072 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(),
            in = 0, out = 0;

        for (int i = 0; i < N; i++) 
        {
            int X = scanner.nextInt();

            if (X >= 10 && X <= 20) 
            {
                in++;
            }
            else
            {
                out++;
            }
        }

        scanner.close();
        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}