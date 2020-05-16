import java.util.Scanner;

public class S1016 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt(); 
        scanner.close();

        x *= 2;

        System.out.println(x + " minutos");
    }
}
