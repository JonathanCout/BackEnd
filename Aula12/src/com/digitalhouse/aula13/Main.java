package com.digitalhouse.aula13;
import com.digitalhouse.aula13.dao.ServidorH2;
import com.digitalhouse.aula13.model.Medicamento;

public class Main {

        public static void main(String[] args) {

        ServidorH2 servidor = new ServidorH2();
        Medicamento dorflex = new Medicamento(1, "654321", "Dorflex", "Einel", 2, 15.70);

        servidor.insert(dorflex);
        servidor.select(dorflex.getId());

    }
}
