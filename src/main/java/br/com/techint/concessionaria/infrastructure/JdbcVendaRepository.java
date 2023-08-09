package br.com.techint.concessionaria.infrastructure;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.techint.concessionaria.domain.carro.Carro;
import br.com.techint.concessionaria.domain.pessoa.Cliente;
import br.com.techint.concessionaria.domain.pessoa.Vendedor;
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
    
}
