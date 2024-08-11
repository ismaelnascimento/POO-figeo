package br.edu.figespaciais;

public class Tetraedro {
	  public double aresta;
	   public double altura;
	   public double areaLateral;
	   public double areaBase;
	   public double areaTotal;
	   public double volume;
	   
	   public void calcAreaLateral() {
		   areaLateral = (3 * Math.pow(aresta, 2) * Math.sqrt(3)) / 4;
		   System.out.println("Tetraedro | Área lateral: " + areaLateral);
	   }
	   public void calcAreaBase() {
		   areaBase = (Math.pow(aresta, 2) * Math.sqrt(3)) / 4;
		   System.out.println("Tetraedro | Área da base: " + areaBase);
	   }
	   public void calcAreaTotal() {
		   areaTotal = Math.pow(aresta, 2) * Math.sqrt(3);
		   System.out.println("Tetraedro | Área total: " + areaTotal);
	   }
	   public void calcVolume() {
		   volume = (Math.pow(aresta, 3) * Math.sqrt(2))/12;
		   System.out.println("Tetraedro | Volume: " + volume);
	   }
}
