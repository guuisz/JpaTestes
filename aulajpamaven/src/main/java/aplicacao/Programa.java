package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;
import dominio.Trabalho;

public class Programa {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		Pessoa p = new Pessoa(null,"Jonas","Jonas@gmail.com");
		Trabalho trabalho = new Trabalho(null,"Programador",p);
		
		em.getTransaction().begin();
		em.persist(trabalho);
		em.getTransaction().commit();

		System.out.println("Pronto!");
		em.close();
		emf.close();
	}

}
