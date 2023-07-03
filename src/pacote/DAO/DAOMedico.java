package pacote.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import pacote.dominio.Medico;

public class DAOMedico {
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
            JOptionPane.showMessageDialog(null, "Erro ao fechar conexão"+e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE, null);
        }
    }
    
    public boolean inserirMedico(Medico medico){
        conectar();
        String sql = "INSERT INTO MEDICO("
                + "cnpj_cpf, "
                + "nome, "
                + "tipo_pessoa, "
                + "tipo_documento, "
                + "uf, "
                + "num_documento, "
                + "cidade, "
                + "cep, "
                + "especialidade, "
                + "endereco, "
                + "bairro, "
                + "telefone, "
                + "email) "
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try{
            comando = con.prepareStatement(sql);
            comando.setString(1, medico.getCnpjCpf());
            comando.setString(2, medico.getNome());
            comando.setString(3, medico.getTipoPessoa());
            comando.setString(4, medico.getTipoDocumento());
            comando.setString(5, medico.getUf());
            comando.setString(6, medico.getNumDocumento());
            comando.setString(7, medico.getCidade());
            comando.setString(8, medico.getCep());
            comando.setString(9, medico.getEspecialidade());
            comando.setString(10, medico.getEndereco());
            comando.setString(11, medico.getBairro());
            comando.setString(12, medico.getTelefone());
            comando.setString(13, medico.getEmail());
            
            comando.execute();
            
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao inserir registro."+e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE, null);
        }finally{
            fechar();
        }
        
        return false;
    }
    
    public ArrayList<Medico> selecionarTodosRegistros(){
        conectar();
        ResultSet rs;
        String sql = "SELECT * FROM MEDICO";
        
        ArrayList<Medico> listaMedicos = new ArrayList();
        
        try{
            comando = con.prepareStatement(sql);
            rs = comando.executeQuery();
            
            while(rs.next()){
                Medico medico = new Medico();
                
                medico.setId(rs.getInt("ID"));
                medico.setCnpjCpf(rs.getString("CNPJ_CPF"));
                medico.setNome(rs.getString("NOME"));
                medico.setTipoPessoa(rs.getString("TIPO_PESSOA"));
                medico.setTipoDocumento(rs.getString("TIPO_DOCUMENTO"));
                medico.setUf(rs.getString("UF"));
                medico.setNumDocumento(rs.getString("NUM_DOCUMENTO"));
                medico.setCidade(rs.getString("CIDADE"));
                medico.setCep(rs.getString("CEP"));
                medico.setEspecialidade(rs.getString("ESPECIALIDADE"));
                medico.setEndereco(rs.getString("ENDERECO"));
                medico.setBairro(rs.getString("BAIRRO"));
                medico.setTelefone(rs.getString("TELEFONE"));
                medico.setEmail(rs.getString("EMAIL"));
                
                listaMedicos.add(medico);
            }
            
            fechar();
            
            return listaMedicos;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao buscar registro."+e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE, null);
            
            fechar();
            
            return null;
        }
    }
    
    public boolean removerMedico(Integer id){
        conectar();
        String sql = "DELETE FROM MEDICO WHERE ID=?";
        
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
    
    public boolean alterarMedico(Medico medico){
        conectar();
        String sql = "UPDATE MEDICO SET "
                + "CNPJ_CPF = ?, "
                + "NOME = ?, "
                + "TIPO_PESSOA = ?,"
                + "TIPO_DOCUMENTO = ?,"
                + "UF = ?,"
                + "NUM_DOCUMENTO = ?,"
                + "CIDADE = ?,"
                + "CEP = ?,"
                + "ESPECIALIDADE = ?,"
                + "ENDERECO = ?,"
                + "BAIRRO = ?,"
                + "TELEFONE = ?,"
                + "EMAIL = ?"
                + "WHERE ID = ?";
        
        try{
            comando = con.prepareStatement(sql);
            comando.setString(1, medico.getCnpjCpf());
            comando.setString(2, medico.getNome());
            comando.setString(3, medico.getTipoPessoa());
            comando.setString(4, medico.getTipoDocumento());
            comando.setString(5, medico.getUf());
            comando.setString(6, medico.getNumDocumento());
            comando.setString(7, medico.getCidade());
            comando.setString(8, medico.getCep());
            comando.setString(9, medico.getEspecialidade());
            comando.setString(10, medico.getEndereco());
            comando.setString(11, medico.getBairro());
            comando.setString(12, medico.getTelefone());
            comando.setString(13, medico.getEmail());
            comando.setInt(14, medico.getId());
            
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
