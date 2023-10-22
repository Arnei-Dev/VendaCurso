package br.com.arneidev;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.arneidev.dao.CursoDAO;
import br.com.arneidev.dao.ICursoDAO;
import br.com.arneidev.domain.Curso;

public class AppTeste {
	private ICursoDAO cursoDAO;
	
	public AppTeste() {
		cursoDAO = new CursoDAO();
	}
	
	@Test
	public void cadastrar() {
		Curso curso = new Curso();
		curso.setCondigo("01");
		curso.setNome("Curso Java Pro");
		curso.setDescricao("Java do zero ao Pro");
		cursoDAO.cadastrar(curso);
		assertNotNull(curso);
		assertNotNull(curso.getId());
	}
}
