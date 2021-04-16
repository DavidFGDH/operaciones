package Actividad8;

public class clsrombo {
    private double DiagobalM;
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
    public double getDiagobalM() {
        return DiagobalM;
    }

    public void setDiagobalM(double diagobalM) {
        DiagobalM = diagobalM;
    }

    public double getDiagobalm() {
        return Diagobalm;
    }

    public void setDiagobalm(double diagobalm) {
        Diagobalm = diagobalm;
    }

    private double Diagobalm;

    public void area(){
         ResArea = (DiagobalM*Diagobalm)/2;
    }
    public void Perimetro(){
         ResPerimetro = 2*(Math.sqrt(((DiagobalM*DiagobalM)+(Diagobalm*Diagobalm))));
    }
}
