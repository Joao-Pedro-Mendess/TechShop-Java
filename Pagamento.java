public interface Pagamento {
    double calcularValorFinal(double valor);
    String getDescricao();
    default void exibirComprovante(double valor) {
        double valorFinal = calcularValorFinal(valor);

        System.out.println("Pago via " + getDescricao()
                + ": R$ " + valorFinal);
    }
}
