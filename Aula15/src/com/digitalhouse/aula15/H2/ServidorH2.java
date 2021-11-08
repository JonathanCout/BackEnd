package com.digitalhouse.aula15.H2;

import com.digitalhouse.aula15.config.ConfigJDBC;
import com.digitalhouse.aula15.model.Endereco;
import com.digitalhouse.aula15.model.Estado;
import com.digitalhouse.aula15.model.Paciente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ServidorH2 implements IDao{


    private ConfigJDBC config = new ConfigJDBC();

    public ServidorH2() {
        createTable();
    }

    private void createTable() {
        String queryEstado = """
                CREATE TABLE IF NOT EXISTS Estado (id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, estado VARCHAR(10) NOT NULL)
                """;
        String queryEndereco = """
                CREATE TABLE IF NOT EXISTS Endereco (id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, logradouro VARCHAR(100) NOT NULL,
                numero VARCHAR(10) NOT NULL, complemento VARCHAR(100), bairro VARCHAR(100) NOT NULL, cidade VARCHAR(100) NOT NULL,
                estado_id INT,
                CONSTRAINT fk_estado FOREIGN KEY (estado_id) REFERENCES Estado(id))
                """;
        String queryPaciente = """
                CREATE TABLE IF NOT EXISTS Paciente (id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, nome VARCHAR(100) NOT NULL,
                sobrenome VARCHAR(100) NOT NULL, rg VARCHAR(100) NOT NULL, dataCadastro DATE DEFAULT CURRENT_TIMESTAMP()
                NOT NULL, endereco_id INT, CONSTRAINT fk_endereco FOREIGN KEY (endereco_id) REFERENCES Endereco(id))
                """;

        try{
            Connection connection = config.getConnectionH2();
            Statement stmt = connection.createStatement();
            stmt.execute(queryEstado);
            stmt.execute(queryEndereco);
            stmt.execute(queryPaciente);
            stmt.close();
        }catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void dropTable(String tabela) {
        String query = String.format("DROP TABLE IF EXISTS %s",tabela);
        try{
            Connection connection = config.getConnectionH2();
            Statement stmt = connection.createStatement();
            stmt.execute(query);
            stmt.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public Object insert(Object o) {
        String query = "";
        Paciente paciente;
        Endereco endereco = null;
        ResultSet result;
        if (o instanceof Paciente){
            paciente = (Paciente) o;

            query = String.format("""
                    INSERT INTO Paciente (nome,sobrenome,rg,dataCadastro,endereco_id) VALUES('%s','%s','%s','%s','%s')
                    """,paciente.getNome(),paciente.getSobrenome(),paciente.getRg(),paciente.getDataCadastro(),paciente.getEndereco().getId());

        }else if (o instanceof Endereco){
            endereco = (Endereco) o;
            query = String.format("""
                INSERT INTO Endereco (logradouro,numero,complemento,bairro,cidade,estado_id) VALUES ('%s','%s','%s','%s','%s','%s')
                """,endereco.getLogradouro(),endereco.getNumero(),endereco.getComplemento(),endereco.getBairro(),endereco.getCidade(),Estado.valueOf(endereco.getEstado().toString()).ordinal()+1);
        }

        try{
            Connection connection = config.getConnectionH2();
            PreparedStatement stmt = connection.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
            stmt.executeUpdate();
            result = stmt.getGeneratedKeys();
            System.out.println("Dados inseridos com sucesso");

            while(result.next()){
                if (endereco != null){
                endereco.setId(result.getInt(1));
                }
            }
            stmt.close();

        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void insertEstado(String estado) {
        String query = String.format("INSERT INTO Estado (estado) VALUES ('%s')", estado);

        try {
           Connection connection = config.getConnectionH2();
           Statement stmt = connection.createStatement();
           stmt.execute(query);
           stmt.close();
        }catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void delete(String tabela,Integer id) {
        String query = String.format("DELETE FROM %s WHERE id = '%s'" , tabela,id);

        try {
            Connection connection = config.getConnectionH2();
            Statement stmt = connection.createStatement();
            stmt.execute(query);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void select(String tabela,Integer id) {
        String query = String.format("SELECT * FROM %s WHERE id= '%s'", tabela,id);
        try {
            Connection connection = config.getConnectionH2();
            Statement stmt = connection.createStatement();
            stmt.execute(query);
        } catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public void selectAll(String tabela) {
        String query = String.format("SELECT * FROM '%s'", tabela);
        try {
            Connection connection = config.getConnectionH2();
            Statement stmt = connection.createStatement();
            stmt.execute(query);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
