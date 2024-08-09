package br.edu.figespacial;

public class PrismaPentagonal {
	   public double aresta;
	   public double altura;
	   public double areaBase;
	   public double areaLateral;
	   public double areaTotal;
	   public double volume;
	   
	   public void calcAreaBase() {
		  areaBase = (3 * Math.pow(aresta, 2) * Math.sqrt(3)) / 2;
		  System.out.println("Área da base do prisma pentagonal: " + areaBase); 
	   }
	   
	   public void calcAreaLateral() {
		  areaLateral = aresta * altura;
		  System.out.println("Área lateral do prisma pentagonal: " + areaLateral); 
	   }

	   public void calcAreaTotal() {
		  areaTotal = 5 * areaLateral + 2 * areaBase;
		  System.out.println("Área total do prisma pentagonal: " + areaTotal); 
	   }
	   
	   public void calcVolume() {
		  volume = areaBase * altura;
		  System.out.println("Volume do prisma pentagonal: " + volume); 
	   }
}
