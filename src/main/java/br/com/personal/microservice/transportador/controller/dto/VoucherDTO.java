package br.com.personal.microservice.transportador.controller.dto;

import java.time.LocalDate;

import br.com.personal.microservice.transportador.model.Entrega;

public class VoucherDTO {
	
	private Long numero;
	
	private LocalDate previsaoParaEntrega;

	public VoucherDTO(Long id, LocalDate previsaoParaEntrega) {
		this.numero = id;
		this.previsaoParaEntrega = previsaoParaEntrega;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public LocalDate getPrevisaoParaEntrega() {
		return previsaoParaEntrega;
	}

	public void setPrevisaoParaEntrega(LocalDate previsaoParaEntrega) {
		this.previsaoParaEntrega = previsaoParaEntrega;
	}

	public static VoucherDTO converterEntregar(Entrega entrega) {
		return new VoucherDTO(entrega.getId(), entrega.getPrevisaoParaEntrega());
	}

}
