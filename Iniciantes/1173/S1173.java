import java.util.Scanner;

public class S1173
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int[] N = new int[10];
        int start = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < N.length; i++, start *= 2) 
        {
            N[i] = start;
            System.out.println("N[" + i + "] = " + N[i]);
        }
    }
}