package br.com.mavidsmile.mavidsmile.gateways.response;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@JsonPropertyOrder({"nomeCompleto", "email","endereco","nomeNivel","pontos","imgSrc", "premiosRecebidos", })
public class ClienteResponseDTO {
    private String nomeNivel;
    private String nomeCompleto;
    private String email;
    private String endereco;
    private int pontos;
    private String imgSrc;
    private List<PremioClienteResponseDTO> premiosRecebidos;
}
