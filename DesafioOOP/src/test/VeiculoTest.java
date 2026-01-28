package test;


import exceptions.AluguelException;
import model.Carro;
import model.TipoVeiculo;
import org.junit.Test;

import static org.junit.Assert.*;


public class VeiculoTest {

    Carro carro = new Carro("AUD-1234", "FORD", 2024, 120, true, TipoVeiculo.CARRO, 1L, 4);

    @Test
    public void veiculoNaoAlugadoDisponivel() throws AluguelException {
        assertEquals("Está disponível", carro.disponibilidade());
    }

    @Test
    public void veiculoAlugadoNaoDisponivel() throws AluguelException {
        carro.alugar();
        assertEquals("Não está disponível", carro.disponibilidade());
    }

    @Test(expected = AluguelException.class)
    public void tentativaDeAlugarVeiculoAlugado() throws AluguelException {
        carro.setDisponivel(false);
        carro.alugar();
    }

    @Test
    public void alugandoVeiculo() throws AluguelException {
        carro.alugar();
        assertFalse(carro.isDisponivel());
    }

    @Test
    public void devolvendoVeiculo() throws AluguelException {
        carro.setDisponivel(false);
        carro.devolver();
        assertTrue(carro.isDisponivel());
    }

    @Test(expected = AluguelException.class)
    public void tentandoDevolverSemAlugar() throws AluguelException {
        carro.devolver();
    }

    @Test
    public void calcularValorAluguelTotal() {
        double valorAluguelTotal = carro.calcularValorAluguel(7);
        assertEquals(840, valorAluguelTotal, 1);
    }
}
