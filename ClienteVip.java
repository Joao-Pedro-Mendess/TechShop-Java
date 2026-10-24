public class ClienteVip extends Cliente {
    private double percentualDesconto;
    
    public ClienteVip(String nome, String cpf, String email, String endereco, int pontosFidelidade,double percentualDesconto){
        super(nome, cpf, email, endereco, pontosFidelidade);
        this.percentualDesconto = percentualDesconto;
    }

    public double getPercentualDesconto(){
        return percentualDesconto;
    }
    public void setPercentualDesconto(double percentualDesconto){
        this.percentualDesconto = percentualDesconto; 
    }

    @Override 

    public String toString(){
        return super.toString() + " | vip: (" + (int) (percentualDesconto * 100)+ "%)" ;
    }

    
}
