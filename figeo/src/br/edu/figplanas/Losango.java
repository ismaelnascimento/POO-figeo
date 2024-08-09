package br.edu.figplanas;

public class Losango {
   public double diagonalMaior;
   public double diagonalMenor;
   public double area;
   
   public void calcArea() {
	   area = (diagonalMaior * diagonalMenor) / 2;
	   System.out.println("Área do losango: " + area);
   }
}
