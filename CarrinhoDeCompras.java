import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Produto> itens = new ArrayList<>();

    public void adicionar(Produto p){
        itens.add(p);
    }

    public void adicionar(Produto p, int quantidade)
        throws EstoqueInsuficienteException{
            
            if(quantidade > p.getEstoque()){
                throw  new EstoqueInsuficienteException (p.getNome(), p.getEstoque());
            }

            for(int i = 0; i < quantidade; i++ ){
                itens.add(p);
            }
        }

    
     public double calcularTotal() {
        double total = 0;

        for (Produto p : itens) {
            total += p.calcularPrecoFinal();
        }

        return total;
    }

    public double calcularFreteTotal(String cep) {
        double totalFrete = 0;

        for (Produto p : itens) {
            if (p instanceof Entregavel) {
                Entregavel entregavel = (Entregavel) p;
                totalFrete += entregavel.calcularFrete(cep);
            }
        }

        return totalFrete;

    

    }

}
