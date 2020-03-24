package com.br.students.list;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Hello world!
 */

public class App {
    private static Scanner scanner = new Scanner(System.in);
    private static String option;
    private static String name;
    private static Set<String> arlist = new HashSet<String>();
    //private static ArrayList<String> arlist = new ArrayList<String>();

    private static void Menu(){
        System.out.println("\nMenu\n");
        System.out.println("Digite 1 para inserir o estudante");
        System.out.println("Digite 2 para imprimir a lista");
        option = scanner.nextLine();
    }
    
    private static void Adiciona(){     
        System.out.print("\nDigite o nome do aluno: ");
        name = scanner.nextLine();
        if (VerificaIgual(name)) {
            System.out.println("O aluno já esta cadastrado!");
        } else {
            arlist.add(name);
        }
    }

    private static boolean VerificaIgual(String name) {
        return arlist.contains(name);
    }

    private static void Lista(){
        System.out.println("Listando ...");
        arlist.forEach(student -> System.out.println(student));
    }

    public static void main(String[] args) {
        boolean run = true;

        while(run){
            Menu();
            switch (option){
                case "1":
                    Adiciona();
                    break;
                case "2":
                    Lista();
                    run = false;
                    break;
                default:
                    System.out.println("Digite uma opção válida");
            }
        }
        scanner.close();
    }
}
