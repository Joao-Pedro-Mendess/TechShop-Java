
public class Pedido {

    private Cliente cliente;
    private CarrinhoDeCompras carrinho;

    public Pedido(Cliente cliente, CarrinhoDeCompras carrinho) {
        this.cliente = cliente;
        this.carrinho = carrinho;
    }

    public void finalizar(Pagamento pagamento) {
        try {
            // 1. Calcular o subtotal dos produtos e do frete
            double subtotal = carrinho.calcularTotal()
                    + carrinho.calcularFreteTotal(cliente.getEndereco());

            // 2. Aplicar o desconto se o cliente for VIP
            if (cliente instanceof ClienteVip) {
                ClienteVip vip = (ClienteVip) cliente;

                subtotal = subtotal
                        * (1 - vip.getPercentualDesconto());
            }

            // 3. Calcular o valor final conforme o pagamento
            double valorFinal = pagamento.calcularValorFinal(subtotal);

            // Exibir o comprovante
            pagamento.exibirComprovante(valorFinal);

            // 4. Adicionar pontos de fidelidade
            int pontos = (int) (valorFinal / 10);
            cliente.adicionarPontos(pontos);

            System.out.println("Pontos adicionados: " + pontos);

        } catch (PagamentoRecusadoException e) {
            System.out.println("Pagamento recusado");
        } finally {
            System.out.println("Pedido encerrado");
        }
    }
}
