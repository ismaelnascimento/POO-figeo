package br.edu.figespaciais;

public class Paralelepipedo {
   public double comprimento;
   public double largura;
   public double altura;
   public double areaLateral;
   public double areaBase;
   public double areaTotal;
   public double volume;
   
   public void calcAreaLateral() {
	   areaLateral = (2 * (comprimento * altura)) + (2 * (largura * altura));
	   System.out.println("Paralelep�pedo | �rea lateral: " + areaLateral);
   }
   public void calcAreaBase() {
	   areaBase =  comprimento * largura;
	   System.out.println("Paralelep�pedo | �rea da base: " + areaBase);
   }
   public void calcAreaTotal() {
	   areaTotal = areaLateral + (2 * areaBase);
	   System.out.println("Paralelep�pedo | �rea total: " + areaTotal);
   }
   public void calcVolume() {
	   volume = comprimento * altura * largura;
	   System.out.println("Paralelep�pedo | Volume: " + volume);
   }
}
