package br.edu.figespaciais;

public class Cone {
   public double raio;
   public double altura;
   public double geratriz;
   public double areaLateral;
   public double areaBase;
   public double areaTotal;
   public double volume;
   
   public void calcAreaLateral() {
	   geratriz = Math.sqrt(Math.pow(altura, 2) + Math.pow(raio, 2));
	   areaLateral = Math.PI * raio * geratriz;
	   System.out.println("Cone | Área lateral: " + areaLateral);
   }
   public void calcAreaBase() {
	   areaBase =  Math.PI * Math.pow(raio, 2);
	   System.out.println("Cone | Área da base: " + areaBase);
   }
   public void calcAreaTotal() {
	   areaTotal = areaLateral + areaBase;
	   System.out.println("Cone | Área total: " + areaTotal);
   }
   public void calcVolume() {
	   volume = 1./3. * areaBase * altura;
	   System.out.println("Cone | Volume: " + volume);
   }
}
