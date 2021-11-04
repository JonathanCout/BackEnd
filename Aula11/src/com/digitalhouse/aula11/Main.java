package com.digitalhouse.aula11;

import java.sql.*;

public class Main {

    private static final String sqlCreate = "CREATE TABLE IF NOT EXISTS Animal (Id INT PRIMARY KEY, Nome VARCHAR(100) NOT NULL, Tipo VARCHAR(120) NOT NULL)";
    private static final String sqlDrop = "DROP TABLE IF EXISTS Animal";

    private static final String sqlInsert = "INSERT INTO Animal (Id, Nome, Tipo) VALUES (1, 'Eevee', 'Cachorro')";
    private static final String sqlInsert2 = "INSERT INTO Animal (Id, Nome, Tipo) VALUES (2, 'Piplup', 'Pokemon')";
    private static final String sqlInsert3 = "INSERT INTO Animal (Id, Nome, Tipo) VALUES (3, 'Nezuko', 'Demon')";
    private static final String sqlInsert4 = "INSERT INTO Animal (Id, Nome, Tipo) VALUES (4, 'Ori', 'Light')";
    private static final String sqlInsert5 = "INSERT INTO Animal (Id, Nome, Tipo) VALUES (5, 'Knight', 'Ghost')";

    private static final String sqlDelete = "DELETE FROM Animal WHERE Id = 1 ";

    private static final String sqlSelectAll = "SELECT * FROM Animal";

    public static void main(String[] args){

        Connection connection = null;

        try{
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(sqlDrop);
            statement.execute(sqlCreate);

            statement.execute(sqlInsert);
            statement.execute(sqlInsert2);
            statement.execute(sqlInsert3);
            statement.execute(sqlInsert4);
            statement.execute(sqlInsert5);
            statement.execute(sqlSelectAll);

            statement.execute(sqlDelete);

            statement.execute(sqlSelectAll);

            showAnimals(connection);

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    private static void showAnimals(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet results = statement.executeQuery(sqlSelectAll);

        while(results.next()){
            System.out.printf("""
                             Id: %s
                             Nome: %s
                             Tipo: %s
                             
                             """,results.getInt(1),results.getString(2),results.getString(3));
        }

    }
    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
    }
}
