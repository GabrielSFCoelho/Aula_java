package logica;
public class Retangulo extends FormaGeometrica {
    private double Base;
    private double Altura;
    public Retangulo(){

    }
    public Retangulo(double Base , double Altura){
        this.Base = Base;
        this.Altura = Altura;
    }
    public double getAltura(){
        return Altura;
    }
    public double getBase(){
        return Base;
    }
    public void setAltura(double altura) {
        Altura = altura;
    }
    public void setBase(double base) {
        Base = base;
    }
    @Override
    public double calcularArea(){
        return Base * Altura;
    }
    @Override
    public String preencherCor() {
       
        return "Azul";
    }
}

