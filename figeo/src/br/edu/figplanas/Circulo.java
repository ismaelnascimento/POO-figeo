package br.edu.figplanas;

public class Circulo extends FormasPlanas {
   private double raio;
   
   public void calcArea() {
	   area = Math.PI * Math.pow(raio, 2);
	   System.out.println("�rea do c�rculo: " + area);
   }
}
