package br.edu.figespaciais;

public class Piramide {
	   public double arestab;
	   public double arestal;
	   public double apotemap;
	   public double apotemab;
	   public double altura;
	   public double areaBase;
	   public double areaLateral;
	   public double areaTotal;
	   public double volume;
	   
	   public void calcAreaBase() {
		  areaBase = Math.pow(arestab, 2);
		  System.out.println("Área da base da pirâmide: " + areaBase); 
	   }
	   
	   public void calcAreaLateral() {
		  apotemap = Math.pow(apotemab, 2) + Math.pow(altura, 2);
		  arestal = Math.pow(apotemap, 2) + Math.pow((arestab/2), 2);
		  areaLateral = (arestab * apotemap * 4)/2;
		  System.out.println("Área lateral da pirâmide: " + areaLateral); 
	   }

	   public void calcAreaTotal() {
		  areaTotal = areaBase + areaLateral;
		  System.out.println("Área total da pirâmide: " + areaTotal); 
	   }
	   
	   public void calcVolume() {
		  volume = (areaBase * altura)/3;
		  System.out.println("Volume da pirâmide: " + volume); 
	   }
}
