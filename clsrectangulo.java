package Actividad8;

public class clsrectangulo {
    private double base;
    private double altura;
    private double resultado;
    private double ResArea;
    private double ResPerimetro;

    public double getResArea() {
        return ResArea;
    }

    public void setResArea(double resArea) {
        ResArea = resArea;
    }

    public double getResPerimetro() {
        return ResPerimetro;
    }

    public void setResPerimetro(double resPerimetro) {
        ResPerimetro = resPerimetro;
    }

    public void area(){
        ResArea = this.altura*this.base;

    }
    public void Perimetro(){
        ResPerimetro = (2*this.base)+(2*this.altura);
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double getResultado() {
        return resultado;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}
