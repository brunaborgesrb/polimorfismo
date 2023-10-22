class ItemBiblioteca {
    private String titulo;
    private int anoPublicacao;
    private int numCopiasDisponiveis;

    public ItemBiblioteca(String titulo, int anoPublicacao, int numCopiasDisponiveis) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.numCopiasDisponiveis = numCopiasDisponiveis;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public int getNumCopiasDisponiveis() {
        return numCopiasDisponiveis;
    }

    public void emprestarItem() {
        if (numCopiasDisponiveis > 0) {
            numCopiasDisponiveis--;
            System.out.println("Item emprestado com sucesso.");
        } else {
            System.out.println("Nenhuma cópia disponível para empréstimo.");
        }
    }

    public void devolverItem() {
        numCopiasDisponiveis++;
        System.out.println("Item devolvido com sucesso.");
    }

    public double calcularMulta(int diasAtraso) {
        return 0; // Implementação genérica para cálculo de multa
    }
}