package com.nelioalves.cursomc.domain;

import java.util.Date;

import com.nelioalves.cursomc.domain.enuns.EstadoPagamento;

public class PagamentoComBoleto extends Pagamento{
	
	private Date dataVencimento;
	private Date dataPagemanto;
	
	PagamentoComBoleto(){
		
	}

	// por se tratar de uma subclasse o contrutor utilizado foi o "generated construtor from superclass" aula 25 11:10
	public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido, Date dataVencimento, Date dataPagamento) {
		super(id, estado, pedido);
		
		this.dataPagemanto = dataPagamento;
		this.dataVencimento = dataVencimento;
	}
	

}
