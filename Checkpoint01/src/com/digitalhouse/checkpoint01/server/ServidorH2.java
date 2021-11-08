package com.digitalhouse.checkpoint01.server;

import com.digitalhouse.checkpoint01.config.ConfigJDBC;
import com.digitalhouse.checkpoint01.model.Dentista;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ServidorH2 implements IDao<Dentista>{

    private ConfigJDBC config = new ConfigJDBC();
    String query;
    private Logger logger = Logger.getLogger(ServidorH2.class);

    public ServidorH2() {
        createTable();
    }

    private void createTable(){
        query = "CREATE TABLE IF NOT EXISTS Dentista (id INT NOT NULL AUTO_INCREMENT, matricula VARCHAR(100) NOT NULL,nome VARCHAR(100) NOT NULL, sobrenome VARCHAR(100) NOT NULL)";
        try {
            Connection connection = config.getConnectionH2();
            Statement stmt = connection.createStatement();
            stmt.execute(query);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    @Override
    public void dropTable() {
        PropertyConfigurator.configure("log4j.properties");
        query = "DROP TABLE IF EXISTS Dentista";
        try {
            Connection connection = config.getConnectionH2();
            Statement stmt = connection.createStatement();
            stmt.execute(query);
            logger.info("Tabela deletada");

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void insert(Dentista dentista) {
        PropertyConfigurator.configure("log4j.properties");
        query = String.format("INSERT INTO Dentista (matricula,nome,sobrenome) VALUES ('%s','%s','%s')", dentista.getMatricula(),dentista.getNome(),dentista.getSobrenome());

        try{
            Connection connection = config.getConnectionH2();
            PreparedStatement stmt = connection.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
            stmt.executeUpdate();
            logger.info("Dados inseridos com sucesso!");

            ResultSet result = stmt.getGeneratedKeys();

            while(result.next()){
                dentista.setId(result.getInt(1));
            }

        }catch (Exception e){
            logger.error("Houve um erro ao inserir os dados");
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Integer id) {
        PropertyConfigurator.configure("log4j.properties");
        query = String.format("DELETE FROM Dentista WHERE id = %s", id);

        try{
            Connection connection = config.getConnectionH2();
            Statement stmt = connection.createStatement();
            stmt.execute(query);
            logger.info("Dados deletados com sucesso");
        }catch (Exception e){
            logger.error("Houve um erro ao deletar os dados");
            e.printStackTrace();
        }
    }

    @Override
    public void select(Integer id) {
        PropertyConfigurator.configure("log4j.properties");
        query = String.format("SELECT * FROM Dentista WHERE id =%s", id);
        try{
            Connection connection = config.getConnectionH2();
            Statement stmt = connection.createStatement();
            ResultSet result = stmt.executeQuery(query);

            logger.info("Resultado da busca...");
            while (result.next()){
                System.out.printf("""
                        id: %s
                        Matricula: %s
                        Nome Completo: %s %s
                        """,result.getInt(1),result.getString(2),result.getString(3),result.getString(4));
            }
        }catch (Exception e){
            logger.error("Houve um erro ao buscar os dados");
            e.printStackTrace();
        }
    }

    @Override
    public void selectAll() {
        PropertyConfigurator.configure("log4j.properties");
        query = "SELECT * FROM Dentista";
        try{
            Connection connection = config.getConnectionH2();
            Statement stmt = connection.createStatement();
            ResultSet result = stmt.executeQuery(query);

            logger.info("Resultado da busca...");
            while (result.next()){
                System.out.printf("""
                        id: %s
                        Matricula: %s
                        Nome Completo: %s %s
                        """,result.getInt(1),result.getString(2),result.getString(3),result.getString(4));
            }

        }catch (Exception e){
            logger.error("Houve um erro ao buscar os dados");
            e.printStackTrace();
        }
    }
}
