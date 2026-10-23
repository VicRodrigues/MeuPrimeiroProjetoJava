package introducao.java;
import java.util.Scanner;

public class CalcValoresComIf {
    void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Defina qual tipo de Operação(utilize os simbolos): ");
        String s = scanner.nextLine();

        if (s.equals("+")) {
            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            double resultado = num1 + num2;
            int valorInt = (int) resultado;

            if (resultado % 1 == 0)
                System.out.println("Resultado: " + valorInt);
            else
                System.out.println("Resultado: " + resultado);
        } else if (s.equals("-")) {
            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            double resultado = num1 - num2;
            int valorInt = (int) resultado;

            if (resultado % 1 == 0)
                System.out.println("Resultado: " + valorInt);
            else
                System.out.println("Resultado: " + resultado);

        } else if (s.equals("*")) {
            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            double resultado = num1 * num2;
            int valorInt = (int) resultado;

            if (resultado % 1 == 0)
                System.out.println("Resultado: " + valorInt);
            else
                System.out.println("Resultado: " + resultado);

        } else if (s.equals("/")) {
            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            double resultado = num1 / num2;
            int valorInt = (int) resultado;

            if (resultado % 1 == 0)
                System.out.println("Resultado: " + valorInt);
            else
                System.out.println("Resultado: " + resultado);

        }
    }
    }

