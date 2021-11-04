package com.digitalhouse.aula04.service.impl;

import com.digitalhouse.aula04.model.Mail;
import com.digitalhouse.aula04.service.CheckEmail;

public class Gerente extends CheckEmail {

    @Override
    public void processaEmail(Mail mail, String dest) {

        if(dest.equals("gerente")){
            System.out.println("Email da gerência e chegou ao seu destinatário");
        } else {
            this.proximoDestinatario.processaEmail(mail,dest);
        }
    }
}
