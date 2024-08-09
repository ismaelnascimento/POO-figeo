package br.edu.figplanas;

public class Quadrado {
   public double altura;
   public double base;
   public double area;
   
   public void calcArea() {
	   area = base * altura;
	   System.out.println("Área do quadrado: " + area);
   }
}
