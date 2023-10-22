class Revista extends ItemBiblioteca {
    private int edicao;

    public Revista(String titulo, int anoPublicacao, int numCopiasDisponiveis, int edicao) {
        super(titulo, anoPublicacao, numCopiasDisponiveis);
        this.edicao = edicao;
    }

    public int getEdicao() {
        return edicao;
    }

    @Override
    public double calcularMulta(int diasAtraso) {
        return diasAtraso * 0.8; // Exemplo de cálculo de multa para revista
    }
}
