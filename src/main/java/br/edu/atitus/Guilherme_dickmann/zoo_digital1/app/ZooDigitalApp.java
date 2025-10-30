package br.edu.atitus.Guilherme_dickmann.zoo_digital1.app;

import br.edu.atitus.Guilherme_dickmann.zoo_digital1.animais.*;
import br.edu.atitus.Guilherme_dickmann.zoo_digital1.comportamentos.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZooDigitalApp {

    private static List<Animal> zooList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("===== BEM-VINDO AO ZOO DIGITAL =====");
        
        while (true) {
            exibirMenu();
            int opcao = lerInt("Escolha uma opção: ");

            switch (opcao) {
                case 1:
                    cadastrarAnimal();
                    break;
                case 2:
                    listarTodosAnimais();
                    break;
                case 3:
                    listarAnimaisCorredores();
                    break;
                case 4:
                    listarAnimaisNadadores();
                    break;
                case 5:
                    listarAnimaisVoadores();
                    break;
                case 6:
                    listarAnimaisPredadores();
                    break;
                case 7:
                    exibirTotalAnimais();
                    break;
                case 0:
                    System.out.println("Obrigado por visitar o Zoo Digital. Até logo!");
                    scanner.close();
                    return; 
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
            lerString("\nPressione Enter para continuar...");
        }
    }

    private static void exibirMenu() {
        System.out.println("\n--- MENU PRINCIPAL ---");
        System.out.println("1. Cadastrar Animal");
        System.out.println("2. Listar Todos os Animais");
        System.out.println("3. Listar Animais Corredores");
        System.out.println("4. Listar Animais Nadadores");
        System.out.println("5. Listar Animais Voadores");
        System.out.println("6. Listar Animais Predadores");
        System.out.println("7. Exibir Total de Animais");
        System.out.println("0. Sair");
    }

    private static void cadastrarAnimal() {
        System.out.println("\n--- Cadastro de Animal ---");
        System.out.println("Selecione o TIPO de animal para cadastrar:");
        System.out.println("1. Cachorro");
        System.out.println("2. Golfinho");
        System.out.println("3. Leão");
        System.out.println("4. Morcego");
        System.out.println("5. Pato");
        System.out.println("6. Pinguim");
        System.out.println("7. Águia");
        System.out.println("8. Avestruz");
        System.out.println("9. Traíra");
        System.out.println("10. Peixe-Morcego");
        System.out.println("11. Tubarão");
        System.out.println("12. Peixe-Voador");
        System.out.println("13. Cobra");
        System.out.println("14. Crocodilo");
        System.out.println("15. Tartaruga Marinha");
        System.out.println("16. Lagarto");
        System.out.println("0. Cancelar");

        int tipo = lerInt("Tipo do animal: ");

        if (tipo == 0) {
            System.out.println("Cadastro cancelado.");
            return;
        }

        String nome = lerString("Nome: ");
        int idade = lerInt("Idade: ");
        Animal novoAnimal = null;

        try {
            switch (tipo) {
                case 1:
                    String raca = lerString("Raça: ");
                    novoAnimal = new Cachorro(nome, idade, raca);
                    break;
                case 2:
                    novoAnimal = new Golfinho(nome, idade);
                    break;
                case 3:
                    novoAnimal = new Leao(nome, idade);
                    break;
                case 4:
                    novoAnimal = new Morcego(nome, idade);
                    break;
                case 5:
                    String corPenasPato = lerString("Cor das Penas: ");
                    novoAnimal = new Pato(nome, idade, corPenasPato);
                    break;
                case 6:
                    String corPenasPinguim = lerString("Cor das Penas: ");
                    novoAnimal = new Pinguim(nome, idade, corPenasPinguim);
                    break;
                case 7:
                    String corPenasAguia = lerString("Cor das Penas: ");
                    novoAnimal = new Aguia(nome, idade, corPenasAguia);
                    break;
                case 8:
                    String corPenasAvestruz = lerString("Cor das Penas: ");
                    novoAnimal = new Avestruz(nome, idade, corPenasAvestruz);
                    break;
                case 9:
                    novoAnimal = new Traira(nome, idade);
                    break;
                case 10:
                    novoAnimal = new PeixeMorcego(nome, idade);
                    break;
                case 11:
                    novoAnimal = new Tubarao(nome, idade);
                    break;
                case 12:
                    novoAnimal = new PeixeVoador(nome, idade);
                    break;
                case 13:
                    novoAnimal = new Cobra(nome, idade);
                    break;
                case 14:
                    novoAnimal = new Crocodilo(nome, idade);
                    break;
                case 15:
                    novoAnimal = new TartarugaMarinha(nome, idade);
                    break;
                case 16:
                    novoAnimal = new Lagarto(nome, idade);
                    break;
                default:
                    System.out.println("Tipo de animal inválido.");
                    return; 
            }

            if (novoAnimal != null) {
                zooList.add(novoAnimal);
                System.out.println(novoAnimal.getNome() + " (" + novoAnimal.getEspecie() + ") cadastrado com sucesso!");
            }
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar animal: " + e.getMessage());
        }
    }

    private static void listarTodosAnimais() {
        System.out.println("\n--- Lista de Todos os Animais ---");
        if (zooList.isEmpty()) {
            System.out.println("O zoo está vazio. Cadastre alguns animais primeiro.");
            return;
        }

        for (Animal animal : zooList) {
            System.out.println("------------------------------");
            System.out.println("Nome: " + animal.getNome());
            System.out.println("Idade: " + animal.getIdade());
            System.out.println("Espécie: " + animal.getEspecie());
            animal.emitirSom();
            animal.comer();
        }
    }

    private static void listarAnimaisCorredores() {
        System.out.println("\n--- Animais Corredores ---");
        if (zooList.isEmpty()) {
            System.out.println("O zoo está vazio.");
            return;
        }

        int count = 0;
        for (Animal animal : zooList) {
            if (animal instanceof Corredor) {
                System.out.println("------------------------------");
                System.out.println("Nome: " + animal.getNome() + " (" + animal.getEspecie() + ")");
                Corredor corredor = (Corredor) animal;
                corredor.correr();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Nenhum animal corredor encontrado no zoo.");
        }
    }

    private static void listarAnimaisNadadores() {
        System.out.println("\n--- Animais Nadadores ---");
        if (zooList.isEmpty()) {
            System.out.println("O zoo está vazio.");
            return;
        }

        int count = 0;
        for (Animal animal : zooList) {
            if (animal instanceof Nadador) {
                System.out.println("------------------------------");
                System.out.println("Nome: " + animal.getNome() + " (" + animal.getEspecie() + ")");
                Nadador nadador = (Nadador) animal;
                nadador.nadar();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Nenhum animal nadador encontrado no zoo.");
        }
    }

    private static void listarAnimaisVoadores() {
        System.out.println("\n--- Animais Voadores ---");
        if (zooList.isEmpty()) {
            System.out.println("O zoo está vazio.");
            return;
        }

        int count = 0;
        for (Animal animal : zooList) {
            if (animal instanceof Voador) {
                System.out.println("------------------------------");
                System.out.println("Nome: " + animal.getNome() + " (" + animal.getEspecie() + ")");
                Voador voador = (Voador) animal;
                voador.voar();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Nenhum animal voador encontrado no zoo.");
        }
    }

    private static void listarAnimaisPredadores() {
        System.out.println("\n--- Animais Predadores ---");
        if (zooList.isEmpty()) {
            System.out.println("O zoo está vazio.");
            return;
        }

        int count = 0;
        for (Animal animal : zooList) {
            if (animal instanceof Predador) {
                System.out.println("------------------------------");
                System.out.println("Nome: " + animal.getNome() + " (" + animal.getEspecie() + ")");
                Predador predador = (Predador) animal;
                predador.cacar();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Nenhum animal predador encontrado no zoo.");
        }
    }

    private static void exibirTotalAnimais() {
        System.out.println("\n--- Total de Animais ---");
        int total = Animal.getContador();
        System.out.println("O Zoo Digital abriga atualmente " + total + " animais.");
    }

    private static String lerString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    private static int lerInt(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                int valor = Integer.parseInt(scanner.nextLine());
                return valor;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
            }
        }
    }
}
