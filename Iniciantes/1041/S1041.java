import java.util.Scanner;

public class S1041 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        double
            eixoX = scanner.nextDouble(),
            eixoY = scanner.nextDouble();
        scanner.close();
        
        if (!(eixoX == 0 || eixoY == 0)) 
        {
            if (eixoX > 0) 
            {
                if (eixoY > 0) 
                {
                    System.out.println("Q1");
                }
                else
                {
                    System.out.println("Q4");
                }
            }
            else
            {
                if (eixoY > 0) 
                {
                    System.out.println("Q2");
                }
                else
                {
                    System.out.println("Q3");
                }
            }
        }
        else
        {
            if (eixoX == 0 && eixoY == 0) 
            {
                System.out.println("Origem");
            } 
            else 
            {
                if (eixoX == 0) 
                {
                    System.out.println("Eixo Y");
                }
                else
                {
                    System.out.println("Eixo X");
                }
            }
        }
    }
}