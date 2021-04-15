package br.com.personal.microservice.transportador.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.personal.microservice.transportador.controller.dto.EntregaDTO;

@Entity
public class Entrega {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Long pedidoId;
	
	private LocalDate dataParaBusca;
	
	private LocalDate previsaoParaEntrega;
	
	private String enderecoOrigem;
	
	private String enderecoDestino;

	public Entrega(LocalDate dataParaEntrega, String enderecoDestino, String enderecoOrigem, Long pedidoId,
			LocalDate previsaoParaEntrega) {
		this.dataParaBusca = dataParaEntrega;
		this.enderecoDestino = enderecoDestino;
		this.enderecoOrigem = enderecoOrigem;
		this.pedidoId = pedidoId;
		this.previsaoParaEntrega = previsaoParaEntrega;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPedidoId() {
		return pedidoId;
	}

	public void setPedidoId(Long pedidoId) {
		this.pedidoId = pedidoId;
	}

	public LocalDate getDataParaBusca() {
		return dataParaBusca;
	}

	public void setDataParaBusca(LocalDate dataParaBusca) {
		this.dataParaBusca = dataParaBusca;
	}

	public LocalDate getPrevisaoParaEntrega() {
		return previsaoParaEntrega;
	}

	public void setPrevisaoParaEntrega(LocalDate previsaoParaEntrega) {
		this.previsaoParaEntrega = previsaoParaEntrega;
	}

	public String getEnderecoOrigem() {
		return enderecoOrigem;
	}

	public void setEnderecoOrigem(String enderecoOrigem) {
		this.enderecoOrigem = enderecoOrigem;
	}

	public String getEnderecoDestino() {
		return enderecoDestino;
	}

	public void setEnderecoDestino(String enderecoDestino) {
		this.enderecoDestino = enderecoDestino;
	}

	public static Entrega receberPedido(EntregaDTO pedidoDTO) {
		return new Entrega(pedidoDTO.getDataParaEntrega(),pedidoDTO.getEnderecoDestino(),pedidoDTO.getEnderecoOrigem(),
				pedidoDTO.getPedidoId(),pedidoDTO.getDataParaEntrega().plusDays(1l));
	}
}
