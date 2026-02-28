import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
    
    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("---Calculadora Java---");
        
        
        double primeiro = n1(); 
        String op = equacao();
        double segundo = n2();

        System.out.println("Resultado: " + primeiro + " " + op + " " + segundo);
    }

    
    public static double n1() {
        try {
            System.out.print("Insira o primeiro número: ");
            return leitor.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Erro: Utilize apenas vírgulas para casas decimais.");
            leitor.next(); 
            n1();
            return 0;
        }
    }

    
    public static String equacao() {
        System.out.print("Digite a operação (+, -, *, /): ");
        String operacao = leitor.next();
        
        if (!"+-*/".contains(operacao)) {
            System.out.println("Operador inválido!");
            equacao();
        }
        return operacao;
    }

    public static double n2() {
        try {
            System.out.print("Insira o segundo número: ");
            return leitor.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Erro: Utilize apenas vírgulas para casas decimais.");
            leitor.next();
            n2();
            return 0;
        }
    }
}
