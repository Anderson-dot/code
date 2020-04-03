import java.util.Scanner;

public class S1012 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        double 
            A = scanner.nextDouble(),
            B = scanner.nextDouble(),
            C = scanner.nextDouble();
        scanner.close();

        // a) a área do triângulo retângulo que tem A por base e C por altura.
        double areaTriangulo = (A * C) / 2;
        // b) a área do círculo de raio C. (pi = 3.14159)
        double areaCirculo = Math.pow(C, 2) * 3.14159;
        // c) a área do trapézio que tem A e B por bases e C por altura.
        double areaTrapezio = ((A + B) / 2) * C;
        // d) a área do quadrado que tem lado B.
        double areaQuadrado = B * B;
        // e) a área do retângulo que tem lados A e B.
        double areaRetangulo = A * B;

        System.out.format("TRIANGULO: %.3f%n", areaTriangulo);
        System.out.format("CIRCULO: %.3f%n", areaCirculo);
        System.out.format("TRAPEZIO: %.3f%n", areaTrapezio);
        System.out.format("QUADRADO: %.3f%n", areaQuadrado);
        System.out.format("RETANGULO: %.3f%n", areaRetangulo);
    }
}