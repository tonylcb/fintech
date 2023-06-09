package br.com.fiap.fintech.bean;

import java.io.Serializable;
import java.util.Calendar;

public class Investimentos implements Serializable {

	private static final long serialVersionUID = 1L;
	private int idConta;
	private int idInvestimento;
	private String descInvestimento;
	private Calendar dataInvestimento;
	private String descCategoriaInvestimento;
	private int numeroValorInvestimento;

	public Investimentos() {
		super();
	}

	public Investimentos(int idConta, int idInvestimento, String descInvestimento, Calendar dataInvestimento,
			String descCategoriaInvestimento, int numeroValorInvestimento) {
		super();
		this.idConta = idConta;
		this.idInvestimento = idInvestimento;
		this.descInvestimento = descInvestimento;
		this.dataInvestimento = dataInvestimento;
		this.descCategoriaInvestimento = descCategoriaInvestimento;
		this.numeroValorInvestimento = numeroValorInvestimento;
	}

	public int getIdConta() {
		return idConta;
	}

	public void setIdConta(int idConta) {
		this.idConta = idConta;
	}

	public int getIdInvestimento() {
		return idInvestimento;
	}

	public void setIdInvestimento(int idInvestimento) {
		this.idInvestimento = idInvestimento;
	}

	public String getDescInvestimento() {
		return descInvestimento;
	}

	public void setDescInvestimento(String descInvestimento) {
		this.descInvestimento = descInvestimento;
	}

	public Calendar getDataInvestimento() {
		return dataInvestimento;
	}

	public void setDataInvestimento(Calendar dataInvestimento) {
		this.dataInvestimento = dataInvestimento;
	}

	public String getDescCategoriaInvestimento() {
		return descCategoriaInvestimento;
	}

	public void setDescCategoriaInvestimento(String descCategoriaInvestimento) {
		this.descCategoriaInvestimento = descCategoriaInvestimento;
	}

	public int getNumeroValorInvestimento() {
		return numeroValorInvestimento;
	}

	public void setNumeroValorInvestimento(int numeroValorInvestimento) {
		this.numeroValorInvestimento = numeroValorInvestimento;
	}
}