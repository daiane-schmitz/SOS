package br.com.tabajaradigital.test;

import br.com.tabajaradigital.negocio.Operadora;

public abstract class CadastroOperadora extends Operadora {


	public void DefinirOperadora() {

	if (this.getCodigoOperadora() == 1) {
		this.setNomeOperadora("Operadora Tabajara");
	} else {
		this.setNomeOperadora("Operadora não cadastrada");
	}
}
}