
import java.util.Scanner;
public class calculadoraFatorial{
	public static void main(String[]args){
        int n;
        int fatorial = 1;
	    Scanner input = new Scanner(System.in);
	    System.out.println("Digite o número para calcular a fatorial:");
        n = input.nextInt();
        int i=1;
		if (n == 0){
			System.out.println("A fatorial de 0 é: 1");
		}
	    else if (n < 0){
			System.out.println("Insira um número válido!");
		}
		else{
		do{
	    fatorial=fatorial*i;
        i++;
 	    }
        while (i<=n);
  	    System.out.println("A fatorial de "+n+" é: "+fatorial);
		}
	input.close();
	}
}