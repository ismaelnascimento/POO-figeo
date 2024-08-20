package br.edu.figplanas;

public class Hexagono extends FormasPlanas {
   public double lado;
   
   public void calcArea() {
	   area = (3 * Math.pow(lado, 2) * Math.sqrt(3)) / 2;
	   System.out.println("Área do hexágono: " + area);
   }
}
