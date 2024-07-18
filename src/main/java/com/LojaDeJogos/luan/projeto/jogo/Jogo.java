package com.LojaDeJogos.luan.projeto.jogo;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.Id;

@Table(name = "Jogo")
@Entity(name = "jogos")
// Annotations do lombok que executa as determinadas propriedades da classe em tempo de compilação
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Jogo {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @Enumerated(EnumType.STRING)
    private Genero genero;
    private Double preco;
    private String desenvolvedora;
    private String distribuidora;
    private String lancamento;
}
