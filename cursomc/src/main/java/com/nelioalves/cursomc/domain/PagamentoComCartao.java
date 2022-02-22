package com.nelioalves.cursomc.domain;

import com.nelioalves.cursomc.domain.enuns.EstadoPagamento;

public class PagamentoComCartao extends Pagamento {
	
	private Integer numeroDeParcelas;
	
	public PagamentoComCartao () {
		
	}
	// por se tratar de uma subclasse o contrutor utilizado foi o "generated construtor from superclass" aula 25 11:58

	public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numeroDeParcelas) {
		super(id, estado, pedido);
		
		this.numeroDeParcelas=numeroDeParcelas;
		
	}
	
	
	
	

}
