import java.util.Scanner;

public class S1175
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int[] N = new int[20];

        for (int i = 19; i >= 0; i--) 
        {
            N[i] = scanner.nextInt();
        }

        scanner.close();
        
        for (int i = 0; i < N.length; i++) 
        {
            System.out.println("N[" + i + "] = " + N[i]);
        }
    }
}