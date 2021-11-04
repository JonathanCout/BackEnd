package com.digitalhouse.aula04.service.impl;

import com.digitalhouse.aula04.model.Mail;
import com.digitalhouse.aula04.service.CheckEmail;

public class Comercial extends CheckEmail {

    @Override
    public void processaEmail(Mail mail, String dest) {

        if(dest.equals("comercial")){
            System.out.println("Esse email é do Comercial e chegou ao seu destinatário");
        } else {
            this.proximoDestinatario.processaEmail(mail,dest);
        }
    }
}
