import java.util.Scanner;

public class S1007 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt(), 
            B = scanner.nextInt(),
            C = scanner.nextInt(),
            D = scanner.nextInt();
        scanner.close();
        
        System.out.println("DIFERENCA = " + ((A * B) - (C * D)));
    }
}
