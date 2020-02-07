package br.com.tabajaradigital.test;

import br.com.tabajaradigital.telefonia.PlanoPosPago;

public abstract class CadastroPlanoPos extends PlanoPosPago {
	
	
	public CadastroPlanoPos(int codigoPlano, String descricaoPlano, double valorPlano, double franquiaMinuto,
			double minutoAdicional) {
		super(codigoPlano, descricaoPlano, valorPlano, franquiaMinuto, minutoAdicional);
	}

	public void DefinirPlano() {
	if (this.getCodigoPlano() == 1) {
		this.setDescricaoPlano("Tabajara 100 Plus");
	} else if (this.getCodigoPlano() == 2) {
		this.setDescricaoPlano("Tabajara Controle Redes Sociais");
	}else {
		this.setDescricaoPlano("Plano não existente");
	}	
	}
	
	public void DefinirFranquia() {
	if (this.getCodigoPlano() == 1) {
		this.setFranquiaMinuto(100.0);
	} else if (this.getCodigoPlano() == 2){
		this.setFranquiaMinuto(150.0);
	}
	}
	
	public void DefinirValor() {
	if (this.getCodigoPlano() == 1) {
		this.setValorPlano(120.0);
	} else if (this.getCodigoPlano() == 2) {
		this.setValorPlano(65.0);	
	} 
	}

	public void DefinirAdicional() {
	if (this.getMinutoAdicional() > 0) {
		this.setMinutoAdicional(minutoAdicional*0.08);
	} else {
		this.setMinutoAdicional(0);
	}
	

	
	
}}
