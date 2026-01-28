package model;

import exceptions.AluguelException;

import javax.management.InvalidAttributeValueException;

public class Aluguel {

    private Long id;

    private Cliente cliente;

    private Veiculo veiculo;

    private int dias;

    private double valorTotal;


    public void finalizarAluguel() throws AluguelException {
        if (veiculo.disponivel) {
            throw new AluguelException("Primeiro precisa alugar um veículo!");
        }
        valorTotal = veiculo.calcularValorAluguel(dias);
        veiculo.devolver();
    }

    public double aplicarDesconto(double valor) throws InvalidAttributeValueException {
        if (valor <= 0 || valor >= 100) {
            throw new InvalidAttributeValueException("Valor precisa ser maior do que 0 e menor do que 100!");
        }
        double desconto = valorTotal * valor / 100;
        valorTotal -= desconto;
        return desconto;

    }

    public Aluguel() {
    }

    public Aluguel(Long id, Cliente cliente, Veiculo veiculo, int dias) {
        this.id = id;
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.dias = dias;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
