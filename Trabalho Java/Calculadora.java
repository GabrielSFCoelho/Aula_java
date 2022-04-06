

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        System.out.println("Programa de Operações Matemáticas");
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecione uma operaçao: ");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtraçao");
        System.out.println("3 - Multiplicaçao");
        System.out.println("4 - Divisao");
        int conta = sc.nextInt();
        System.out.println();
        System.out.println("Digite o primeiro número: ");
        int numero1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int numero2 = sc.nextInt();
        System.out.println();
        switch (conta) {
            case 1:
                System.out.println(soma(numero1, numero2));
                break;
            case 2:
                System.out.println(subtracao(numero1, numero2));
                break;
            case 3:
                System.out.println(multiplicacao(numero1, numero2));
                break;
            case 4:
                System.out.println(divisao(numero1, numero2));
                break;
            default:
                System.out.println("operação não encontrada");
                break;
        }
        sc.close();
        System.out.println();
        System.out.println("fim da operações matemáticas");
    }

    public static int soma(int x, int y){
        int result = x + y;
        return result;
    }

    public static int subtracao(int x, int y){
        int result = x - y;
        return result;
    }

    public static int multiplicacao(int x, int y){
        int result = x * y;
        return result;
    }

    public static float divisao(int x, int y){
        float result = x / (float)y;
        return result;
    }
}