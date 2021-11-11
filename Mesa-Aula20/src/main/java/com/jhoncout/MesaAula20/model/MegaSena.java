package com.jhoncout.MesaAula20.model;


import java.util.*;

public class MegaSena {

    private String jogo;
    private List<String> numbers;

    public MegaSena(){
        Random random = new Random();
        Set<String> set = new HashSet<>();
        for(int i = 0; i <= 6; i++){
            set.add(String.valueOf(random.nextInt(1,61)));
        }
        numbers = new ArrayList<>(set);
        Collections.sort(numbers);
        this.jogo = String.join(" ", numbers);
    }

    public String getJogo(){
        return jogo;
    }
}
