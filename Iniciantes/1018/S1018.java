import java.util.Scanner;

public class S1018 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        int valor = scanner.nextInt();
        scanner.close();
        
        int 
        cedulas100 = valor/100,
        resto = valor%100,
        
        cedulas50 = resto/50;
        resto = resto%50;
        
        int cedulas20 = resto/20;
        resto = resto%20;
        
        int cedulas10 = resto/10;
        resto = resto%10;
        
        int cedulas5 = resto/5;
        resto = resto%5;
        
        int cedulas2 = resto/2;
        resto = resto%2;
        
        System.out.println(valor);
        System.out.println(cedulas100 + " nota(s) de R$ 100,00");
        System.out.println(cedulas50 + " nota(s) de R$ 50,00");
        System.out.println(cedulas20 + " nota(s) de R$ 20,00");
        System.out.println(cedulas10 + " nota(s) de R$ 10,00");
        System.out.println(cedulas5 + " nota(s) de R$ 5,00");
        System.out.println(cedulas2 + " nota(s) de R$ 2,00");
        System.out.println(resto + " nota(s) de R$ 1,00");
    }
}