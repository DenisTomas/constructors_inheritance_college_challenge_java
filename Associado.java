public class Associado extends Pessoa {
    private String situacao;
    private int numeroAssociado;

    // construtor
    public Associado(int id, String nome, String logradouro, String numero, String cep, String bairro, String cidade, String uf, String telefone, String cpfCnpj, String situacao, int numeroAssociado) {
        super(id, nome, logradouro, numero, cep, bairro, cidade, uf, telefone, cpfCnpj);
        this.situacao = situacao;
        this.numeroAssociado = numeroAssociado;
    }

    //getters & setters
    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public int getNumeroAssociado() {
        return numeroAssociado;
    }

    public void setNumeroAssociado(int numeroAssociado) {
        this.numeroAssociado = numeroAssociado;
    };
}
