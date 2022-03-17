import java.util.Scanner;

public class calendario {
    // funçoes e procedimentos
    public static String mostrarNomeMesIf (int mes) {
        String nomeMes = "";
        if (mes == 1) {
            nomeMes = "janeiro";
            } else if (mes == 2 ) {
            nomeMes = "fevereiro";
            }else if (mes == 3 ) {
            nomeMes = "Março";
            }else if (mes == 4 ) {
            nomeMes = "Abril";
            }else if (mes == 5 ) {
            nomeMes = "Maio";
            } else if (mes == 6 ){
            nomeMes = "Junho";
            }else if (mes == 7 ) {
            nomeMes = "Julho";
            }else if (mes == 8 ) {
            nomeMes = "Agosto";
            }else if (mes == 9 ) {
            nomeMes = "Setembro";
            }else if (mes == 10 ) {
            nomeMes = "Outubro";
            }else if (mes == 11 ) {
            nomeMes = "Novembro";
            }else if (mes == 12 ) {
            nomeMes = "Dezembro";
            }else if (mes > 12 ){
            nomeMes = "Digite um mes valido";
        }
            return nomeMes;
    }
    public static String mostrarNomeMesSwitch (int mes){
        String nomeMes ="";
        switch (mes){
            case 1:
                nomeMes = "janeiro";
                break;
            case 2:
                nomeMes = "fevereiro";
                break;
            case 3:
                nomeMes = "Março";
                break;
            case 4:
                nomeMes = "Abril";
                break;
            case 5:
                nomeMes = "Maio";
                break;
            case 6:
                nomeMes = "Junho";
                break; 
            case 7:
                nomeMes = "Julho";
                break;
            case 8:
                nomeMes = "Agosto";
                break;
            case 9:
                nomeMes = "Setembro";
                break;
            case 10:
                nomeMes = "Outubro";
                break;
            case 11:
                nomeMes = "Novembro";
                break;
            case 12:
                nomeMes = "Dezembro";
                break;
        }
        return nomeMes;
    }
    // funçao principal
    public static void main(String[] args) {
      //mostrar msg para o usuario
        System.out.println("Digite o mês:");
        Scanner input = new Scanner(System.in);
     //ler numero digitado no teclado
        int mes = input.nextInt();
     //mostrar nome do mes
     //    usando if 
     //    usando switch
     System.out.println("numero digitado =" + mes);
     System.out.println("nome do mês (if) = " + mostrarNomeMesIf(mes));
     System.out.println("nome do mês (Switch) = " + mostrarNomeMesSwitch(mes));
      input.close();
    }
}
