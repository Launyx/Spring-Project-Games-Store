package com.LojaDeJogos.luan.projeto.controllers;

import com.LojaDeJogos.luan.projeto.jogo.DadosCadastroJogo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/jogos")
public class JogoController {

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroJogo dados){
        System.out.println(dados);
    }

}
