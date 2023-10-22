/**
 * 
 */
package br.com.arneidev.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.arneidev.domain.Curso;

/**
 * @author mdias
 *
 */
public class CursoDAO implements ICursoDAO{

	@Override
	public Curso cadastrar(Curso curso) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ProjetoVandaCursoJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(curso);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
		
		return curso;
	}

}
