package aplicacao;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		
		Pessoa p1 = new Pessoa(1, "Augusto", "augusto@gmail.com");
		Pessoa p2 = new Pessoa(2, "Bárbara", "barbara@gmail.com");
		Pessoa p3 = new Pessoa(3, "Caio", "caio@gmail.com");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		

	}

}
