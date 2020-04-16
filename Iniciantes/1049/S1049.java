import java.util.Scanner;

public class S1049 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        String 
            palavra1 = scanner.nextLine(),
            palavra2 = scanner.nextLine(),
            palavra3 = scanner.nextLine(),
            animal = "";
        scanner.close();

        if (palavra1.equals("vertebrado"))
        {
            if (palavra2.equals("ave"))
            {
                if (palavra3.equals("carnivoro"))
                {
                    animal = "aguia";
                }
                else if (palavra3.equals("onivoro"))
                {
                    animal = "pomba";
                }
            }
            else if (palavra2.equals("mamifero"))
            {
                if (palavra3.equals("onivoro"))
                {
                    animal = "homem";
                }
                else if (palavra3.equals("herbivoro"))
                {
                    animal = "vaca";
                }
            }
        }   
        else if (palavra1.equals("invertebrado"))
        {
            if (palavra2.equals("inseto"))
            {
                if (palavra3.equals("hematofago"))
                {
                    animal = "pulga";
                }
                else if (palavra3.equals("herbivoro"))
                {
                    animal = "lagarta";
                }
            }
            else if (palavra2.equals("anelideo"))
            {
                if (palavra3.equals("hematofago"))
                {
                    animal = "sanguessuga";
                }
                else if (palavra3.equals("onivoro"))
                {
                    animal = "minhoca";
                }
            }
        }

        System.out.println(animal);
    } 
}