package com.digitalhouse.aula04.service.impl;

import com.digitalhouse.aula04.model.Mail;
import com.digitalhouse.aula04.service.CheckEmail;

public class Tecnico extends CheckEmail {
    @Override
    public void processaEmail(Mail mail, String dest) {
        String[] arrayMail = mail.getDestino().split("@");

        if(dest.equals("tecnico") && arrayMail[1].equals("colmeia.com")){
            System.out.println("Esse email é da área Técnica e chegou no seu destinatário");
        } else {
            System.out.println("Esse email não pertence a ninguém e será marcado como SPAM");
        }
    }
}
