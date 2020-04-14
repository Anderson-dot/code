import java.util.Scanner;

public class S1042 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt(),
            B = scanner.nextInt(),
            C = scanner.nextInt();
        scanner.close();

        //Não revisar nunca mais
        if (A >= B && A >= C && B >= C) 
        {
            System.out.println(C);
            System.out.println(B);
            System.out.println(A);
        } 
        else if (A >= B && A >= C && C >= B) 
        {
            System.out.println(B);
            System.out.println(C);
            System.out.println(A);
        } 
        else if (B >= A && B >= C && A >= C) 
        {
            System.out.println(C);
            System.out.println(A);
            System.out.println(B);
        } 
        else if (B >= A && B >= C && C >= A) 
        {
            System.out.println(A);
            System.out.println(C);
            System.out.println(B);
        } 
        else if (C >= A && C >= B && A >= B) 
        {
            System.out.println(B);
            System.out.println(A);
            System.out.println(C);
        } 
        else if (C >= A && C >= B && B >= A) 
        {
            System.out.println(A);
            System.out.println(B);
            System.out.println(C);
        }

        System.out.println();
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }
}