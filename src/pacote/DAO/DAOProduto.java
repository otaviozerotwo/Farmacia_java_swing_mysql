package pacote.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import pacote.dominio.Produto;

public class DAOProduto {
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
    
    public boolean inserirProduto(Produto produto){
        conectar();
        String sql = "INSERT INTO PRODUTO("
                + "codigo, "
                + "descricao, "
                + "ean, "
                + "classificacao, "
                + "fabricante, "
                + "registro_ms, "
                + "unidade_medida, "
                + "tipo_receita, "
                + "cor_receita, "
                + "principio_ativo, "
                + "posologia) "
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        
        try{
            comando = con.prepareStatement(sql);
            comando.setString(1, produto.getCodigo());
            comando.setString(2, produto.getDescricao());
            comando.setString(3, produto.getEan());
            comando.setString(4, produto.getClassificacao());
            comando.setString(5, produto.getFabricante());
            comando.setString(6, produto.getRegistroMS());
            comando.setString(7, produto.getUnidadeMedida());
            comando.setString(8, produto.getTipoReceita());
            comando.setString(9, produto.getCorReceita());
            comando.setString(10, produto.getPrincipioAtivo());
            comando.setString(11, produto.getPosologia());
            
            comando.execute();
            
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao inserir registro."+e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE, null);
        }finally{
            fechar();
        }
        
        return false;
    }
    
    public ArrayList<Produto> selecionarTodosRegistros(){
        conectar();
        ResultSet rs;
        String sql = "SELECT * FROM PRODUTO";
        
        ArrayList<Produto> listaProdutos = new ArrayList();
        
        try{
            comando = con.prepareStatement(sql);
            rs = comando.executeQuery();
            
            while(rs.next()){
                Produto produto = new Produto();
                
                produto.setId(rs.getInt("ID"));
                produto.setCodigo(rs.getString("CODIGO"));
                produto.setDescricao(rs.getString("DESCRICAO"));
                produto.setEan(rs.getString("EAN"));
                produto.setClassificacao(rs.getString("CLASSIFICACAO"));
                produto.setFabricante(rs.getString("FABRICANTE"));
                produto.setRegistroMS(rs.getString("REGISTRO_MS"));
                produto.setUnidadeMedida(rs.getString("UNIDADE_MEDIDA"));
                produto.setTipoReceita(rs.getString("TIPO_RECEITA"));
                produto.setCorReceita(rs.getString("COR_RECEITA"));
                produto.setPrincipioAtivo(rs.getString("PRINCIPIO_ATIVO"));
                produto.setPosologia(rs.getString("POSOLOGIA"));
                
                listaProdutos.add(produto);
            }
            
            fechar();
            
            return listaProdutos;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao buscar registro."+e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE, null);
            
            fechar();
            
            return null;
        }
    }
    
    public boolean removerProduto(Integer id){
        conectar();
        String sql = "DELETE FROM PRODUTO WHERE ID=?";
        
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
    
    public boolean alterarProduto(Produto produto){
        conectar();
        String sql = "UPDATE PRODUTO SET "
                + "CODIGO = ?, "
                + "DESCRICAO = ? "
                + "EAN = ?"
                + "CLASSIFICACAO = ?"
                + "FABRICANTE = ?"
                + "REGISTRO_MS = ?"
                + "UNIDADE_MEDIDA = ?"
                + "TIPO_RECEITA = ?"
                + "COR_RECEITA = ?"
                + "PRINCIPIO_ATIVO = ?"
                + "POSOLOGIA = ?"
                + "WHERE ID = ?";
        
        try{
            comando = con.prepareStatement(sql);
            comando.setString(1, produto.getCodigo());
            comando.setString(2, produto.getDescricao());
            comando.setString(3, produto.getEan());
            comando.setString(4, produto.getClassificacao());
            comando.setString(5, produto.getFabricante());
            comando.setString(6, produto.getRegistroMS());
            comando.setString(7, produto.getUnidadeMedida());
            comando.setString(8, produto.getTipoReceita());
            comando.setString(9, produto.getCorReceita());
            comando.setString(10, produto.getPrincipioAtivo());
            comando.setString(11, produto.getPosologia());
            
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
