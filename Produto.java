public abstract class  Produto {
    // atributos
    private String codigo;
    private String nome;
    private double precoBase;
    private int estoque;
    // construtor
    public Produto(String codigo, String nome, double precoBase, int estoque){

         if (precoBase < 0) {
            throw new IllegalArgumentException("O preço base não pode ser negativo.");
    }
        this.codigo = codigo;
        this.nome = nome;
        this.precoBase = precoBase;
        this.estoque = estoque;
    }
    // gett e sett do atributo codigo
    public String getCodigo(){
        return codigo;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    // gett e sett do atributo nome
    public String getNome(){
        return nome;
    } 
    public void setNome(String nome){
        this.nome = nome;
    }
    // gett e sett do atributo precoBase
    public double getPrecoBase(){
        return precoBase;
    }
    public void setPrecoBase(double precoBase){
        this.precoBase = precoBase;
    }
    // gett e sett do atributo estoque
    public int getEstoque(){
        return estoque;
    }
    public void setEstoque(int estoque){
        this.estoque = estoque;
    }
    // metodo calcularPrecoFinal
    public abstract double calcularPrecoFinal();
    // metodo exibirResumo
    public String exibirResumo(){
        return codigo + " - " + nome + ": R$ " + calcularPrecoFinal();
    }
    // metodo baixarEstoque 
    public void baixarEstoque(int quantidade){
        if(quantidade > 0 && quantidade <= estoque){
            estoque -= quantidade;
        }
    }
    
}
