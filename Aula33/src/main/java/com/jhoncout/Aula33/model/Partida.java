package com.jhoncout.Aula33.model;

import com.jhoncout.Aula33.enums.Status;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
@Getter @Setter
public class Partida {

    @Id
    private String id;
    private Status status;
    private String resultado;
    @Field(name = "time_local")
    private Time timeLocal;
    @Field(name = "time_visitante")
    private Time timeVisitante;

}
