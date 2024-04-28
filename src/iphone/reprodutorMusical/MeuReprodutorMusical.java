package iphone.reprodutorMusical;

public class MeuReprodutorMusical implements Ipod {
    public void tocar() {
        System.out.println("Tocando música...");
    }

    public void pausar() {
        System.out.println("Pausando música...");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando música: ");
    }
}