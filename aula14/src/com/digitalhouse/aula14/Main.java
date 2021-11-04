package com.digitalhouse.aula14;

import com.digitalhouse.aula14.model.Cachorro;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Cachorro> cachorros = new ArrayList<>();

        Cachorro dog1 = new Cachorro("Dog", 15);
        Cachorro dog2 = new Cachorro("Rex", 5);
        Cachorro dog3 = new Cachorro("Thor", 7);

        cachorros.add(dog1);
        cachorros.add(dog2);
        cachorros.add(dog3);

        FileOutputStream fileout;

        try{
            fileout = new FileOutputStream("ListaCachorros.txt");
            ObjectOutputStream objOut = new ObjectOutputStream(fileout);

            objOut.writeObject(cachorros);
        } catch (FileNotFoundException e){
            System.out.println("Erro no arquivo");
        } catch (Exception e){
            e.printStackTrace();
        }

        List<Cachorro> cachorros2 = null;
        FileInputStream fileInput;
        try {
            fileInput = new FileInputStream("ListaCachorros.txt");
            ObjectInputStream objIn = new ObjectInputStream(fileInput);

            cachorros2 = (ArrayList) objIn.readObject();
        }catch (FileNotFoundException e){
            System.out.println("Erro no arquivo");
        }catch (Exception e){
            e.printStackTrace();
        }


        for(Cachorro dog:cachorros2){
            System.out.printf("""
                    
                    Nome: %s
                    Idade: %s anos
                    
                    """,dog.getNome(),dog.getIdade());
        }
    }
}
