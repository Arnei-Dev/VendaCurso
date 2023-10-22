/**
 * 
 */
package br.com.arneidev.domain;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author mdias
 *
 */
@Entity
@Table(name="TB_MATRICULA")
public class Matricula {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "matricula_seq")
	@SequenceGenerator(name = "matricula_seq", sequenceName = "sq_matricula", initialValue = 1, allocationSize = 1)
	private Long id;
	
	@Column(name = "CODIGO", length = 10, nullable = false, unique = true)
	private String condigo;

	@Column(name="DATA_MATRICULA", nullable = false)
	private Instant dataMatricula;
	
	@Column(name="VALOR", nullable = false)
	private Double valor;
	
	@Column(name="STATUS", nullable = false)
	private String status;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCondigo() {
		return condigo;
	}

	public void setCondigo(String condigo) {
		this.condigo = condigo;
	}

	public Instant getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(Instant dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
