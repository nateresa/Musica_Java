public class Musica {
    String nome;
    String artista;
    int anoDeLancamento;
    double avaliacao;
    int numeroDeAvaliacoes;

    void exibeFichaTecnica() {
        System.out.println("Nome da musica " + nome);
        System.out.println("Nome do artista " + artista);
        System.out.println("Ano de lancamento " + anoDeLancamento);
        System.out.println("Avaliacao " + avaliacao);
        System.out.println("Total de avaliacoes " + numeroDeAvaliacoes);
    }

    void avalia(double nota) {
        avaliacao +=
                nota;
        numeroDeAvaliacoes++;
    }

    double pegaMedia() {
        return avaliacao / numeroDeAvaliacoes;
    }

    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.nome = "Realidade ou Fantasia";
        minhaMusica.artista = "Henrique e Juliano";
        minhaMusica.anoDeLancamento = 2024;
        minhaMusica.numeroDeAvaliacoes = 4;

        minhaMusica.exibeFichaTecnica();
        minhaMusica.avalia(0.5);
        minhaMusica.avalia(9.5);
        minhaMusica.avalia(7.8);
        minhaMusica.avalia(10.0);

        System.out.println("Media de avaliacoes " + minhaMusica.pegaMedia());

    }
}
