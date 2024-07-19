package com.LojaDeJogos.luan.projeto.controllers;

import com.LojaDeJogos.luan.projeto.jogo.DadosCadastroJogo;
import com.LojaDeJogos.luan.projeto.jogo.Jogo;
import com.LojaDeJogos.luan.projeto.jogo.JogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jogos")
public class JogoController {

    @Autowired
    private JogoRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroJogo dados){
        repository.save(new Jogo(dados));
    }

}
