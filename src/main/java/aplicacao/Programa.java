package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		
		/*
		Pessoa p1 = new Pessoa(null, "Augusto", "augusto@gmail.com");
		Pessoa p2 = new Pessoa(null, "Bárbara", "barbara@gmail.com");
		Pessoa p3 = new Pessoa(null, "Caio", "caio@gmail.com");
		
		*/
		
		EntityManagerFactory enf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = enf.createEntityManager();
		
		/*
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		*/
		
		Pessoa p = em.find(Pessoa.class, 2);
		System.out.println(p);
		System.out.println("Pronto!");
		
		em.close();
		enf.close();
		
		
		
		
		
		

	}

}
