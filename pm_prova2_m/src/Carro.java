package pm_prova2_m.src;

public class Carro extends Veiculo{
    public Carro(String placa, String modelo, int anoFabricacao, double valorDiaria, double quilometragem, StatusVeiculo status) {
        super(placa, modelo, anoFabricacao, valorDiaria, quilometragem, status);
    }

    @Override
    public void exibirDetalhes() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'exibirDetalhes'");
    }

    @Override
    public boolean possuiSeguroEspecial() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'possuiSeguroEspecial'");
    }
};
