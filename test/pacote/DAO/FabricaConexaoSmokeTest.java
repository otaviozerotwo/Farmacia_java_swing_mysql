package pacote.DAO;

import static org.junit.Assert.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FabricaConexaoSmokeTest {
    private Connection conexao;

    @Before
    public void setUp() {
        conexao = FabricaConexao.conexao();
    }

    @After
    public void tearDown() {
        // Limpeza após cada teste, fechando a conexão
        if (conexao != null) {
            try {
                conexao.close();
            } catch (SQLException ex) {
                fail("Erro ao fechar a conexão: " + ex.getMessage());
            }
        }
    }

    @Test
    public void testConexaoNotNull() {
        assertNotNull(conexao);
    }

    @Test
    public void testConexaoIsOpen() {
        try {
            assertFalse(conexao.isClosed());
        } catch (SQLException ex) {
            fail("Erro ao verificar o status da conexão: " + ex.getMessage());
        }
    }

    @Test
    public void testConsultaSimples() {
        try {
            Statement stmt = conexao.createStatement();

            ResultSet resultSet = stmt.executeQuery("SELECT 1");

            assertTrue(resultSet.next());
            assertEquals(1, resultSet.getInt(1));
        } catch (SQLException ex) {
            fail("Erro ao executar a consulta: " + ex.getMessage());
        }
    }
}
