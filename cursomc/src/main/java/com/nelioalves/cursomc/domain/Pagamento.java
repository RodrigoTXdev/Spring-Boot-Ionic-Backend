package com.nelioalves.cursomc.domain;

import javax.persistence.ManyToOne;

import com.nelioalves.cursomc.domain.enuns.EstadoPagamento;

public class Pagamento {
	
	private Integer id;
	
	private EstadoPagamento estado;
	
	@ManyToOne
	private Pedido pedido;
	
	public Pagamento() {
		
	}

	public Pagamento(Integer id, EstadoPagamento estado, Pedido pedido) {
		super();
		this.id = id;
		this.estado = estado;
		this.pedido = pedido;
	}
	

}
