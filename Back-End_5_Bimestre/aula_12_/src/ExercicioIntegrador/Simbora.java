package ExercicioIntegrador;

import org.apache.log4j.Logger;
import org.h2.jdbc.JdbcSQLIntegrityConstraintViolationException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Simbora {

    private static final String sqlCreateTable = "DROP TABLE IF EXISTS Funcionarios; CREATE TABLE Funcionarios "
            + "("
            + " ID INT PRIMARY KEY,"
            + " Nome varchar(100) NOT NULL, "
            + " Sobrenome varchar(100) NOT NULL, "
            + " Idade INT NOT NULL, "
            + " Email varchar(100) NOT NULL "
            + " )";

    private static final String sqlInsert1 = "INSERT INTO Funcionarios (ID, Nome, Sobrenome, Idade, Email)" +
                                             " VALUES (1, 'Cloud', 'Strife', 33, 'cloud@email.com')";

    private static final String sqlInsert2 = "INSERT INTO Funcionarios (ID, Nome, Sobrenome, Idade, Email)" +
                                             " VALUES (2, 'Noele', 'Genshin', 22, 'noele@email.com')";

    private static final String sqlInsert3 = "INSERT INTO Funcionarios (ID, Nome, Sobrenome, Idade, Email) " +
                                             "VALUES (1, 'Ronan', 'Canaban', 19, 'ronan@email.com')";

    private static final String sqlInsert4 = "INSERT INTO Funcionarios (ID, Nome, Sobrenome, Idade, Email) " +
                                             "VALUES (3, 'Elesis', 'Sieghart ', 17, 'elesis@email.com')";

    private static final String sqlInsert5 = "INSERT INTO Funcionarios (ID, Nome, Sobrenome, Idade, Email) " +
                                             "VALUES (4, 'Potato', 'Fries', 20, 'potato@email.com')";


    private static final String sqlDelete1 = "DELETE FROM Funcionarios WHERE Email='potato@email.com'";
    private static final String sqlDelete2 = "DELETE FROM Funcionarios WHERE ID=3";

    private static final String update1 = "UPDATE Funcionarios SET Email='strife@email.com' WHERE ID=1";
    private static final Logger logger = Logger.getLogger(Simbora.class);

    public static void main(String[] args) throws Exception {
        Connection connection = null;
        connection = getConnection();
        Statement statement = connection.createStatement();

        try {
            connection = getConnection();
            statement = connection.createStatement();
            statement.execute(sqlCreateTable);
            logger.info("Tabela criada com sucesso");
            statement.execute(sqlInsert1);
            logger.info("Usuario 1 inserido com sucesso");
            statement.execute(sqlInsert2);
            logger.info("Usuario 2 inserido com sucesso");
            statement.execute(sqlInsert3);
            logger.info("Usuario 3 inserido com sucesso");
            statement.execute(sqlInsert4);
            logger.info("Usuario 4 inserido com sucesso");
            statement.execute(sqlInsert5);
            logger.info("Usuario 5 inserido com sucesso");


        } catch (JdbcSQLIntegrityConstraintViolationException error) {
            logger.error("Chave primaria repetida.");


        } catch (Exception e) {
            logger.info("Ta fazendo dar exceção de proposito meu filho? pq se nao tiver é baum estudar mais xD");
            e.printStackTrace();

        } finally {

            statement.execute(update1);
            logger.debug("Usuario Cloud, Id 1 atualizado com sucesso");

            statement.execute(sqlDelete1);
            logger.info("Usuario Potato deletado com sucesso");
 
            statement.execute(sqlDelete2);
            logger.info("Usuario Elesis deletado com sucesso");

            if (connection != null) {
                connection.close();
            }
        }
    }

    public static Connection getConnection() throws Exception{
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test", "sa","");
    }
}