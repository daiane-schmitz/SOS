package br.com.tabajaradigital.test;

public class Fatura implements Interface{

	int codigoPlano;
	String descricaoPlano;
	double valorPlano;
	double franquiaMinuto;
	double minutoAdicional;
	int codigoOperadora;
	String nomeOperadora;
	double valorAdicional;
	
	@Override
	public String DefinirPlano() {
		return descricaoPlano;
	}
	@Override
	public String DefinirOperadora() {
		return nomeOperadora;
	}
	@Override
	public double DefinirFranquia() {
		return franquiaMinuto;
	}
	@Override
	public double DefinirValor() {
		return valorPlano;
	}
	@Override
	public double DefinirAdicional() {
		if(minutoAdicional > 0) {
		this.valorAdicional = (this.minutoAdicional*0.08);
		}
		return valorAdicional;
	}
	


	
	

	
}