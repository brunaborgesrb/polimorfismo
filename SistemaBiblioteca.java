import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class SistemaBiblioteca {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserindo dados do Livro: ");
        System.out.println("Título: ");
        String tituloLivro = scanner.nextLine();
        System.out.println("Ano de Publicação: ");
        int anoPublicacaoLivro = scanner.nextInt();
        System.out.println("Número de Cópias: ");
        int numCopiasLivro = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer
        System.out.println("Autor: ");
        String autorLivro = scanner.nextLine();

        Livro livro = new Livro(tituloLivro, anoPublicacaoLivro, numCopiasLivro, autorLivro);

        System.out.println("Inserindo dados do DVD: ");
        System.out.println("Título: ");
        String tituloDVD = scanner.nextLine();
        System.out.println("Ano de Publicação: ");
        int anoPublicacaoDVD = scanner.nextInt();
        System.out.println("Número de Cópias: ");
        int numCopiasDVD = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer
        System.out.println("Duração (em minutos): ");
        int duracaoDVD = scanner.nextInt();

        Dvd dvd = new Dvd(tituloDVD, anoPublicacaoDVD, numCopiasDVD, duracaoDVD);

        System.out.println("Inserindo dados da Revista: ");
        System.out.println("Título: ");
        String tituloRevista = scanner.nextLine();
        System.out.println("Ano de Publicação: ");
        int anoPublicacaoRevista = scanner.nextInt();
        System.out.println("Número de Cópias: ");
        int numCopiasRevista = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer
        System.out.println("Edição: ");
        int edicaoRevista = scanner.nextInt();

        Revista revista = new Revista(tituloRevista, anoPublicacaoRevista, numCopiasRevista, edicaoRevista);

        // Simulando empréstimo e devolução
        System.out.println("Realizando operações de empréstimo e devolução: ");
        livro.emprestarItem();
        dvd.emprestarItem();
        revista.emprestarItem();

        livro.devolverItem();
        dvd.devolverItem();
        revista.devolverItem();

        // Simulando atraso na devolução
        LocalDate dataDevolucao = LocalDate.of(2023, 10, 15);
        LocalDate dataAtual = LocalDate.of(2023, 10, 18);
        long diasAtraso = ChronoUnit.DAYS.between(dataDevolucao, dataAtual);
        System.out.println("Multa do livro: " + livro.calcularMulta((int) diasAtraso));
        System.out.println("Multa do DVD: " + dvd.calcularMulta((int) diasAtraso));
        System.out.println("Multa da Revista: " + revista.calcularMulta((int) diasAtraso));

        scanner.close();
    }
}

