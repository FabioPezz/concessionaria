package br.com.techint.concessionaria.infrastructure;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.techint.concessionaria.domain.carro.Carro;
import br.com.techint.concessionaria.domain.pessoa.Cliente;
import br.com.techint.concessionaria.domain.pessoa.Vendedor;
import br.com.techint.concessionaria.domain.venda.Venda;
import br.com.techint.concessionaria.domain.venda.VendaRepository;

public class JdbcVendaRepository implements VendaRepository {

    private final Connection connection;

    public JdbcVendaRepository(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void CadastrarVenda(Carro carro, Cliente cliente, Vendedor vendedor) {
        try {
            String sql = "INSERT INTO VENDA VALUES (?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setLong(1,carro.getId());
            ps.setLong(2,cliente.getId());
            ps.setLong(3, vendedor.getId());
            
            ps.execute();
            
        } catch (SQLException e) {
            throw new RuntimeException(e);       }
    }

    @Override
    public List<Venda> ApresentarVendasPorCliente(Cliente cliente) {
        try{
            String sql = "SELECT * FROM VENDAS WHERE CLIENTE = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setLong(1,cliente.getId());
            ps.execute();
            ResultSet rs = ps.executeQuery();

            List<Venda> vendas = new ArrayList<>();

            while (rs.next()){
            Long var_vendedor = rs.getLong("id_vendedor");
            Long var_cliente = rs.getLong("id_cliente");
            Long var_carro = rs.getLong("id_carro");

            Venda venda = new Venda(var_vendedor, var_cliente, var_carro);
            
            vendas.add(venda);
            }

            return vendas;
        }catch (SQLException e) {
            throw new RuntimeException(e);       }
    }

    @Override
    public List<Venda> ApresentarVendasPorVendedor(Vendedor vendedor) {
        try{
            String sql = "SELECT * FROM VENDAS WHERE CLIENTE = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setLong(1,vendedor.getId());
            ps.execute();
            ResultSet rs = ps.executeQuery();

            List<Venda> vendas = new ArrayList<>();

            while (rs.next()){
            Long var_vendedor = rs.getLong("id_vendedor");
            Long var_cliente = rs.getLong("id_cliente");
            Long var_carro = rs.getLong("id_carro");

            Venda venda = new Venda(var_vendedor, var_cliente, var_carro);
            
            vendas.add(venda);
            }

            return vendas;
        }catch (SQLException e) {
            throw new RuntimeException(e);       }
    }
    
}
