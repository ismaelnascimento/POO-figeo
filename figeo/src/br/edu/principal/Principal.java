package br.edu.principal;

import java.util.Scanner;
import br.edu.figespaciais.*;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cilindro c1 = new Cilindro();
		
		System.out.println("Digite a altura do cilindro: ");
		c1.altura = sc.nextDouble();
		System.out.println("Digite o raio do cilindro: ");
		c1.raio = sc.nextDouble();
		
		c1.calcAreaLateral();
		c1.calcAreaBase();
		c1.calcAreaTotal();
		c1.calcVolume();
	}

}
