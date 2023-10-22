class Dvd extends ItemBiblioteca {
    private int duracao;

    public Dvd(String titulo, int anoPublicacao, int numCopiasDisponiveis, int duracao) {
        super(titulo, anoPublicacao, numCopiasDisponiveis);
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    @Override
    public double calcularMulta(int diasAtraso) {
        return diasAtraso * 1.2; // Exemplo de cálculo de multa para DVD
    }
}
