package com.nelioalves.cursomc.domain;

import java.util.Date;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.nelioalves.cursomc.domain.enuns.EstadoPagamento;

@Entity
public class PagamentoComBoleto extends Pagamento{
	private static final long serialVersionUID = 1L; // <- Colocado de maneira diferenciada  nas subclasses.
	
	@JsonFormat(pattern="dd/MM/yyyy HH:mm")
	private Date dataVencimento;
	
	@JsonFormat(pattern="dd/MM/yyyy HH:mm")
	private Date dataPagemanto;
	
	PagamentoComBoleto(){
		
	}

	// por se tratar de uma subclasse o contrutor utilizado foi o "generated construtor from superclass" aula 25 11:10
	public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido, Date dataVencimento, Date dataPagamento) {
		super(id, estado, pedido);
		
		this.dataPagemanto = dataPagamento;
		this.dataVencimento = dataVencimento;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Date getDataPagemanto() {
		return dataPagemanto;
	}

	public void setDataPagemanto(Date dataPagemanto) {
		this.dataPagemanto = dataPagemanto;
	}
	
	// SubClasses não precisam de hashcode and equal, posto que eles estão na superclasse Pagamentos.
	

}
