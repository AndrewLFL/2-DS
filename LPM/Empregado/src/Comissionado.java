public class Comissionado extends Empregado {

    private double totalVendas;
    private double taxaComissao;



    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }

    @Override
    public void vencimento() {
        super.Vencimento();
    }
}
