package br.edu.figespaciais;

public class Tetraedo {
   public double aresta;
   public double altura;
   public double areaLateral;
   public double areaBase;
   public double areaTotal;
   public double volume;
   
   public void calcAreaLateral() {
	   areaLateral = (3 * Math.pow(aresta, 2) * Math.sqrt(3)) / 4;
	   System.out.println("Cilindro | Área lateral: " + areaLateral);
   }
   public void calcAreaBase() {
	   areaBase = (Math.pow(aresta, 2) * Math.sqrt(3)) / 4;
	   System.out.println("Cilindro | Área da base: " + areaBase);
   }
   public void calcAreaTotal() {
	   areaTotal = Math.pow(aresta, 2) * Math.sqrt(3);
	   System.out.println("Cilindro | Área total: " + areaTotal);
   }
   public void calcVolume() {
	   //concerartaa
	   volume = areaBase * altura;
	   System.out.println("Cilindro | Volume: " + volume);
   }
}
