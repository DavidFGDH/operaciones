package Actividad8;

public class clstriangulo {
    private double altura;
    private double lado;
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

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public void area(){
         ResArea = (altura*lado)/2;
    }
    public void Perimetro(){
         ResPerimetro = lado*3;
    }
}
