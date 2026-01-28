package test;

import exceptions.AluguelException;
import model.Aluguel;
import model.Carro;
import model.Cliente;
import model.TipoVeiculo;
import org.junit.Test;

import javax.management.InvalidAttributeValueException;

import static org.junit.Assert.*;

public class AluguelTest {
    Carro carro = new Carro("AUD-1234", "FORD", 2024, 120, true, TipoVeiculo.CARRO, 1L, 4);
    Cliente cliente = new Cliente(1L, "Henrique", "123.456.789-10");
    Aluguel aluguel = new Aluguel(1L, cliente, carro, 7);

    @Test
    public void aplicandoDescontoNoValorTotal() throws AluguelException, InvalidAttributeValueException {
        carro.alugar();
        aluguel.finalizarAluguel();
        aluguel.aplicarDesconto(10);
        assertEquals(756, aluguel.getValorTotal(), 0);
    }
}
