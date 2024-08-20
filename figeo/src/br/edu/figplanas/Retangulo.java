package br.edu.figplanas;

public class Retangulo extends FormasPlanas {
   public double altura;
   public double base;
   public double area;
   
   public void calcArea() {
	   area = base * altura;
	   System.out.println("Área do retângulo: " + area);
   }
}
