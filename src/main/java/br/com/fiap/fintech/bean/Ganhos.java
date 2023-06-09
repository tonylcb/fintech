package br.com.fiap.fintech.bean;

import java.io.Serializable;
import java.util.Calendar;

public class Ganhos implements Serializable {

	private static final long serialVersionUID = 1L;
	private int idConta;
	private int idGanhos;
	private String descGanhos;
	private Calendar dataRecebimento;
	private int numeroValor;
	private String descCategoria;

	public Ganhos() {
		super();
	}

	public Ganhos(int idConta, int idGanhos, String descGanhos, Calendar dataRecebimento, int numeroValor,
			String descCategoria) {
		super();
		this.idConta = idConta;
		this.idGanhos = idGanhos;
		this.descGanhos = descGanhos;
		this.dataRecebimento = dataRecebimento;
		this.numeroValor = numeroValor;
		this.descCategoria = descCategoria;
	}

	public int getIdConta() {
		return idConta;
	}

	public void setIdConta(int idConta) {
		this.idConta = idConta;
	}

	public int getIdGanhos() {
		return idGanhos;
	}

	public void setIdGanhos(int idGanhos) {
		this.idGanhos = idGanhos;
	}

	public String getDescGanhos() {
		return descGanhos;
	}

	public void setDescGanhos(String descGanhos) {
		this.descGanhos = descGanhos;
	}

	public Calendar getDataRecebimento() {
		return dataRecebimento;
	}

	public void setDataRecebimento(Calendar dataRecebimento) {
		this.dataRecebimento = dataRecebimento;
	}

	public int getNumeroValor() {
		return numeroValor;
	}

	public void setNumeroValor(int numeroValor) {
		this.numeroValor = numeroValor;
	}

	public String getDescCategoria() {
		return descCategoria;
	}

	public void setDescCategoria(String descCategoria) {
		this.descCategoria = descCategoria;
	}

}