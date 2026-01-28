package model;

import exceptions.AluguelException;

public class Carro extends Veiculo {

    private Long id;

    private int portas;

    public Carro(String placa, String modelo, int ano, double valorDiaria, boolean disponivel, TipoVeiculo tipoVeiculo, Long id, int portas) {
        super(placa, modelo, ano, valorDiaria, disponivel, tipoVeiculo);
        this.id = id;
        this.portas = portas;
    }

    @Override
    public double calcularValorAluguel(int dias) {
        return super.calcularValorAluguel(dias);
    }

    @Override
    public void alugar() throws AluguelException {
        super.alugar();
    }

    @Override
    public void devolver() throws AluguelException {
        super.devolver();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }


}
