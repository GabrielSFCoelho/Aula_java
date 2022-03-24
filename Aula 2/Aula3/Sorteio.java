import java.util.Random;

public class Sorteio {
    // atributos, propiedades, variaveis globais    

    //funçoes e procedimentos

    //rotina principal


    public static void main(String[] args) {
        Random gerador = new Random();
            int c= 1;
            //while quantas vezes vai rodar 
            int soma = 0;
            int maior = c;
            int menor = c;
                while (c<=1000) {
                    int n = 1 + gerador.nextInt (100); //qual o limite 
                    soma += n;
                    
                    c++; // c+=1 ou c= c + 1
                    System.out.println(n);

                    if (maior < n) 
                    {
                    maior = n;
                    }
                    if (menor > n) 
                    {
                    menor = n;
                    }

                }
            
            System.out.println("A soma é:" + soma);
            System.out.println("A media é:" + soma / 1000f);
            System.out.println("O maior é;" + maior);
            System.out.println("O menor é;" + menor);
    
    
    
    
        }

}
    