package com.nelioalves.cursomc.domain;

import javax.persistence.Entity;

import com.nelioalves.cursomc.domain.enuns.EstadoPagamento;

@Entity
public class PagamentoComCartao extends Pagamento {
	private static final long serialVersionUID = 1L; // <- Colocado de maneira diferenciada  nas subclasses.
	private Integer numeroDeParcelas;
	
	public PagamentoComCartao () {
		
	}
	// por se tratar de uma subclasse o contrutor utilizado foi o "generated construtor from superclass" aula 25 11:58

	public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numeroDeParcelas) {
		super(id, estado, pedido);
		
		this.numeroDeParcelas=numeroDeParcelas;
		
	}

	public Integer getNumeroDeParcelas() {
		return numeroDeParcelas;
	}

	public void setNumeroDeParcelas(Integer numeroDeParcelas) {
		this.numeroDeParcelas = numeroDeParcelas;
	}
	
	// SubClasses não precisam de hashcode and equal, posto que eles estão na superclasse Pagamentos.
	
	
	

}
