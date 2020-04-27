import java.util.Scanner;

public class S1142 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(),
            x3 = 1;
        scanner.close();

        for (int i = 0; i < N; i++)
        {
            for (int j = x3, pum = 0; pum < 3; j++, pum++)
            {
                System.out.print(j + " ");
            }

            System.out.println("PUM");
            x3 += 4;
        }
    }
}