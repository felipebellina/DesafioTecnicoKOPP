package kopp.exercicio1.main;

import kopp.exercicio1.model.ListaValores;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    ListaValores lista = new ListaValores();
    private Scanner input = new Scanner(System.in);


    public void menu() {
        var menu = """
                1 - Adicionar valor na lista
                2 - Listar valores
                
                0 - Sair
                """;

        while (true) {
            int opcao;
            try {
                System.out.println(menu);
                System.out.println("Digite a opção desejada: ");
                var resposta = input.nextLine();
                opcao = Integer.parseInt(resposta);
            }catch (Exception erro){
                opcao = -1;
            }

            switch (opcao) {
                case 0:
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;
                case 1:
                    adicionarValorNaLista();
                    break;
                case 2:
                    listarValores();
                    break;
                case 3:
                    System.out.println(lista.total());
                    break;
                default:
                    System.out.println("Opção invalida");
            }
        }
    }

    public void adicionarValorNaLista() {
        var response = true;

        while (response) {
            double valor;
            try{
                System.out.println("Qual valor deseja adicionar a lista? ");
                valor = input.nextDouble();
                input.nextLine();
                lista.adicionarLista(valor);
                System.out.println("Valor adicionado!");
                while (true) {
                    System.out.println("Deseja adicionar outro valor? [S]im [N]ão: ");
                    var opcao = input.nextLine();

                    if (opcao.equalsIgnoreCase("s")) {
                        break;
                    } else if (opcao.equalsIgnoreCase("n")) {
                        response = false;
                        break;
                    } else {
                        System.out.println("Comando invalido!");
                    }
                }

            }catch (InputMismatchException erro){
                System.out.println("Valor invalido");
                response = false;
            }
        }
    }

    public void listarValores() {
        lista.listar();
    }
}