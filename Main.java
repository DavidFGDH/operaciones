package Actividad8;

import javax.swing.*;

public class Main {
    public static void panelinput(int opcion){
        clscuadro Cuadrado = new clscuadro();
        clsrectangulo Rectangulo = new clsrectangulo();
        clstriangulo Triangulo = new clstriangulo();
        clsrombo Rombo = new clsrombo();
        double lado,base,altura,DiagobalM,Diagobalm;
        if(opcion==1) {
            lado = Double.parseDouble(JOptionPane.showInputDialog("Inserta el valor de un lado del cuadrado"));
            Cuadrado.setLado(lado);
           // System.out.println(lado);
            Cuadrado.area();
            Cuadrado.Perimetro();
            JOptionPane.showMessageDialog(null,"El area del cuadrado es "+Cuadrado.getResArea()+"\n"+
                    "El perimetro del cuadrado es "+Cuadrado.getResPerimetro());
        }
        else if(opcion==2){ 
            base = Double.parseDouble(JOptionPane.showInputDialog("Inserta el valor de la base del rectangulo"));
            Rectangulo.setBase(base);
            altura = Double.parseDouble(JOptionPane.showInputDialog("Inserta el valor de la altura del rectangulo"));
            Rectangulo.setAltura(altura);
            Rectangulo.Perimetro();
            Rectangulo.area();
            JOptionPane.showMessageDialog(null,"El area del cuadrado es "+Rectangulo.getResArea()+"\n"+
                    "El perimetro del cuadrado es "+Rectangulo.getResPerimetro());
        }
        else if(opcion==3){
            lado = Double.parseDouble(JOptionPane.showInputDialog("Inserta el valor de un lado del triangulo"));
            altura = Double.parseDouble(JOptionPane.showInputDialog("Inserta el valor de la altura del triangulo"));
            Triangulo.setAltura(altura);
            Triangulo.setLado(lado);
            Triangulo.area();
            Triangulo.Perimetro();
            JOptionPane.showMessageDialog(null,"El area del cuadrado es "+  Triangulo.getResArea()+"\n"+
                    "El perimetro del cuadrado es "+Triangulo.getResPerimetro());
        }
        else{
            DiagobalM = Double.parseDouble(JOptionPane.showInputDialog("Inserta el valor de la diagonal Mayor del Rombo"));
            Diagobalm = Double.parseDouble(JOptionPane.showInputDialog("Inserta el valor de la diagonal menor del Rombo"));
            Rombo.setDiagobalM(DiagobalM);
            Rombo.setDiagobalm(Diagobalm);
            Rombo.area();
            Rombo.Perimetro();
            JOptionPane.showMessageDialog(null,"El area del cuadrado es "+Rombo.getResArea()+"\n"+
                    "El perimetro del cuadrado es "+Rombo.getResPerimetro());
        }

    }
    public static void main(String[] args) {
        int opcion;
        while (true) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Cual figura desea calcular?\n" +
                    "1 = Cuadrado \n2 = Rectangulo \n3 = Triangulo\n4 = Rombo\n5 = Salir"));
            if(opcion==5){
                break;
            }
            panelinput(opcion);
        }

    }
}
