package br.edu.figplanas;

public class Pentagono extends FormasPlanas {
   public double lado;
   public double apotema;
   
   public void calcArea() {
	   area = Math.pow(lado, 2) * 1.72;
	   System.out.println("Área do pentágono: " + area);
   }
}
