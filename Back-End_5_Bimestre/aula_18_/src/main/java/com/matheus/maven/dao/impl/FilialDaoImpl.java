package com.matheus.maven.dao.impl;

import com.matheus.maven.dao.ConfiguracaoJDBC;
import com.matheus.maven.dao.IDao;
import com.matheus.maven.model.Filial;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class FilialDaoImpl implements IDao<Filial> {
    private ConfiguracaoJDBC configuracaoJDBC;
    final static Logger log = Logger.getLogger(FilialDaoImpl.class);

    public FilialDaoImpl(ConfiguracaoJDBC configuracaoJDBC) {
        this.configuracaoJDBC = configuracaoJDBC;
    }

    @Override
    public Filial salvar(Filial filial) {
        log.debug("Salvando filial: " + filial.toString());

        Connection connection = configuracaoJDBC.conectarBD();
        Statement statement = null;
        String query = String.format("INSERT INTO filial(nome,rua,numero,cidade,estado,eCincoEstrelas) " +
                        "VALUES('%s','%s','%s','%s','%s','%s')",
                filial.getNome(),filial.getRua(),filial.getNumero(),filial.getCidade(),filial.getEstado(),filial.iseCincoEstrelas());

        try {
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet = statement.getGeneratedKeys();
            if (resultSet.next())
                filial.setId(resultSet.getInt(1));

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return filial;
    }
}
