package com.github.glaucioscheibel.nosql.chavevalor.exercicio08;

import java.util.Scanner;

public class Main {
    private static Scanner input;
    private static final PessoaDAO dao = new PessoaKVDAOImpl();

    static void main() {
        input = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("""
                Menu:
                1 - Create
                2 - Read
                3 - Update
                4 - Delete
                0 - Fim
                """);
            opcao = input.nextInt();
            input.nextLine();
            switch (opcao) {
                case 1 -> create();
                case 2 -> read();
                case 3 -> update();
                case 4 -> delete();
            }
        } while (opcao != 0);
        input.close();
    }

    private static void create() {
        Pessoa p = new Pessoa();
        System.out.println("Create:");
        System.out.print("id: ");
        p.setId(input.nextInt());
        input.nextLine();
        System.out.print("Nome: ");
        p.setNome(input.nextLine());
        System.out.print("Sobrenome: ");
        p.setSobrenome(input.nextLine());
        System.out.print("Telefone: ");
        p.setTelefone(input.nextLine());
        System.out.print("Idade: ");
        p.setIdade(input.nextInt());
        input.nextLine();
        dao.create(p);
    }

    private static void update() {
        create();
    }

    private static void read() {
        System.out.println("Read:");
        System.out.print("Id: ");
        int id = input.nextInt();
        System.out.println(dao.read(id));
    }

    private static void delete() {
        System.out.println("Delete:");
        System.out.print("Id: ");
        int id = input.nextInt();
        dao.delete(id);
    }
}
