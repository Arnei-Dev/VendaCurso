/**
 * 
 */
package br.com.arneidev.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.arneidev.domain.Matricula;

/**
 * @author mdias
 *
 */
public class MatriculaDAO implements IMatriculaDAO {

	@Override
	public Matricula cadastrar(Matricula matricula) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ProjetoVandaCursoJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(matricula);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
		
		return matricula;
	}

}
