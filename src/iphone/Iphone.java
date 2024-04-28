package iphone;


import iphone.aparelhoTelefonico.MeuAparelhoTelefonico;
import iphone.navegadorInternet.MeuNavegadorInternet;
import iphone.reprodutorMusical.MeuReprodutorMusical;
import iphone.aparelhoTelefonico.Telefone;
import iphone.navegadorInternet.Safari;
import iphone.reprodutorMusical.Ipod;

public class Iphone {
	
    public static void main(String[] args) {

    	
        // Aparelho telefônico
        Telefone aparelho = new MeuAparelhoTelefonico();
        aparelho.ligar();
        aparelho.atender();
        aparelho.iniciarCorreioVoz();

        // Navegador de internet
        Safari navegador = new MeuNavegadorInternet();
        navegador.exibirPagina();
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();

        // Reprodutor musical
        Ipod reprodutor = new MeuReprodutorMusical();
        reprodutor.tocar();
        reprodutor.pausar();
        reprodutor.selecionarMusica();
    }
    
    
}

