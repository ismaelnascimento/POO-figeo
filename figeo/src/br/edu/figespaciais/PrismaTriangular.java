package br.edu.figespaciais;

public class PrismaTriangular {
	
	public double aresta;
	public double compArestaBase;
	public double areaBase;
	public double areaLateral;
	public double alturaBase;
	public double altura;
	public double areaTotal;
	public double volume;
	
	public void calcAreaBase() {
		areaBase = (Math.pow(aresta, 2) * Math.sqrt(3))/4;
		System.out.println("O valor da área da base do prisma triangular é: "+areaBase);
	}
	
	public void calcAreaLateral() {
		areaLateral = 3 * aresta * altura;
		System.out.println("O valor da área lateral do prisma triangular é: "+areaLateral);
	}

	public void calcAreaTotal() {
		areaTotal = areaLateral + (2 * areaBase);
		System.out.println("O valor da área total do prisma triangular é: "+areaTotal);
	}
	
	public void calcVolume() {
		volume = (compArestaBase * alturaBase * altura)/2;
		System.out.println("O valor do volume do prisma triangular é: "+volume);
	}
}
