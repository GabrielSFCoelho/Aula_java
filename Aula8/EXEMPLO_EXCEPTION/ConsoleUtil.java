package EXEMPLO_EXCEPTION;

import java.util.Scanner;

public class ConsoleUtil{
    public static int lerInteiro(String msg){
        System.out.println(msg);
        Scanner input = new Scanner(System.in);
        String linhaDigitada = input.next();
        while(true){
            try{
                int num = Integer.parseInt(linhaDigitada);
                input.close();
                return num;
            } catch(NumberFormatException ex){
                 System.out.println("Valor informado não é um numero inteiro valido! tente novamente.");
                //System.out.println(ex.getMessage());
                //ex.printStackTrace();
            }
        }
    }   
}