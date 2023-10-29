package br.com.arneidev;

import static org.junit.Assert.assertNotNull;

import java.time.Instant;

import org.junit.Test;
import br.com.arneidev.dao.generecs.GenerecDAO;
import br.com.arneidev.dao.generecs.IGenericDAO;
import br.com.arneidev.domain.Aluno;
import br.com.arneidev.domain.Computador;
import br.com.arneidev.domain.Curso;
import br.com.arneidev.domain.Matricula;

public class AppTeste {
	private IGenericDAO<Matricula> mat;
	private IGenericDAO<Curso> curso;
	private IGenericDAO<Aluno> aluno;
	private IGenericDAO<Computador> computadorDAO;
	
	
	public AppTeste() {
		curso = new GenerecDAO<>();
		mat = new GenerecDAO<>();
		aluno = new GenerecDAO<>();
		computadorDAO = new GenerecDAO<>();		
	}
	
	@Test
	public void cadastrar() {
		Matricula matricula = new Matricula();
		matricula.setCodigo("A1");
		matricula.setDataMatricula(Instant.now());
		matricula.setStatus("Ativa");
		matricula.setValor(2000D);
		
		matricula.setCurso(criarCurso("AM - 01"));
		matricula.setAluno(cadastrarAluno("SD - 1"));
		
		
		mat.cadastrar(matricula);
		
		assertNotNull(matricula);
		assertNotNull(matricula.getId());
	}
	
	private Curso criarCurso(String cursoCod) {
		Curso cursoMatriculado = new Curso();
		cursoMatriculado.setCodigo(cursoCod);
		cursoMatriculado.setDescricao("Curso Java Pro");
		cursoMatriculado.setNome("Curso Programador Java");
		return curso.cadastrar(cursoMatriculado);
	}
	
	private Aluno cadastrarAluno(String cod) {
		Aluno al = new Aluno();
		Computador comput = cadastroComput("dddd");
		al.setCodigo(cod);
		al.setNome("Dias");
		al.addComput(comput);
		comput.addAluno(al);


		return aluno.cadastrar(al);
	}
	
	private Computador cadastroComput (String codigo) {
		Computador comput = new Computador();
		comput.setCodigo(codigo);
		comput.setDescricao("Maquina 05");
		
		return comput;
	}
}
