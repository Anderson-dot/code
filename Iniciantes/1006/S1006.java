import java.util.Scanner;

public class S1006 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        double 
            A = (scanner.nextDouble() * 2.0),
            B = (scanner.nextDouble() * 3.0),
            C = (scanner.nextDouble() * 5.0);
        scanner.close();
        
        double media = (A + B + C) / 10;
        System.out.format("MEDIA = %.1f%n", media);
    }    
}
