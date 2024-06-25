public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private boolean isMusicaSelecionada = false;
    private boolean isTocandoMusica = false;
    private boolean isPaginaExibida = false;
    private boolean isNovaAbaAberta = false;

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        if (isNovaAbaAberta){
            isPaginaExibida = true;
            System.out.println("Exibindo a página: " + url);
        } else {
            System.out.println("Abra uma nova aba para exibir uma página!");
        }
    }

    @Override
    public void adicionarNovaAba() {
        isNovaAbaAberta = true;
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        if (isPaginaExibida) {
            System.out.println("Atualizando página");
        } else {
            System.out.println("Abra uma página para atualizá-la!");
        }
    }

    @Override
    public void tocar() {
        if (isMusicaSelecionada) {
            isTocandoMusica = true;
            System.out.println("Tocando música");
        } else {
            System.out.println("Selecione uma música antes de tocar!");
        }
    }

    @Override
    public void pausar() {
        if (isTocandoMusica) {
            isTocandoMusica = false;
            System.out.println("Música pausada");
        } else {
            System.out.println("A música precisa estar tocando para ser pausada.");
        }
    }

    @Override
    public void selecionarMusica(String musica) {
        isMusicaSelecionada = true;
        System.out.println("Música selecionada: " + musica);
    }
}
