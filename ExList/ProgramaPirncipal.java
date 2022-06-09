import java.util.*;

public class ProgramaPirncipal {
    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<Pessoa>();

        pessoas.add(new Pessoa("João", 25, 78, 1.76));
        pessoas.add(new Pessoa("Pedro", 40, 120, 1.73));
        pessoas.add(new Pessoa("Francieli", 33, 65, 1.68));
        pessoas.add(new Pessoa("Diogo", 15, 54, 1.63));
        pessoas.add(new Pessoa("Natasha", 23, 53, 1.52));

        for (Pessoa p : pessoas) {
            System.out.println(p);

        }

        System.out.println("\n----Ordenação----\n");
        Collections.sort(pessoas);

        for (Pessoa p : pessoas) {
            System.out.println(p);
        }
        Pessoa p = new Pessoa("Gustavo", 38, 80.5, 1.76);
        p.getTelefones().put("residencial","413264-3285");
        p.getTelefones().put("comercial","3763-4755");
        p.getTelefones().put("celular","99861-5310");

        System.out.printf("Telefone Celular: %s", p.getTelefones().get("celular"));
        
    }
}
