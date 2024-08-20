package br.edu.figplanas;

public class Trapezio extends FormasPlanas {
   public double baseMaior;
   public double baseMenor;
   public double altura;
   public double area;
   
   public void calcArea() {
	   area = ((baseMaior + baseMenor) * altura) / 2;
	   System.out.println("Área do trapezio: " + area);
   }
}
