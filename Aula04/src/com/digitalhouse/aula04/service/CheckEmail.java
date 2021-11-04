package com.digitalhouse.aula04.service;

import com.digitalhouse.aula04.model.Mail;

public abstract class CheckEmail {

    protected CheckEmail proximoDestinatario;

    public CheckEmail setProximoDestinatario(CheckEmail proximoDestinatario) {
        this.proximoDestinatario = proximoDestinatario;
        return this;
    }

    public abstract void processaEmail (Mail mail, String dest);
}
