package pacote.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import pacote.dominio.Cliente;

public class DAOCliente {
    private Connection con;
    private PreparedStatement comando;
    
    private void conectar(){
        con = FabricaConexao.conexao();
    }
    
    private void fechar(){
        try{
            comando.close();
            con.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao fechar conexão" + e.getMessage());
        }
    }
    
    public boolean inserirCliente(Cliente cliente){
        conectar();
        String sql = "INSERT INTO CLIENTE("
                + "cpf, "
                + "nome, "
                + "cep, "
                + "endereco, "
                + "numero, "
                + "cidade, "
                + "bairro, "
                + "estado, "
                + "telefone, "
                + "email, "
                + "data_nascimento, "
                + "sexo) "
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
        
        try{
            comando = con.prepareStatement(sql);
            comando.setString(1, cliente.getCpf());
            comando.setString(2, cliente.getNome());
            comando.setString(3, cliente.getCep());
            comando.setString(4, cliente.getEndereco());
            comando.setString(5, cliente.getNumero());
            comando.setString(6, cliente.getCidade());
            comando.setString(7, cliente.getBairro());
            comando.setString(8, cliente.getEstado());
            comando.setString(9, cliente.getTelefone());
            comando.setString(10, cliente.getEmail());
            comando.setString(11, cliente.getDataNascimento());
            comando.setString(12, cliente.getSexo());
            
            comando.execute();
            
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao inserir registro." + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE, null);
        }finally{
            fechar();
        }
        
        return false;
    }
    
    public ArrayList<Cliente> selecionarTodosRegistros(){
        conectar();
        
        ResultSet rs;
        String sql = "SELECT * FROM CLIENTE";
        
        ArrayList<Cliente> listaClientes = new ArrayList();
        
        try{
            comando = con.prepareStatement(sql);
            rs = comando.executeQuery();
            
            while(rs.next()){
                Cliente cliente = new Cliente();
                
                cliente.setId(rs.getInt("ID"));
                cliente.setCpf(rs.getString("CPF"));
                cliente.setNome(rs.getString("NOME"));
                cliente.setCep(rs.getString("CEP"));
                cliente.setEndereco(rs.getString("ENDERECO"));
                cliente.setNumero(rs.getString("NUMERO"));
                cliente.setCidade(rs.getString("CIDADE"));
                cliente.setBairro(rs.getString("BAIRRO"));
                cliente.setEstado(rs.getString("ESTADO"));
                cliente.setTelefone(rs.getString("TELEFONE"));
                cliente.setEmail(rs.getString("EMAIL"));
                cliente.setDataNascimento(rs.getString("DATA_NASCIMENTO"));
                cliente.setSexo(rs.getString("SEXO"));
                
                listaClientes.add(cliente);
            }
            
            fechar();
            
            return listaClientes;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao excluir registro."+e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE, null);
            fechar();
            
            return null;
        } 
    }
    
    public boolean removerCliente(Integer id){
        conectar();
        String sql = "DELETE FROM CLIENTE WHERE ID=?";
        
        try{
            comando = con.prepareStatement(sql);
            comando.setInt(1, id);
            comando.executeUpdate();
            
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao excluir registro."+e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE, null);
        }finally{
            fechar();
        }
        
        return false;
    }
    
    public boolean alterarCliente(Cliente cliente){
        conectar();
        String sql = "UPDATE CLIENTE SET "
                + "CPF = ?, "
                + "NOME = ? "
                + "CEP = ?"
                + "ENDERECO = ?"
                + "NUMERO = ?"
                + "CIDADE = ?"
                + "BAIRRO = ?"
                + "ESTADO = ?"
                + "TELEFONE = ?"
                + "EMAIL = ?"
                + "DATA_NASCIMENTO = ?"
                + "SEXO = ?"
                + "WHERE ID = ?";
        
        try{
            comando = con.prepareStatement(sql);
            comando.setString(1, cliente.getCpf());
            comando.setString(2, cliente.getNome());
            comando.setString(3, cliente.getCep());
            comando.setString(4, cliente.getEndereco());
            comando.setString(5, cliente.getNumero());
            comando.setString(6, cliente.getCidade());
            comando.setString(7, cliente.getBairro());
            comando.setString(8, cliente.getEstado());
            comando.setString(9, cliente.getTelefone());
            comando.setString(10, cliente.getEmail());
            comando.setString(11, cliente.getDataNascimento());
            comando.setString(12, cliente.getSexo());
            comando.setInt(13, cliente.getId());
            comando.executeUpdate();
            
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao atualizar registro."+e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE, null);
        }finally{
            fechar();
        }
        
        return false;
    }
}
