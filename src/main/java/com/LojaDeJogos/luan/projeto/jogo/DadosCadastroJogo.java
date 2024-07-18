package com.LojaDeJogos.luan.projeto.jogo;

import java.util.Objects;

public record DadosCadastroJogo (String nome,
                                 Genero genero,
                                 Double preco,
                                 String desenvolvedora,
                                 String distribuidora,
                                 String lancamento){

}
