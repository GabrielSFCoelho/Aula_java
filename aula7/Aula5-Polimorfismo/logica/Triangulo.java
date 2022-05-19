package logica;
public class Triangulo extends FormaGeometrica {
    private double Base;
    private double Altura;
    public Triangulo(){

       }
    public Triangulo(double Base , double Altura){
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
        return Base * Altura / 2;
    }
    @Override
    public String preencherCor() {
        
        return  "Amarelo";
    }
}


