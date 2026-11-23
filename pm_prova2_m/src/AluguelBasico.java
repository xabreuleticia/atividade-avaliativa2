package pm_prova2_m.src;

public class AluguelBasico extends Aluguel{
    public AluguelBasico(String nomeCliente, int quantidadeDias, double valorTotal, StatusAluguel status) {
        super(nomeCliente, quantidadeDias, valorTotal, status);
    }

    @Override
    public void exibirDetalhes() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'exibirDetalhes'");
    }

    @Override
    public boolean possuiSeguroIncluso() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'possuiSeguroIncluso'");
    }
};

