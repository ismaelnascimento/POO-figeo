package br.edu.figespacial;

public class Esfera {
   public double raio;
   public double altura;
   public double areaBase;
   public double areaLateral;
   public double areaTotal;
   public double volume;
   
   public void calcAreaBase() {
	  areaBase = 4 * Math.PI * Math.pow(raio, 2);
	  System.out.println("Área da base da esfera: " + areaBase); 
   }
   
   public void calcAreaLateral() {
	  areaLateral = 2 * Math.PI * raio * altura;
	  System.out.println("Área lateral da esfera: " + areaLateral); 
   }

   public void calcAreaTotal() {
	  areaTotal = 4 * Math.PI * Math.pow(raio, 2);
	  System.out.println("Área total da esfera: " + areaTotal); 
   }
   
   public void calcVolume() {
	  volume = 4./3. * Math.PI * Math.pow(raio, 3);
	  System.out.println("Volume da esfera: " + volume); 
   }
}

// prisma, cone, paralelepipedo, tetraedro, cilindro
