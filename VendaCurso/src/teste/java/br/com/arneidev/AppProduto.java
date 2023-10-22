package br.com.arneidev;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.arneidev.dao.IProdutoDAO;
import br.com.arneidev.dao.ProdutoDAO;
import br.com.arneidev.domain.Produto;

public class AppProduto {

	private IProdutoDAO prod;
	
	public AppProduto() {
		prod = new ProdutoDAO();
	}
	@Test
	public void cadastrar() {
		Produto produto = new Produto();
		produto.setCodigo("PDT - 01");
		produto.setNome("Notebook");
		produto.setQtd(35);
		prod.cadastrar(produto);
		
		assertNotNull(produto);
		assertNotNull(produto.getId());
	}
}
