import java.util.Scanner;

public class S1143 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= X; i++) 
        {
            System.out.println(i + " " + (int) Math.pow(i, 2) + " " + (int) Math.pow(i, 3));
        }
    }
}