package com.estoque_bebidas.apirest.models;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name="TB_BEBIDA")
public class Bebida implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idBebida;
	
	private String nomeBebida;
	
	@OneToOne(cascade=CascadeType.ALL)
	private HistoricoEntradaSaida historicoEntradaSaida;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private SecaoBebida secao;

	public long getIdBebida() {
		return idBebida;
	}

	public void setIdBebida(long idBebida) {
		this.idBebida = idBebida;
	}

	public String getNomeBebida() {
		return nomeBebida;
	}

	public void setNomeBebida(String nomeBebida) {
		this.nomeBebida = nomeBebida;
	}

	public HistoricoEntradaSaida getHistoricoEntradaSaida() {
		return historicoEntradaSaida;
	}

	public void setHistoricoEntradaSaida(HistoricoEntradaSaida historicoEntradaSaida) {
		this.historicoEntradaSaida = historicoEntradaSaida;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}	
}