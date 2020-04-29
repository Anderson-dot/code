import java.util.Scanner;

public class S1144 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= N; i++) 
        {
            System.out.println(i + " " + (i * i) + " " + (int) Math.pow(i, 3));
            System.out.println(i + " " + ((i * i) + 1) + " " + (int) (Math.pow(i, 3) + 1));
        }
    }
}