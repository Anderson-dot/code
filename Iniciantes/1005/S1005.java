import java.util.*;

public class S1005 
{
    public static void main(String[] args) 
    {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double 
            A = scanner.nextDouble(), 
            B = scanner.nextDouble();
        scanner.close();

        double media = ((A * 3.5) + (B * 7.5)) / 11.0;

        System.out.format("MEDIA = %.5f%n", media);
    }
}