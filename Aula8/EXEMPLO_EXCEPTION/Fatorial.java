package EXEMPLO_EXCEPTION;
public class Fatorial {
    public static long calcular( int num ) throws IllegalArgumentException {
        if(num >= 0){
            long fat = 1;
      for( int i = 2; i <= num; i++ ) {
         fat *= i;
        }
 
      return fat;
        }else{
              throw new IllegalArgumentException("nao existe fatorial de numero negativo!");
        }

    }
}