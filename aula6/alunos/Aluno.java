package alunos;

public class Aluno
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int RGM;
    private String nome;
    private int anoIngresso;
    

    /**
     * Construtor para objetos da classe Aluno
     */
    public Aluno(int RGM, String nome, int anoIngresso)
    {
        // inicializa variáveis de instância
        this.RGM =RGM;
        this.nome=nome;
        this.anoIngresso = anoIngresso;
    }
    //getter e setters
    public int getRGM(){
        return this.RGM;
    }
    
        public String getNome(){
        return this.nome;
    }
    
    public int getAnoIngreso(){
        return this.anoIngresso;
    }
    
    public void setRGM(int RGM){
        RGM = this.RGM;
    }
    
    public void setNome (String nome){
        this.nome = nome;
    }
    
    public void setAnoIngresso(int anoIngresso){
        this.anoIngresso = anoIngresso;
    }
    
        @Override
    public String toString(){
        return super.toString() + ":\n"
        + String.format("RGM: %d\nNome: %s\nAnoIngresso: %d", this.RGM, this.nome, this.anoIngresso);
    }
}