public class ProdutoDigital extends Produto {
    private int tamanhoMb;

    public ProdutoDigital(String codigo, String nome, double precoBase, int estoque,int tamanhoMb){
        super(codigo,nome,precoBase,estoque);
        this.tamanhoMb = tamanhoMb;
    }

    @Override
    
    public double calcularPrecoFinal(){
        return getPrecoBase() * 0.95;
    }

    public int getTamanhoMb(){
        return tamanhoMb;
    }
    public void setTamnhoMb(int tamanhoMb){
        this.tamanhoMb = tamanhoMb;
    }

    
}
