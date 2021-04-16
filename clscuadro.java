package Actividad8;

public class clscuadro {
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

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public void area(){
         ResArea = lado*lado;
    }
    public void Perimetro(){
         ResPerimetro = lado*4;
    }
}
