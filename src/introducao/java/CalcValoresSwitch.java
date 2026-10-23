package introducao.java;
import java.util.Scanner;

public class CalcValoresSwitch {
    void main(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Defina o tipo de operação (+, -, *, /): ");
        String s = scanner.nextLine();

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado;

        switch(s) {
            case "+":
                resultado = num1 + num2;
                break;

            case "-":
                resultado = num1 - num2;
                break;

            case "*":
                resultado = num1 * num2;
                break;

            case "/":
                if (num2 == 0) {
                    System.out.println("ERRO: Divisão por zero");
                    scanner.close();
                    return;
                }
                resultado = num1 / num2;
                break;

            default:
                System.out.print("Operação inválida!");
                scanner.close();
                return;
        }
                if (resultado % 1 == 0 )
                    System.out.print("Resultado: " + (int) resultado );
                else
                    System.out.print("Resultado: " + resultado);

        scanner.close();
    }
}
