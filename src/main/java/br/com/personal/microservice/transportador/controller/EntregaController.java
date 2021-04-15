package br.com.personal.microservice.transportador.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.personal.microservice.transportador.controller.dto.EntregaDTO;
import br.com.personal.microservice.transportador.controller.dto.VoucherDTO;
import br.com.personal.microservice.transportador.service.EntregaService;

@RestController
@RequestMapping("/entrega")
public class EntregaController {

	@Autowired
	private EntregaService entregaService;
	
	@RequestMapping(method = RequestMethod.POST)
	public VoucherDTO reservaEntrega(@RequestBody EntregaDTO pedidoDTO){
		return entregaService.reservaEntrega(pedidoDTO);
	}
	
}
