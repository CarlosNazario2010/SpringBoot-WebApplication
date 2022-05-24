package br.com.carlosnazario.mvc.mudi.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.carlosnazario.mvc.mudi.model.Pedido;
import br.com.carlosnazario.mvc.mudi.model.StatusPedido;
import br.com.carlosnazario.mvc.mudi.repository.PedidoRepository;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoRest {
	
	@Autowired
	PedidoRepository pedidoRepository;
	
	@GetMapping("/aguardando")
	public List<Pedido> getPedidosAguardandoOferta() {
		Sort sort = Sort.by("id").descending();
		PageRequest paginacao = PageRequest.of(0, 10, sort);
		
		return pedidoRepository.findByStatus(StatusPedido.AGUARDANDO, paginacao);
	}
}
