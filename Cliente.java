public class Cliente extends Pessoa {
    //Atributos da sub classe Cliente
    private String endereco;
    private int pontosFidelidade;
    // construtor
    public Cliente(String nome, String cpf, String email, String endereco, int pontosFidelidade){
        super(nome, cpf, email);
        this.endereco = endereco;
        this.pontosFidelidade = 0;
    }
    // gett e sett do atributo endereco
    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    // gett e sett do atributo pontosFidelidade
    public int getPontosFidelidade(){
        return pontosFidelidade;
    }
    public void setPontosFidelidade(int pontosFidelidade){
        this.pontosFidelidade = pontosFidelidade;
    }

    // método adicionar Pontos
    public void  adicionarPontos(int pontos){
        this.pontosFidelidade += pontos;
    }
}
