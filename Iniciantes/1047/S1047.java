import java.util.Scanner;

public class S1047 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        //esse não consegui fazer com ifs :v
        int inicioHoras = scanner.nextInt(),
            inicioMinutos = scanner.nextInt(),
            inicio = (inicioHoras * 60) + inicioMinutos,

            terminoHoras = scanner.nextInt(),
            terminoMinutos = scanner.nextInt(),
            termino = (terminoHoras * 60) + terminoMinutos,

            diferencaInicioTermino = (24 * 60 - inicio) + termino,

            horas = diferencaInicioTermino / 60,
            minutos = diferencaInicioTermino % 60;
        scanner.close();

        if (horas >= 24 && minutos >= 1) 
        {
            horas = horas % 24;
        }

        System.out.println("O JOGO DUROU " + horas + " HORA(S) E " + minutos + " MINUTO(S)");
    }
}