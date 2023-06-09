package br.com.fiap.fintech.bean;

import java.io.Serializable;
import java.util.Calendar;

public class Despesas implements Serializable {

	private static final long serialVersionUID = 1L;
	private int idConta;
	private int idDespesa;
	private String descDespesa;
	private Calendar dataDespesa;
	private String descCategoriaDespesa;
	private int numeroValorDespesa;

	public Despesas() {
		super();
	}

	public Despesas(int idConta, int idDespesa, String descDespesa, Calendar dataDespesa, String descCategoriaDespesa,
			int numeroValorDespesa) {
		super();
		this.idConta = idConta;
		this.idDespesa = idDespesa;
		this.descDespesa = descDespesa;
		this.dataDespesa = dataDespesa;
		this.descCategoriaDespesa = descCategoriaDespesa;
		this.numeroValorDespesa = numeroValorDespesa;
	}

	public int getIdConta() {
		return idConta;
	}

	public void setIdConta(int idConta) {
		this.idConta = idConta;
	}

	public int getIdDespesa() {
		return idDespesa;
	}

	public void setIdDespesa(int idDespesa) {
		this.idDespesa = idDespesa;
	}

	public String getDescDespesa() {
		return descDespesa;
	}

	public void setDescDespesa(String descDespesa) {
		this.descDespesa = descDespesa;
	}

	public Calendar getDataDespesa() {
		return dataDespesa;
	}

	public void setDataDespesa(Calendar dataDespesa) {
		this.dataDespesa = dataDespesa;
	}

	public String getDescCategoriaDespesa() {
		return descCategoriaDespesa;
	}

	public void setDescCategoriaDespesa(String descCategoriaDespesa) {
		this.descCategoriaDespesa = descCategoriaDespesa;
	}

	public int getNumeroValorDespesa() {
		return numeroValorDespesa;
	}

	public void setNumeroValorDespesa(int numeroValorDespesa) {
		this.numeroValorDespesa = numeroValorDespesa;
	}

}