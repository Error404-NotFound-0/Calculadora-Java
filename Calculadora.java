import java.util.Scanner;
import java.util.InputMismatchException;

public class Calculadora{
    Scanner leitor = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("---Calculadora Java---");
    }
    public double n1(double n1){
        try{
            
            double n1 = leitor.nextDouble();
            return n1;
        }
        catch (InputMismatchException e){
            System.out.print("Utilize apenas vírgulas para casas decimais.");
            return;
        }
    }


    String equacao = leitor.next();
    if (!"+-*/".contains(equacao)){
        System.out.println("Operador inválido!");
        return;
    }
    else {
        continue;
    }

    public double n2(double n2){
        try{
            double n2 = leitor.nextDouble();
            return n2;
        }
        catch (InputMismatchException e){
            System.out.print("Utilize apenas vírgulas para casas decimais.");
            return;
        }
    }
}



