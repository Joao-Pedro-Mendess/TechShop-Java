public class ProdutoFisico extends Produto implements Entregavel  {

    private double pesoKg;
    private String cepEntrega;
    
    public ProdutoFisico(String codigo, String nome, double precoBase, int estoque, double pesoKg, String cepEntrega){
        super(codigo, nome, precoBase, estoque);
        this.pesoKg = pesoKg;
        this.cepEntrega = cepEntrega;
    }

    @Override 

    public double calcularPrecoFinal(){
        return getPrecoBase() * 1.10;
    }

    @Override 
    public double calcularFrete(String cep){
        return 15.0 + (2.0 * pesoKg);
    }
    
    @Override 
    public int prazoEntregaDias(){
        if (cepEntrega != null && cepEntrega.startsWith("6")) {
             return 7;
    }
    return 12;
}

    public double getPesoKg(){
        return pesoKg;
    }
    public void setPesoKg(double pesoKg){
        this.pesoKg = pesoKg;
    }

    
}
