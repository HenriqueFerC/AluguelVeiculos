package model;

import exceptions.AluguelException;

public abstract class Veiculo {

    protected String placa;

    protected String modelo;

    protected int ano;

    protected double valorDiaria;

    protected boolean disponivel;

    protected TipoVeiculo tipoVeiculo;

    public double calcularValorAluguel(int dias) {
        return dias * valorDiaria;
    }

    public void alugar() throws AluguelException {
        if (!disponivel) {
            throw new AluguelException("Aluguel do veículo indisponível!");
        }
        disponivel = false;
    }

    public void devolver() throws AluguelException {
        if (disponivel) {
            throw new AluguelException("Primeiro precisa alugar um veículo!");
        }
        disponivel = true;
    }

    public String disponibilidade() {
        if (!isDisponivel()) {
            return "Não está disponível";
        }
        return "Está disponível";
    }

    public Veiculo(String placa, String modelo, int ano, double valorDiaria, boolean disponivel, TipoVeiculo tipoVeiculo) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.valorDiaria = valorDiaria;
        this.disponivel = disponivel;
        this.tipoVeiculo = tipoVeiculo;
    }


    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }
}
