package br.com.techint.concessionaria.infrastructure;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.techint.concessionaria.domain.pessoa.Cliente;
import br.com.techint.concessionaria.domain.pessoa.ClienteRepository;

public class JdbcClienteRepository implements ClienteRepository{

private final Connection connection;

    public JdbcClienteRepository(Connection connection) {
    this.connection = connection;
}

    @Override
    public void cadastrarCliente(Cliente cliente) {
        try {

            String sql = "INSERT INTO CLIENTE VALUES (?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, cliente.getNomeCliente());
            ps.setString(2, cliente.getCpf());
            ps.setString(3, cliente.getCidade());
            ps.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Cliente buscarPorCpf(String cpf) {
       try{

        String sql = "SELECT * FROM CLIENTE WHERE CPF = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, cpf);
        ps.execute();
        ResultSet rs = ps.executeQuery();
        boolean teveResultado = rs.next();

        if(!teveResultado){
            throw new RuntimeException(cpf);
        }
        String var_nome = rs.getString("nome");
        String var_cpf = rs.getString("cpf");
        String var_cidade = rs.getString("cidade");

        Cliente cliente = new Cliente (var_nome, cpf, var_cidade );

        return cliente;
        

       } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public List<Cliente> listarTodosClientes() {
       try{ 
            String sql = "SELECT * FROM CLIENTE";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            List<Cliente> clientes = new ArrayList<>();
            while (rs.next()){

                String var_cpf = rs.getString("cpf");
                String var_nome = rs.getString("nome");
                String var_cidade = rs.getString("cidade");

                Cliente cliente = new Cliente (var_nome, var_cpf, var_cidade );

                clientes.add( cliente );

                
            }
             
             return clientes;

       }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
}
