package br.com.mavidsmile.mavidsmile.usecases.interfaces;

import br.com.mavidsmile.mavidsmile.domains.Cliente;
import br.com.mavidsmile.mavidsmile.gateways.response.PremioClienteResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ExibiListaPremios {

    List<PremioClienteResponseDTO> executa(Cliente cliente);
}
