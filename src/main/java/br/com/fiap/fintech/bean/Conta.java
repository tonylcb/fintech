package br.com.fiap.fintech.bean;

import java.io.Serializable;
import java.util.Calendar;

public class Conta implements Serializable {

	private static final long serialVersionUID = 1L;
	private int idConta;
	private int idUsuario;
	private String nomeBanco;
	private int numeroAgencia;
	private int numeroConta;
	private float saldo;
	private Calendar dataExtrato;

	public Conta() {
		super();
	}

	public Conta(int idConta, int idUsuario, String nomeBanco, int numeroAgencia, int numeroConta, float saldo,
			Calendar dataExtrato) {
		super();
		this.idConta = idConta;
		this.idUsuario = idUsuario;
		this.nomeBanco = nomeBanco;
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.dataExtrato = dataExtrato;
	}

	public int getIdConta() {
		return idConta;
	}

	public void setIdConta(int idConta) {
		this.idConta = idConta;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNomeBanco() {
		return nomeBanco;
	}

	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}

	public int getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(int numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public Calendar getDataExtrato() {
		return dataExtrato;
	}

	public void setDataExtrato(Calendar dataExtrato) {
		this.dataExtrato = dataExtrato;
	};

}