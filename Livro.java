class Livro extends ItemBiblioteca {
    private String autor;

    public Livro(String titulo, int anoPublicacao, int numCopiasDisponiveis, String autor) {
        super(titulo, anoPublicacao, numCopiasDisponiveis);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public double calcularMulta(int diasAtraso) {
        return diasAtraso * 0.5; // Exemplo de cálculo de multa para livro
    }
}
