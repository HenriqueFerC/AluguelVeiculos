package model;

import exceptions.AluguelException;

public class Moto extends Veiculo {

    private Long id;

    private int cilindradas;

    public Moto(String placa, String modelo, int ano, double valorDiaria, boolean disponivel, TipoVeiculo tipoVeiculo, Long id, int cilindradas) {
        super(placa, modelo, ano, valorDiaria, disponivel, tipoVeiculo);
        this.id = id;
        this.cilindradas = cilindradas;
    }

    @Override
    public double calcularValorAluguel(int dias) {
        return super.calcularValorAluguel(dias) * 0.9;
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

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
}
