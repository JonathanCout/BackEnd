package com.digitalhouse.aula04;

import com.digitalhouse.aula04.model.Mail;
import com.digitalhouse.aula04.service.CheckEmail;
import com.digitalhouse.aula04.service.impl.Comercial;
import com.digitalhouse.aula04.service.impl.Gerente;
import com.digitalhouse.aula04.service.impl.Tecnico;

public class Main {

    public static void main(String[] args) {

        Mail mail = new Mail("jonathan@gmail.com","tecnico@colmeia.com","Bla");

        CheckEmail checkEmail;

        String[] emailValidado = mail.getDestino().split("@");
        if(emailValidado[1].equals("colmeia.com")){
            checkEmail = new Gerente().setProximoDestinatario(new Comercial().setProximoDestinatario(new Tecnico()));
        } else {
            checkEmail = new Tecnico();
        }

        checkEmail.processaEmail(mail,emailValidado[0]);


    }
}
