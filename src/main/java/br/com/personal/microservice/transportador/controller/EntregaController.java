package br.com.personal.microservice.transportador.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.personal.microservice.transportador.controller.dto.EntregaDTO;
import br.com.personal.microservice.transportador.controller.dto.VoucherDTO;

@RestController
@RequestMapping("/entrega")
public class EntregaController {

	@RequestMapping(method = RequestMethod.POST)
	public VoucherDTO reservaEntrega(EntregaDTO pedidoDTO){
		return entregaService.reservaEntrega(pedidoDTO);
	}
	
}
