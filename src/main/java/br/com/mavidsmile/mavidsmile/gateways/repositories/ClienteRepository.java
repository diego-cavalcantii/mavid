package br.com.mavidsmile.mavidsmile.gateways.repositories;

import br.com.mavidsmile.mavidsmile.domains.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente, String> {

    List<Cliente> findAllByOrderByProgressoPontosDesc();



}
