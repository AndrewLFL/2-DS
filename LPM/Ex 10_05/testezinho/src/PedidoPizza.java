public class PedidoPizza {
    private int numeroPedido;
    private String cliente;
    private String celular;
    private String endereco;
    private String motoboy;
    private double valorPedido;
    private short tipoPagamento;

    public PedidoPizza(int numeroDoPedido){
        setNumeroPedido(numeroDoPedido);
    }

    /*
     * Métodos acessores e modificadores
     */
    public void setNumeroPedido(int numeroPedido){
        this.numeroPedido = numeroPedido;
    }

    public int getNumeroPedido(){
        return numeroPedido;
    }

    public void setCliente(String cliente){
        this.cliente = cliente;
    }

    public String getCliente(){
        return cliente;
    }

    public void setCelular(String celular){
        this.celular = celular;
    }

    public String getCelular(){
        return celular;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setMotoboy(String motoboy){
        this.motoboy = motoboy;
    }

    public String getMotoboy(){
        return motoboy;
    }

    public void setValorPedido(double valorPedido){
        this.valorPedido = valorPedido;
    }

    public double getValorPedido(){
        return valorPedido;
    }

    public void setTipoPagamento(short tipoPagamento){
        this.tipoPagamento = tipoPagamento;
    }

    public short getTipoPagamento(){
        return tipoPagamento;
    }
}