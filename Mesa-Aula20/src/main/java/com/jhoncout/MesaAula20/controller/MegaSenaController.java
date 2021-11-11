package com.jhoncout.MesaAula20.controller;


import com.jhoncout.MesaAula20.model.MegaSena;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MegaSenaController {

    @GetMapping("jogo")
    public String criarJogo(){
        return new MegaSena().getJogo();
    }

    @GetMapping("jogos/{id}")
    public Map<Integer,String> criarJogos(@PathVariable Integer id){
        Map<Integer,String> jogos = new HashMap<>();
        for(int i=1;i<=id;i++){
            jogos.put(i, new MegaSena().getJogo());
        }
        return jogos;
    }
}
