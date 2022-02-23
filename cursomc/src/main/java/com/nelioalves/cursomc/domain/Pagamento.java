package com.nelioalves.cursomc.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.nelioalves.cursomc.domain.enuns.EstadoPagamento;

@Entity
@Inheritance(strategy = InheritanceType.JOINED) //Mapeamento de superclasse, estratégia de tabela única para paga com cartão  e ´pag com boleto.
//o "abstract" foi acrecentado durante o processo de instanciação aula 27 9:31.
public abstract class Pagamento implements Serializable{   
	private static final long serialVersionUID = 1L; 
	
	//essa entidade precisa ter o mesmo id da entidade Pedidos. 
	
	@Id                      //relacionamento 1 pra 1 . Nessa entidade não entra o generatedvalue.
	private Integer id;
	
	private Integer estado;
	
	//Aula 26. video específico de mapeamento OneToOne.
	@JsonBackReference
	@OneToOne
	@JoinColumn(name="pedido_id")
	@MapsId                   // para garantir que o id do pagmento seja o mesmo id do pedido.
	private Pedido pedido;
	
	public Pagamento() {
		
	}

	public Pagamento(Integer id, EstadoPagamento estado, Pedido pedido) {
		super();
		this.id = id;
		this.estado = estado.getCod();
		this.pedido = pedido;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	//aula 27 16:21
	public EstadoPagamento getEstado() {
		return EstadoPagamento.toEnum(estado);
	}

	public void setEstado(EstadoPagamento estado) {
		this.estado = estado.getCod();
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pagamento other = (Pagamento) obj;
		return Objects.equals(id, other.id);
	}
	
	

}
