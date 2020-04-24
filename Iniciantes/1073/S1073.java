import java.util.Scanner;

public class S1073 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        for (int i = 2, N = scanner.nextInt(); i <= N; i += 2) 
        {
            System.out.println(i + "^2 = " + (i * i));
        }

        scanner.close();
    }
}