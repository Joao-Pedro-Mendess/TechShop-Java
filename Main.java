
public class Main {

    public static void main(String[] args) {

        // 1. Criar um cliente VIP
        ClienteVip clienteVip = new ClienteVip("João","12345678900","joao@email.com","Rua Central, CEP 60000000",0,0.10);

        // 2. Criar um produto físico
        ProdutoFisico fisico = new ProdutoFisico(
            "F001",
            "Teclado",
            100.00,
            10,
            0.8,
            "60000000"
        );

        // 3. Criar um produto digital
        ProdutoDigital digital = new ProdutoDigital(
            "D001",
            "Curso Java",
            80.00,
            10,
            500
        );

        // 4. Criar uma assinatura
        Assinatura assinatura = new Assinatura(
            "A001",
            "Plano Premium",
            50.00,
            10,
            30
        );

        // 5. Criar o carrinho e adicionar os produtos
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionar(fisico);
        carrinho.adicionar(digital);
        carrinho.adicionar(assinatura);

        // 6. Primeira tentativa: pagamento com Pix
        System.out.println("=== COMPRA COM PIX ===");

        Pedido pedidoPix = new Pedido(clienteVip, carrinho);
        pedidoPix.finalizar(new PagamentoPix());

        // 7. Segunda tentativa: cartão em 6 parcelas e limite baixo
        System.out.println("\n=== COMPRA COM CARTÃO ===");

        Pedido pedidoCartao = new Pedido(clienteVip, carrinho);
        pedidoCartao.finalizar(new PagamentoCartao(6, 10.00));
    }
}
