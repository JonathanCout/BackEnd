package com.digitalhouse.aula11wt;

import java.sql.*;

public class Main {

    private static final String sqlCreate = "CREATE TABLE IF NOT EXISTS Figura (Id INT NOT NULL PRIMARY KEY AUTO_INCREMENT, Forma VARCHAR(100) NOT NULL, Cor VARCHAR(100) NOT NULL )";
    private static final String sqlDrop = "DROP TABLE IF EXISTS Figura";
    private static final String sqlInsert = "INSERT INTO Figura (Forma,Cor) VALUES ('Círculo', 'Vermelho'),('Circulo','Azul'),('Quadrado','Verde'),('Quadrado','Vermelho'),('Quadrado','Roxo')";
    private static final String sqlSelectVerm = "SELECT * FROM Figura WHERE Cor='Vermelho'";

    public static void main(String[] args) {
        Connection connection;

        try{
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(sqlDrop);
            statement.execute(sqlCreate);
            statement.execute(sqlInsert);


            showResults(connection);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void showResults(Connection connection) throws SQLException{
        Statement statement = connection.createStatement();
        ResultSet results = statement.executeQuery(sqlSelectVerm);

        while(results.next()){
            System.out.printf("""
                    Id:%s
                    Tipo:%s
                    Cor:%s
                    
                    """,results.getInt(1),results.getString(2),results.getString(3));
        }
    }
    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
    }
}
