/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MoneyControlDao {

    private Connection conecta;
    private PreparedStatement st;
    private ResultSet resultado;

    // CONECTAR AO BD
    public boolean conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conecta = DriverManager.getConnection("jdbc:mysql://localhost:3306/moneycontrol", "root", "12345");
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            return false;
        }
    }
    
    //INSERT INTO BD
    public int cadastrar(MoneyControl user) {
        try {
            st = conecta.prepareStatement("INSERT INTO usuarios VALUES(?,?,?,?,?,?, default)");
            st.setString(1, user.getNome());
            st.setString(2, user.getSobrenome());
            st.setString(3, user.getEmail());
            st.setString(4, user.getDataNasc());
            st.setString(5, user.getCpf());
            st.setString(6, user.getFazerSenha());
            return st.executeUpdate();
        } catch (SQLException ex) {
            if (ex.getErrorCode() == 1062) {
                return 1062;
            } else {
                return 0;
            }
        }
    }
    
    public MoneyControl consultar(String email, String senha) {
        MoneyControl user;
        try {
            st = conecta.prepareStatement("SELECT * FROM usuarios WHERE email=? AND senha=?");
            st.setString(1, email);
            st.setString(2, senha);
            resultado = st.executeQuery();//Executa o SELECT criado acima
            if (resultado.next()) { // Se encontrou a matrícula
                user = new MoneyControl();
                user.setNome(resultado.getString("nome"));
                user.setSobrenome(resultado.getString("sobrenome"));
                user.setEmail(resultado.getString("email"));
                user.setDataNasc(resultado.getString("dataNasc"));
                user.setCpf(resultado.getString("cpf"));
                user.setId(resultado.getInt("id_usuario"));
                user.setSenha(resultado.getString("senha"));//FIX THS IF NECESSARY
                return user;
            } else { // Se não encontrou a matrícula
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }
    
    public int alterar(MoneyControl user, int id) {
        try {
            st = conecta.prepareStatement("UPDATE usuarios SET nome = ?, sobrenome = ?, email = ?, dataNasc = ?, cpf = ? WHERE id_usuario = ?");
            st.setString(1, user.getNome());
            st.setString(2, user.getSobrenome());
            st.setString(3, user.getEmail());
            st.setString(4, user.getDataNasc());
            st.setString(5, user.getCpf());
            st.setInt(6, id);
            return st.executeUpdate();
        } catch (SQLException ex) {
            return 0;
        }
        
    }
    //ENTRADA DE VALORES
    public double addEntrada(MoneyControl entrada, int id) {
        try {
            st = conecta.prepareStatement("INSERT INTO entrada VALUES(?,?,?,?, default)");
            st.setDouble(1, entrada.getValorEntrada());
            st.setString(2, entrada.getCategoriaEntrada());
            st.setString(3, entrada.getDataEntrada());
            st.setInt(4, id);
            return st.executeUpdate();
        } catch (SQLException ex) {
                return 0;
        }
        
    }
    
    public double addSaida(MoneyControl saida, int id) {
        try {
            st = conecta.prepareStatement("INSERT INTO saida VALUES(?,?,?,?, default)");
            st.setDouble(1, saida.getValorEntrada());
            st.setString(2, saida.getCategoriaEntrada());
            st.setString(3, saida.getDataEntrada());
            st.setInt(4, id);
            return st.executeUpdate();
        } catch (SQLException ex) {
                return 0;
        }     
    }
    
    public double sumEntrada(int id) {
        try {
            double sum = 0;
            st = conecta.prepareStatement("SELECT SUM(valor_entrada) FROM entrada WHERE fk_id_usuario=?");
            st.setDouble(1, id);
            resultado = st.executeQuery();
            
            while(resultado.next()) {
                sum = sum + resultado.getDouble(1);
            }
            return sum;
        } catch (SQLException ex) {
            return -1;
        }
    }
    
    public double sumSaida(int id) {
        try {
            double sum = 0;
            st = conecta.prepareStatement("SELECT SUM(valor_saida) FROM saida WHERE fk_id_usuario=?");
            st.setDouble(1, id);
            resultado = st.executeQuery();
            
            while(resultado.next()) {
                sum = sum + resultado.getDouble(1);
            }
            return sum;
        } catch (SQLException ex) {
            return -1;
        }
    }
    
    public double saldo(int id) {
        double result = sumEntrada(id) - sumSaida(id);
        return result;
    }
    
    public boolean excluirEntrada(int id) {
        try {
            st = conecta.prepareStatement("DELETE FROM entrada WHERE fk_id_usuario = ?");
            st.setInt(1, id);
            st.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
    
    public boolean excluirSaida(int id) {
        try {
            st = conecta.prepareStatement("DELETE FROM saida WHERE fk_id_usuario = ?");
            st.setInt(1, id);
            st.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
    
    public boolean excluirConta(int id) {
        try {
            excluirEntrada(id);
            excluirSaida(id);
            st = conecta.prepareStatement("DELETE FROM usuarios WHERE id_usuario = ?");
            st.setInt(1, id);
            st.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
}
