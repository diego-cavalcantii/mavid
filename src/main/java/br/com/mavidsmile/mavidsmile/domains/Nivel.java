package br.com.mavidsmile.mavidsmile.domains;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Builder
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Nivel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String idNivel;

    @NotBlank
    private String nomeNivel;
    private int pontosNecessarios;

    @OneToOne
    @JoinColumn(name = "idPremio")
    private Premio premio;

}
