import java.util.Scanner;

public class S1021 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        double valor = scanner.nextDouble();
        scanner.close();

        int cedulas = (int) valor;
        double quebrado = (valor - cedulas) * 100;
        int moedas = (int) quebrado;
        
        int cedulas100 = (int) (cedulas/100);
        double resto = cedulas%100;
        
        int cedulas50 = (int) (resto/50);
        resto = resto%50;
        
        int cedulas20 = (int) (resto/20);
        resto = resto%20;
        
        int cedulas10 = (int) (resto/10);
        resto = resto%10;
        
        int cedulas5 = (int) (resto/5);
        resto = resto%5;
        
        int cedulas2 = (int) (resto/2);
        resto = resto%2;
        //MOEDAS
        int moedas1 = (int) (resto/1);
        resto = resto%1;

        int moedas50 = (int) (moedas/50);
        resto = moedas%50;

        int moedas25 = (int) (resto/25);
        resto = resto%25;

        int moedas10 = (int) (resto/10);
        resto = resto%10;

        int moedas5 = (int) (resto/5);
        resto = resto%5;
        
        System.out.println("NOTAS:");
        System.out.println(cedulas100 + " nota(s) de R$ 100.00");
        System.out.println(cedulas50 + " nota(s) de R$ 50.00");
        System.out.println(cedulas20 + " nota(s) de R$ 20.00");
        System.out.println(cedulas10 + " nota(s) de R$ 10.00");
        System.out.println(cedulas5 + " nota(s) de R$ 5.00");
        System.out.println(cedulas2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(moedas1 + " moeda(s) de R$ 1.00");
        System.out.println(moedas50 + " moeda(s) de R$ 0.50");
        System.out.println(moedas25 + " moeda(s) de R$ 0.25");
        System.out.println(moedas10 + " moeda(s) de R$ 0.10");
        System.out.println(moedas5 + " moeda(s) de R$ 0.05");
        System.out.println((int) resto + " moeda(s) de R$ 0.01");
    }
}