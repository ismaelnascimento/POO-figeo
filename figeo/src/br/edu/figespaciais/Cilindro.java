package br.edu.figespaciais;

public class Cilindro {
   public double raio;
   public double altura;
   public double areaLateral;
   public double areaBase;
   public double areaTotal;
   public double volume;
   
   public void calcAreaLateral() {
	   areaLateral = 2 * Math.PI * raio * altura;
	   System.out.println("Cilindro | Área lateral: " + areaLateral);
   }
   public void calcAreaBase() {
	   areaBase = Math.PI * Math.pow(raio, 2);
	   System.out.println("Cilindro | Área da base: " + areaBase);
   }
   public void calcAreaTotal() {
	   areaTotal = areaLateral + areaBase * 2;
	   System.out.println("Cilindro | Área total: " + areaTotal);
   }
   public void calcVolume() {
	   volume = areaBase * altura;
	   System.out.println("Cilindro | Volume: " + volume);
   }
}
