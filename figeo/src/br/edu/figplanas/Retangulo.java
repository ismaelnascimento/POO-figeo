package br.edu.figplanas;

public class Retangulo {
   public double altura;
   public double base;
   public double area;
   
   public void calcArea() {
	   area = base * altura;
	   System.out.println("�rea do ret�ngulo: " + area);
   }
}
