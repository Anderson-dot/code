import java.util.Scanner;
import java.text.DecimalFormat;

public class S1002 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        double 
            n = 3.14159,
            raio = scanner.nextDouble();
        scanner.close();
        
        double area = (Math.pow(raio, 2) * n);
        DecimalFormat decimalFormat = new DecimalFormat("#.0000");
        
        System.out.println("A=" + decimalFormat.format(area));
    }
}