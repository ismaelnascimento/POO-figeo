package br.edu.figespaciais;

public class PrismaHexagonal {
	   public double aresta;
	   public double altura;
	   public double areaBase;
	   public double areaLateral;
	   public double areaTotal;
	   public double volume;
	   
	   public void calcAreaBase() {
		  areaBase = (3 * Math.pow(aresta, 2) * Math.sqrt(3)) / 2;
		  System.out.println("Área da base do prisma hexagonal: " + areaBase); 
	   }
	   
	   public void calcAreaLateral() {
		  areaLateral = aresta * altura;
		  System.out.println("Área lateral do prisma hexagonal: " + areaLateral); 
	   }

	   public void calcAreaTotal() {
		  areaTotal = 6 * areaLateral + 2 * areaBase;
		  System.out.println("Área total do prisma hexagonal: " + areaTotal); 
	   }
	   
	   public void calcVolume() {
		  volume = areaBase * altura;
		  System.out.println("Volume do prisma hexagonal: " + volume); 
	   }
}
