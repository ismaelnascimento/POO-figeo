package br.edu.figespaciais;

public class PrismaQuadrangular {
	   public double aresta;
	   public double altura;
	   public double areaBase;
	   public double areaLateral;
	   public double areaTotal;
	   public double volume;
	   
	   public void calcAreaBase() {
		  areaBase = 2 * Math.pow(aresta, 2);
		  System.out.println("Área da base do prisma quadrangular: " + areaBase); 
	   }
	   
	   public void calcAreaLateral() {
		  areaLateral = 4 * aresta * altura;
		  System.out.println("Área lateral do prisma quadrangular: " + areaLateral); 
	   }

	   public void calcAreaTotal() {
		  areaTotal =  2 * areaBase + areaLateral;
		  System.out.println("Área total do prisma quadrangular: " + areaTotal); 
	   }
	   
	   public void calcVolume() {
		  volume = areaBase * altura;
		  System.out.println("Volume do prisma quadrangular: " + volume); 
	   }
}
