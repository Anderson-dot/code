import java.util.Scanner;

public class S1078 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= 10; i++) 
        {
            System.out.println(i + " x " + N + " = " + (i * N));
        }
    }
}