package iphone;

import java.util.Scanner;
import iphone.aparelhoTelefonico.MeuAparelhoTelefonico;
import iphone.navegadorInternet.MeuNavegadorInternet;
import iphone.reprodutorMusical.MeuReprodutorMusical;
import iphone.aparelhoTelefonico.Telefone;
import iphone.navegadorInternet.Safari;
import iphone.reprodutorMusical.Ipod;

public class Iphone {
	
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Usar Aparelho Telefônico");
            System.out.println("2. Usar Navegador de Internet");
            System.out.println("3. Usar Reprodutor Musical");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
				new MeuAparelhoTelefonico();
                    break;
                case 2:
				new MeuNavegadorInternet();
                    break;
                case 3:
				new MeuReprodutorMusical();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

    	
    	
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

