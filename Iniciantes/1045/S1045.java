import java.util.Scanner;

public class S1045 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        double
            A = scanner.nextDouble(),
            B = scanner.nextDouble(),
            C = scanner.nextDouble();
        scanner.close();

        double 
            maior = Math.max(A, (Math.max(B, C))),
            medio = 0, menor = 0;

        if (maior == A) 
        {
            medio = Math.max(B, C);
            menor = Math.min(B, C);
        }
        else if (maior == B)  
        {
            medio = Math.max(A, C);
            menor = Math.min(A, C);
        }
        else if (maior == C) 
        {
            medio = Math.max(A, B);
            menor = Math.min(A, B);
        }

        A = maior;
        B = medio;
        C = menor;

        if (A >= (B + C)) 
        {
            System.out.println("NAO FORMA TRIANGULO");
        } 
        else 
        {
            if (Math.pow(A, 2) == (Math.pow(B, 2) + Math.pow(C, 2))) 
            {
                System.out.println("TRIANGULO RETANGULO");
            }
            else if (Math.pow(A, 2) > (Math.pow(B, 2) + Math.pow(C, 2)))
            {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            else if (Math.pow(A, 2) < (Math.pow(B, 2) + Math.pow(C, 2)))
            {
                System.out.println("TRIANGULO ACUTANGULO");
            }

            if (A == B && A == C) 
            {
                System.out.println("TRIANGULO EQUILATERO");
            } 
            else if (A == B || A == C || B == C)
            {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}