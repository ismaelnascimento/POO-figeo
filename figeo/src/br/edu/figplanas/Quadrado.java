package br.edu.figplanas;

public class Quadrado extends FormasPlanas {
   public double lado;
   
   public void calcArea() {
	   area = Math.pow(lado, 2);
	   System.out.println("Área do quadrado: " + area);
   }
}
