package br.edu.figplanas;

public class Paralelogramo extends FormasPlanas {
   public double altura;
   public double base;
   
   public void calcArea() {
	   area = base * altura;
	   System.out.println("�rea do paralelogramo: " + area);
   }
}
