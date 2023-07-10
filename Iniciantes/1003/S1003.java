import java.util.Scanner;

public class S1003
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt(), 
            B = scanner.nextInt();
        scanner.close();

        int SOMA = A + B;
        
        System.out.println("SOMA = " + SOMA);
    }
}
