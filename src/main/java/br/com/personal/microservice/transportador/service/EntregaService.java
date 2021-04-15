package br.com.personal.microservice.transportador.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.personal.microservice.transportador.controller.dto.EntregaDTO;
import br.com.personal.microservice.transportador.controller.dto.VoucherDTO;
import br.com.personal.microservice.transportador.model.Entrega;
import br.com.personal.microservice.transportador.repository.EntregaRepository;

@Service
public class EntregaService {

	@Autowired
	private EntregaRepository entregaRepository;
	
	public VoucherDTO reservaEntrega(EntregaDTO pedidoDTO) {
		Entrega entrega = Entrega.receberPedido(pedidoDTO);
		entregaRepository.save(entrega);
		return VoucherDTO.converterEntregar(entrega);
	}

}
