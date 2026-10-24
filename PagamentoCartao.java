public class PagamentoCartao implements Pagamento {
    
    private int parcelas;
    private double limite;
    
    public PagamentoCartao(int parcelas,double limite){
        this.parcelas = parcelas;
        this.limite = limite;
    }
    @Override
public double calcularValorFinal(double valor) {
    double valorFinal = valor;

    if (parcelas > 3) {
        valorFinal = valor * 1.08;
    }

    if (valorFinal > limite) {
        throw new PagamentoRecusadoException("Pagamento recusado: limite excedido.");
    }

    return valorFinal;
}

    @Override 
    public String getDescricao(){
        return "cartão";
    }

    public int getParcelas(){
        return parcelas;
    }
    public void setParcelas(int parcelas){
        this.parcelas = parcelas;
    }

    public double getLimite(){
        return limite;
    }
    public void setLimite(double limite){
        this.limite = limite;
    }
    
}

