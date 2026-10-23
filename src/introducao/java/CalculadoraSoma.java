package introducao.java;
import java.util.Scanner;

public class CalculadoraSoma {

    void main (){
      Scanner scanner = new Scanner(System.in);


      System.out.println("Soma de dois números");
      System.out.print("Digite o primeiro número: ");
      double num1 = scanner.nextDouble();

      System.out.print("Digite o segundo número: ");
      double num2 = scanner.nextDouble();

      double resultado = num1 + num2;
        int valorInt = (int) resultado;

      if(resultado %1 ==0)
        System.out.println("Resultado: "+ valorInt);
      else
          System.out.println("Resultado: " + resultado);

      if(resultado % 2 == 0)
            System.out.println("Seu resultado é um Número Par");
      else
            System.out.println("Seu resultado é um Número Ímpar");



    }

}