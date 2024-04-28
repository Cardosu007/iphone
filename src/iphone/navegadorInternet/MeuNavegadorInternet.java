package iphone.navegadorInternet;

public class MeuNavegadorInternet implements Safari {
    public void exibirPagina() {
        System.out.println("Exibindo página: ");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }
}