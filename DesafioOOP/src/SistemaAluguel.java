import exceptions.AluguelException;
import model.*;

import java.util.ArrayList;
import java.util.List;

public class SistemaAluguel {
    public static void main(String[] args) throws AluguelException {
        Carro carro = new Carro("AUD-1234", "FORD", 2024, 120.34, true,
                TipoVeiculo.CARRO, 1L, 4);
        Carro carro2 = new Carro("GFD-8645", "FORD", 2021, 130.34, false,
                TipoVeiculo.CARRO, 2L, 4);

        Moto moto = new Moto("EIF-1264", "YAMAHA", 2026, 200.55, true,
                TipoVeiculo.MOTO, 1L, 32);
        Moto moto2 = new Moto("JGS-3451", "YAMAHA", 2022, 160.55, false,
                TipoVeiculo.MOTO, 2L, 22);

        Cliente cliente = new Cliente(1L, "Henrique", "123.456.789-10");
        Cliente cliente2 = new Cliente(2L, "Ferreira", "109.876.543-21");

        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(carro);
        veiculos.add(carro2);
        veiculos.add(moto);
        veiculos.add(moto2);

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente);
        clientes.add(cliente2);

        for (Veiculo v : veiculos) {
            System.out.println(v.getTipoVeiculo() + " " + v.getModelo() + " está " + v.disponibilidade());
        }

        carro.alugar();


        Aluguel aluguel = new Aluguel();
        aluguel.setId(1L);
        aluguel.setCliente(cliente);
        aluguel.setVeiculo(carro);
        aluguel.setDias(7);

        aluguel.finalizarAluguel();

        List<Aluguel> alugueisFinalizados = new ArrayList<>();
        alugueisFinalizados.add(aluguel);

        System.out.println("Valor total :" + aluguel.getValorTotal());

        for (Aluguel a : alugueisFinalizados) {
            System.out.println(a.getCliente().getNome() + " alugou um(a) " + a.getVeiculo().getTipoVeiculo() +
                    " " + a.getVeiculo().getModelo());
        }
    }
}