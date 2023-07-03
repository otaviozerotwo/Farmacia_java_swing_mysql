/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package pacote.dominio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lies
 */
public class ClienteManutencaoTest {
    private Cliente cliente;
    
    public ClienteManutencaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        cliente = new Cliente();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetSetCpf() {
        String cpf = "118.775.556-73";
        cliente.setCpf(cpf);
        assertEquals(cpf, cliente.getCpf());
    }
    
    @Test
    public void testGetSetNome() {
        String nome = "Otávio";
        cliente.setNome(nome);
        assertEquals(nome, cliente.getNome());
    }

    @Test
    public void testGetSetCep(){
        String cep = "38.742-032";
        cliente.setCep(cep);
        assertEquals(cep, cliente.getCep());
    }
    
    @Test
    public void testGetSetEndereco(){
        String endereco = "Rua Doutor Silvestre Moreira";
        cliente.setEndereco(endereco);
        assertEquals(endereco, cliente.getEndereco());
    }
    
    @Test
    public void testGetSetNumero(){
        String numero = "1738";
        cliente.setNumero(numero);
        assertEquals(numero, cliente.getNumero());
    }
    
    @Test
    public void testGetSetCidade(){
        String endereco = "Patrocínio";
        cliente.setEndereco(endereco);
        assertEquals(endereco, cliente.getEndereco());
    }
    
    @Test
    public void testGetSetBairro(){
        String bairro = "São Francisco";
        cliente.setBairro(bairro);
        assertEquals(bairro, cliente.getBairro());
    }
    
    @Test
    public void testGetSetEstado(){
        String estado = "MINAS GERAIS";
        cliente.setEstado(estado);
        assertEquals(estado, cliente.getEstado());
    }
    
    @Test
    public void testGetSetTelefone(){
        String telefone = "(34)99816-7305";
        cliente.setTelefone(telefone);
        assertEquals(telefone, cliente.getTelefone());
    }
    
    @Test
    public void testGetSetEmail(){
        String email = "otavio.zerotwo@gmail.com";
        cliente.setEmail(email);
        assertEquals(email, cliente.getEmail());
    }

    @Test
    public void testGetSetSexo() {
        String sexo = "Masculino";
        cliente.setSexo(sexo);
        assertEquals(sexo, cliente.getSexo());
    }
}
