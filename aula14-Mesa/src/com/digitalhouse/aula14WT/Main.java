package com.digitalhouse.aula14WT;

import com.digitalhouse.aula14WT.model.Contato;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Contato jonathan = new Contato("Jonathan", "jhon@gmail.com", "985416547");
        Contato malu = new Contato("Maria Luiza", "malu@gmail.com", "985421324");
        Contato rafa = new Contato("Rafaela", "rafa@gmail.com", "978451123");

        List<Contato> agenda = new ArrayList<>(Arrays.asList(jonathan, malu, rafa));

        //Criando arquivo Agenda
        FileOutputStream fileOut;
        try {
            fileOut = new FileOutputStream("Agenda.txt");
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(agenda);
        }catch (FileNotFoundException e){
            System.out.println("Erro no arquivo");
        }catch (Exception e){
            e.printStackTrace();
        }

        //Lendo arquivo criado
        FileInputStream fileIn;
        List<Contato> agenda2 = null;

        try {
            fileIn = new FileInputStream("Agenda.txt");
            ObjectInputStream objIn = new ObjectInputStream(fileIn);
            agenda2 = (ArrayList) objIn.readObject();

        } catch (FileNotFoundException e){
            System.out.println("Arquivo não encontrado");
        } catch (Exception e){
            e.printStackTrace();
        }

        for(Contato contato: agenda2){
            System.out.printf("""
                    
                    Nome: %s
                    Telefone: %s
                    E-mail: %s  
                    """, contato.getNome(),contato.getTelefone(),contato.getEmail());
        }
    }
}
