package Ex3;

public class Morador {
    private static int codigoSequencial = 1;

    private int codigo;
    private String nome;
    private String apartamento;
    private String telefone;

    public Morador(String nome, String apartamento, String telefone) {
        this.codigo = codigoSequencial++;
        this.nome = nome;
        this.apartamento = apartamento;
        this.telefone = telefone;
    }

    // Métodos getters
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getApartamento() {
        return apartamento;
    }

    public String getTelefone() {
        return telefone;
    }

    // Métodos setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setApartamento(String apartamento) {
        this.apartamento = apartamento;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Nome: " + nome + ", Apartamento: " + apartamento + ", Telefone: " + telefone;
    }
}
