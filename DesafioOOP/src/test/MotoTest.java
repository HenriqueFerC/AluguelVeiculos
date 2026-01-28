package test;

import model.Moto;
import model.TipoVeiculo;
import org.junit.Test;

import static org.junit.Assert.*;


public class MotoTest {

    Moto moto = new Moto("EIF-1264", "YAMAHA", 2026, 200, true, TipoVeiculo.MOTO, 1L, 32);

    @Test
    public void valorAluguelParaMoto() {
        double valorAluguelTotal = moto.calcularValorAluguel(5);
        assertEquals(900, valorAluguelTotal, 0);
    }

}
