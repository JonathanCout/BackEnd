package com.digitalhouse.checkpoint01;

import com.digitalhouse.checkpoint01.model.Dentista;
import com.digitalhouse.checkpoint01.server.ServidorH2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DentistaTest {
        ServidorH2 server = new ServidorH2();

        @BeforeEach
        void doBefore(){
            Dentista jorge = new Dentista("123456789", "Jorge", "Martins");
            Dentista marcia = new Dentista("789456132","Marcia","Menezes");
            Dentista natalia = new Dentista("514795413", "Natália", "Queiroz");
            server.insert(jorge);
            server.insert(marcia);
            server.insert(natalia);
        }
        @Test
        void selectAll(){
            server.selectAll();
        }
}

