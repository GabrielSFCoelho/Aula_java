package EXEMPLO_EXCEPTION;

public class ProgamaPrincipal {
    public static void main(String[] args) {
        int num = ConsoleUtil.lerInteiro("Digite Inteiro: ");
        try{
        long fat = Fatorial.calcular(num);
        System.out.printf("%d! = %d", num, fat);
        }catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        } finally{
            System.out.println("Progama terminado. Volte sempre!");
        }
    }
}
