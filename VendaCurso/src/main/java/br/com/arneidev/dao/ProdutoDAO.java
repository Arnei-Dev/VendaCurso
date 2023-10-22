/**
 * 
 */
package br.com.arneidev.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.arneidev.domain.Produto;

/**
 * @author mdias
 *
 */
public class ProdutoDAO implements IProdutoDAO {

	@Override
	public Produto cadastrar(Produto prod) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ProjetoVandaCursoJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(prod);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
		
		
		return prod;
	}

}
