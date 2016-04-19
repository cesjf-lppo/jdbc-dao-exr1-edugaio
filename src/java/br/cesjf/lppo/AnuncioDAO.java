package br.cesjf.lppo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eduardo
 */
public class AnuncioDAO {
    List<Anuncio> listarTodos() {
        List<Anuncio> todos = new ArrayList<>();
        try {
            Connection conexao = DriverManager.getConnection("jdbc:derby://localhost:1527/lppo-2016-1", "usuario", "senha");
            Statement operacao = conexao.createStatement();
            ResultSet resultado = operacao.executeQuery("SELECT * FROM anuncio");
            while (resultado.next()) {
                Anuncio anuncio = new Anuncio();
                anuncio.setId(resultado.getLong("id"));
                anuncio.setNome(resultado.getString("nome"));
                anuncio.setDescricao(resultado.getString("descricao"));
                anuncio.setPreco(resultado.getFloat("preco"));
                todos.add(anuncio);
            }

        } catch (SQLException ex) {
            Logger.getLogger(AnuncioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return todos;
    }

    void criar(Anuncio novoAnuncio) {
        try {
            Connection conexao = DriverManager.getConnection("jdbc:derby://localhost:1527/lppo-2016-1", "usuario", "senha");
            Statement operacao = conexao.createStatement();
            operacao.executeUpdate(String.format(Locale.US,"INSERT INTO anuncio(nome, descricao, preco) VALUES('%s','%s',%f)", novoAnuncio.getNome(), novoAnuncio.getDescricao(), novoAnuncio.getPreco()));

        } catch (SQLException ex) {
            Logger.getLogger(AnuncioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
