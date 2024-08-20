package br.edu.figplanas;

public class Circulo extends FormasPlanas {
   private double raio;
   
   public void calcArea() {
	   area = Math.PI * Math.pow(raio, 2);
	   System.out.println("Área do círculo: " + area);
   }
}
