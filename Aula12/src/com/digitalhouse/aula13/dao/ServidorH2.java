package com.digitalhouse.aula13.dao;

import com.digitalhouse.aula13.config.ConfigJDBC;
import com.digitalhouse.aula13.model.Medicamento;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class ServidorH2 implements IDao<Medicamento>{

    private static final Logger logger = Logger.getLogger(ServidorH2.class);

    private ConfigJDBC config = new ConfigJDBC();

    @Override
    public Medicamento insert(Medicamento medicamento) {
        PropertyConfigurator.configure("log4j.properties");

        String query = String.format("INSERT INTO Medicamento VALUES ('%s','%s','%s','%s','%s','%s')", medicamento.getId(),medicamento.getCodigoNum(),medicamento.getNome(),medicamento.getLaboratorio(),medicamento.getQuantidade(),medicamento.getPreco());

        try {
            Connection connection = config.getConnectionH2();
            Statement stmt = connection.createStatement();
            stmt.execute(query);
            stmt.close();
            logger.info("Dados inseridos com sucesso!");

        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return medicamento;
    }

    @Override
    public void delete(Integer id) {
        String query = String.format("DELETE FROM Medicamento WHERE id=%s", id);
        PropertyConfigurator.configure("log4j.properties");

        try {
            Connection connection = config.getConnectionH2();
            Statement stmt = connection.createStatement();
            stmt.execute(query);
            stmt.close();
            logger.info("Dados deletados com sucesso!");
        }

        catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void select(Integer id){
        PropertyConfigurator.configure("log4j.properties");
        String query = String.format("SELECT * FROM Medicamento WHERE id = %s", id);

        try {
            Connection connection = config.getConnectionH2();
            Statement stmt = connection.createStatement();
            ResultSet result = stmt.executeQuery(query);

            logger.info("Resultado da busca:");

            while (result.next()){
                System.out.printf("""
                        ---------------
                        Id: %s
                        Codigo: %s
                        Nome: %s
                        Laboratorio: %s
                        Quantidade: %s
                        Preco: %s
                        --------------
                        """,result.getInt(1),result.getString(2),result.getString(3),result.getString(4),result.getInt(5),result.getDouble(6));
            }
            stmt.close();

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void selectAll(Integer id) {
        String query = "SELECT * FROM Medicamento";
        PropertyConfigurator.configure("log4j.properties");

        try {
            Connection connection = config.getConnectionH2();
            Statement stmt = connection.createStatement();
            ResultSet result = stmt.executeQuery(query);

            logger.info("Resultado da busca:");

            while (result.next()){
                System.out.printf("""
                        ---------------
                        Id: %s
                        Codigo: %s
                        Nome: %s
                        Laboratorio: %s
                        Quantidade: %s
                        Preco: %s
                        ---------------
                        """,result.getInt(1),result.getString(2),result.getString(3),result.getString(4),result.getInt(5),result.getDouble(6));
            }
            stmt.close();

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void selectCod(String codigo) {

            PropertyConfigurator.configure("log4j.properties");
            String query = String.format("SELECT * FROM Medicamento WHERE CodigoNum = %s", codigo);

            try {
                Connection connection = config.getConnectionH2();
                Statement stmt = connection.createStatement();
                ResultSet result = stmt.executeQuery(query);

                logger.info("Resultado da busca:");

                while (result.next()){
                    System.out.printf("""
                        ---------------
                        Id: %s
                        Codigo: %s
                        Nome: %s
                        Laboratorio: %s
                        Quantidade: %s
                        Preco: %s
                        --------------
                        """,result.getInt(1),result.getString(2),result.getString(3),result.getString(4),result.getInt(5),result.getDouble(6));
                }
                stmt.close();

            }
            catch (Exception e) {
                e.printStackTrace();
            }

    }
}
