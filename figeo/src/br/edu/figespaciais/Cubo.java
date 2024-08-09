package br.edu.figespacial;

public class Cubo {
   public double aresta;
   public double areaBase;
   public double areaLateral;
   public double areaTotal;
   public double volume;
   
   public void calcAreaBase() {
	  areaBase = Math.pow(aresta, 2);
	  System.out.println("�rea da base do cubo: " + areaBase); 
   }
   
   public void calcAreaLateral() {
	  areaLateral = 4 * Math.pow(aresta, 2);
	  System.out.println("�rea lateral do cubo: " + areaLateral); 
   }

   public void calcAreaTotal() {
	  areaTotal = 6 * Math.pow(aresta, 2);
	  System.out.println("�rea total do cubo: " + areaTotal); 
   }
   
   public void calcVolume() {
	  volume = Math.pow(aresta, 3);
	  System.out.println("Volume do cubo: " + volume); 
   }
}
