package clinicaodontologica.dao.impl;

import clinicaodontologica.dao.ConfiguracaoJDBC;
import clinicaodontologica.dao.IDao;
import clinicaodontologica.model.Paciente;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class PacienteDaoImpl implements IDao<Paciente> {
private ConfiguracaoJDBC configuracaoJDBC;
final static Logger log = Logger.getLogger(PacienteDaoImpl.class);

public PacienteDaoImpl(ConfiguracaoJDBC configuracaoJDBC) {
        this.configuracaoJDBC = configuracaoJDBC;
        }

@Override
public Paciente salvar(Paciente paciente) { //claramente preciso mesclar elas para serem aceitas
        log.debug("Salvando paciente: " + paciente.toString());

        Connection connection = configuracaoJDBC.conectarBD();
        Statement statement = null;
        Statement statement2 = null;
        String query = String.format("INSERT INTO paciente(nome,sobrenome,rg,dataDeCadastro,endereco) VALUES('%s','%s','%s','%s','%s')",
                paciente.getNome(),paciente.getSobrenome(),paciente.getRg(),paciente.getdataDeCadastro(),paciente.getEndereco());
        String query2 = String.format("INSERT INTO endereco(rua,numero,cidade,bairro) VALUES('%s','%s','%s','%s')",
                paciente.getEndereco().getRua(),paciente.getEndereco().getNumero(),paciente.getEndereco().getCidade(),paciente.getEndereco().getBairro());

        try {
        statement = connection.createStatement();
        statement2 = connection.createStatement();

        statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
        statement2.executeUpdate(query2, Statement.RETURN_GENERATED_KEYS);

        ResultSet resultSet = statement.getGeneratedKeys();
        ResultSet resultSet2 = statement2.getGeneratedKeys();

        if (resultSet.next())
            paciente.setId(resultSet.getInt(1));

        if (resultSet2.next())
            paciente.getEndereco().setId(resultSet2.getInt(1));

        connection.close();
        } catch (Exception e) {
        e.printStackTrace();
        }
        return paciente;
        }
        }