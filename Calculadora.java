import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
    
    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("---Calculadora Java---");
        
        double res = resultado();

        System.out.println("Resultado: " + res);

        main(args);
    }

    public static double resultado() {
        double a = n1();
        String b = equacao();
        double c = n2();
        double res = 0;

        switch (b){
            case "-":
                res = a - c;
                break;
            case "+":
                res = a + c;
                break;
            case "/":
                if (c != 0){
                    res = a / c;
                }
                else {res = a;
                }
                break;
            case "*":
                res = a * c;
                break;
            default:
                System.out.println("Operação não reconhecida.");
                return resultado();
        }
        return res;

    }
    
    public static double n1() {
        try {
            System.out.print("Insira o primeiro número: ");
            return leitor.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Erro: Utilize apenas vírgulas para casas decimais.");
            leitor.next(); 
            return n1();
        }
    }

    public static String equacao() {
        System.out.print("Digite a operação (+, -, *, /): ");
        String operacao = leitor.next();

        if (operacao.equals("+") || operacao.equals("-") || operacao.equals("*") || operacao.equals("/")) {
            return operacao;
        } else {
            
            System.out.println("Operador inválido!");
            return equacao();
        }
    }
    public static double n2() {
        try {
            System.out.print("Insira o segundo número: ");
            return leitor.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Erro: Utilize apenas vírgulas para casas decimais.");
            leitor.next();
            return n2();
        }
    }
}
