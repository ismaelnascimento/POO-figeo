package br.edu.figplanas;

public class Pentagono {
   public double lado;
   public double apotema;
   public double area;
   
   public void calcArea() {
	   area = Math.pow(lado, 2) * 1.72;
	   System.out.println("Área do pentágono: " + area);
   }
}
