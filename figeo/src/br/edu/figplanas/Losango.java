package br.edu.figplanas;

public class Losango extends FormasPlanas {
   public double diagonalMaior;
   public double diagonalMenor;
   
   public void calcArea() {
	   area = (diagonalMaior * diagonalMenor) / 2;
	   System.out.println("�rea do losango: " + area);
   }
}
