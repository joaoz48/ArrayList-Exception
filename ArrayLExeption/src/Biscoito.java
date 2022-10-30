public class Biscoito {
    private String nome;
    private double valor;
    private int qtd;
    private String sabor;

    public Biscoito(String nome, double valor, int qtd, String sabor) {
        this.nome = nome;
        this.valor = valor;
        this.qtd = qtd;
        this.sabor = sabor;
    }

    public double getValor() {
        return valor;
    }

    public int getQtd() {
        return qtd;
    }

}
