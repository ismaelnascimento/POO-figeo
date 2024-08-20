package br.edu.figplanas;

public class Triangulo extends FormasPlanas {
   public double altura;
   public double base;
   public double area;
   
   public void calcArea() {
	   area = (base * altura) / 2;
	   System.out.println("Área do triângulo: " + area);
   }
}
