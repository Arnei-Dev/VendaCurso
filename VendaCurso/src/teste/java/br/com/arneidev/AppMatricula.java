/**
 * 
 */
package br.com.arneidev;

import static org.junit.Assert.assertNotNull;

import java.time.Instant;

import org.junit.Test;

import br.com.arneidev.dao.IMatriculaDAO;
import br.com.arneidev.dao.MatriculaDAO;
import br.com.arneidev.domain.Matricula;

/**
 * @author mdias
 *
 */
public class AppMatricula {
	
	private IMatriculaDAO mat;
	
	public AppMatricula() {
		mat = new MatriculaDAO();
	}
	
	@Test
	public void cadastrar() {
		Matricula matricula = new Matricula();
		matricula.setCondigo("A1");
		matricula.setDataMatricula(Instant.now());
		matricula.setStatus("Ativa");
		matricula.setValor(2000D);
		mat.cadastrar(matricula);
		
		assertNotNull(matricula);
		assertNotNull(matricula.getId());
		
	}

}
