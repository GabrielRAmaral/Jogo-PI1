/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.jogoquiz;

/**
 *
 * @author gabri
 */
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class JogoQuiz {

    static int qtRespostasCorretas, qtRespostasINcorretas;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int opcao = 1;

        while (opcao != 4) {           
            imprimir("+_____________+");
            imprimir(">1- INSTRUÇÕES<");
            imprimir(">2- JOGAR     <");
            imprimir(">3- CRÉDITOS  <");
            imprimir(">4- SAIR      <");
            imprimir("+_____________+");
            imprimir("Escolha sua opção:");
            opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    instrucao();
                    break;
                case 2:  
                    qtRespostasCorretas = 0;
                    qtRespostasINcorretas = 0;
                    jogar();
                    break;
                case 3:
                    creditos();
                    break;
                case 4:
                    imprimir("Opção: Sair");
                    imprimir("Muito obrigado por jogar!!! :)");
                    break;
                default:
                    imprimir("Opção inválida");
            }
        }
    }
    
    public static void imprimir(String msg){
        System.out.println(msg);
    }
    
    public static void instrucao(){
        imprimir("*Este é um QUIZ de 10 perguntas com o tema copa do mundo.*");
        imprimir("*Aperte 2 para jogar e então selecione a alternativa escolhida digitando a letra correspondente.*");
        imprimir("*Aperte 3 para visualizar os Créditos.*");
        imprimir("*Aperte 4 para sair do jogo.*");
        imprimir("*Bom jogo!!*");
    }

    public static void jogar() {
        pergunta1();
        pergunta2();
        pergunta3();
        pergunta4();
        pergunta5();
        pergunta6();
        pergunta7();
        pergunta8();
        pergunta9();
        pergunta10();
    }
    
    public static void creditos(){
        
        imprimir("*Jogo criado por: *");
        imprimir("*Altieres Lima Capim*");
        imprimir("*Divanei Alves da Silva*");
        imprimir("*Eduardo de Sousa Mateus Filho*");
        imprimir("*Gabriel Rodrigues do Amaral*");
        imprimir("*Murilo Felismino Moureira*");
        imprimir("*Esperamos que tenha gostado!*");
    }

    public static void pergunta1() {

        Scanner entrada = new Scanner(System.in);
        boolean acertou = true;
        List alternativas = new ArrayList();
        alternativas.add("5"); // resposta correta
        alternativas.add("6");
        alternativas.add("4");
        alternativas.add("1");
        alternativas.add("97");

        do {
            Collections.shuffle(alternativas);
            imprimir("1)Quantas vezes a seleção brasileira foi campeã do mundo?");
            imprimir("A) " + alternativas.get(0));
            imprimir("B) " + alternativas.get(1));
            imprimir("C) " + alternativas.get(2));
            imprimir("D) " + alternativas.get(3));
            imprimir("E) " + alternativas.get(4));
            imprimir("Escolha uma alternativa: ");
            String resposta = entrada.next();
            resposta = resposta.substring(0, 1).toUpperCase();
            switch (resposta) {
                case "A":
                    if (alternativas.get(0).equals("5")) {
                        imprimir("Resposta correta!");
                        qtRespostasCorretas++;
                    } else {
                        imprimir("Resposta incorreta!");
                        qtRespostasINcorretas++;
                    }
                    acertou = false;
                    break;
                case "B":
                    if (alternativas.get(1).equals("5")) {
                        imprimir("Resposta correta!");
                        qtRespostasCorretas++;
                    } else {
                        imprimir("Resposta incorreta!");
                        qtRespostasINcorretas++;
                    }
                    acertou = false;
                    break;
                case "C":
                    if (alternativas.get(2).equals("5")) {
                        imprimir("Resposta correta!");
                        qtRespostasCorretas++;
                    } else {
                        imprimir("Resposta incorreta!");
                        qtRespostasINcorretas++;
                    }
                    acertou = false;
                    break;
                case "D":
                    if (alternativas.get(3).equals("5")) {
                        imprimir("Resposta correta!");
                        qtRespostasCorretas++;
                    } else {
                        imprimir("Resposta incorreta!");
                        qtRespostasINcorretas++;
                    }
                    acertou = false;
                    break;
                case "E":
                    if (alternativas.get(4).equals("5")) {
                        imprimir("Resposta correta!");
                        qtRespostasCorretas++;
                    } else {
                        imprimir("Resposta incorreta!");
                        qtRespostasINcorretas++;
                    }
                    acertou = false;
                    break;
                default:
                    imprimir("Escolha inválida!");
            }
        } while (acertou);
    }

    public static void pergunta2() {

        Scanner entrada = new Scanner(System.in);
        boolean acertou = true;
        List alternativas = new ArrayList();
        alternativas.add("França"); // resposta correta
        alternativas.add("Alemanha");
        alternativas.add("Brasil");
        alternativas.add("Espanha");
        alternativas.add("Gana");

        do {
            Collections.shuffle(alternativas);
            imprimir("2)Qual seleção foi campeã da ultima copa do mundo(2018)?");
            imprimir("A) " + alternativas.get(0));
            imprimir("B) " + alternativas.get(1));
            imprimir("C) " + alternativas.get(2));
            imprimir("D) " + alternativas.get(3));
            imprimir("E) " + alternativas.get(4));
            imprimir("Escolha uma alternativa: ");
            String resposta = entrada.next();
            resposta = resposta.substring(0, 1).toUpperCase();
            switch (resposta) {
                case "A":
                    if (alternativas.get(0).equals("França")) {
                        imprimir("Resposta correta!");
                        qtRespostasCorretas++;
                    } else {
                        imprimir("Resposta incorreta!");
                        qtRespostasINcorretas++;
                    }
                    acertou = false;
                    break;
                case "B":
                    if (alternativas.get(1).equals("França")) {
                        imprimir("Resposta correta!");
                        qtRespostasCorretas++;
                    } else {
                        imprimir("Resposta incorreta!");
                        qtRespostasINcorretas++;
                    }
                    acertou = false;
                    break;
                case "C":
                    if (alternativas.get(2).equals("França")) {
                        imprimir("Resposta correta!");
                        qtRespostasCorretas++;
                    } else {
                        imprimir("Resposta incorreta!");
                        qtRespostasINcorretas++;
                    }
                    acertou = false;
                    break;
                case "D":
                    if (alternativas.get(3).equals("França")) {
                        imprimir("Resposta correta!");
                        qtRespostasCorretas++;
                    } else {
                        imprimir("Resposta incorreta!");
                        qtRespostasINcorretas++;
                    }
                    acertou = false;
                    break;
                case "E":
                    if (alternativas.get(4).equals("França")) {
                        imprimir("Resposta correta!");
                        qtRespostasCorretas++;
                    } else {
                        imprimir("Resposta incorreta!");
                        qtRespostasINcorretas++;
                    }
                    acertou = false;
                    break;
                default:
                    imprimir("Escolha inválida!");
            }
        } while (acertou);
    }
    
    public static void pergunta3() {

        Scanner entrada = new Scanner(System.in);
        boolean acertou = true;
        List alternativas = new ArrayList();
        alternativas.add("0"); // resposta correta
        alternativas.add("5");
        alternativas.add("1");
        alternativas.add("2");
        alternativas.add("7");

        do {
            Collections.shuffle(alternativas);
            imprimir("3)Quantas vezes a seleção portuguesa foi campeã do mundo?");
            imprimir("A) " + alternativas.get(0));
            imprimir("B) " + alternativas.get(1));
            imprimir("C) " + alternativas.get(2));
            imprimir("D) " + alternativas.get(3));
            imprimir("E) " + alternativas.get(4));
            imprimir("Escolha uma alternativa: ");
            String resposta = entrada.next();
            resposta = resposta.substring(0, 1).toUpperCase();
            switch (resposta) {
                case "A":
                    if (alternativas.get(0).equals("0")) {
                        imprimir("Resposta correta!");
                        qtRespostasCorretas++;
                    } else {
                        imprimir("Resposta incorreta!");
                        qtRespostasINcorretas++;
                    }
                    acertou = false;
                    break;
                case "B":
                    if (alternativas.get(1).equals("0")) {
                        imprimir("Resposta correta!");
                        qtRespostasCorretas++;
                    } else {
                        imprimir("Resposta incorreta!");
                        qtRespostasINcorretas++;
                    }
                    acertou = false;
                    break;
                case "C":
                    if (alternativas.get(2).equals("0")) {
                        imprimir("Resposta correta!");
                        qtRespostasCorretas++;
                    } else {
                        imprimir("Resposta incorreta!");
                        qtRespostasINcorretas++;
                    }
                    acertou = false;
                    break;
                case "D":
                    if (alternativas.get(3).equals("0")) {
                        imprimir("Resposta correta!");
                        qtRespostasCorretas++;
                    } else {
                        imprimir("Resposta incorreta!");
                        qtRespostasINcorretas++;
                    }
                    acertou = false;
                    break;
                case "E":
                    if (alternativas.get(4).equals("0")) {
                        imprimir("Resposta correta!");
                        qtRespostasCorretas++;
                    } else {
                        imprimir("Resposta incorreta!");
                        qtRespostasINcorretas++;
                    }
                    acertou = false;
                    break;
                default:
                    imprimir("Escolha inválida!");
            }
        } while (acertou);
    }
    
    public static void pergunta4() {

        Scanner entrada = new Scanner(System.in);
        boolean acertou = true;
        List alternativas = new ArrayList();
        alternativas.add("Uruguai"); // resposta correta
        alternativas.add("Argentina");
        alternativas.add("Brasil");
        alternativas.add("Japão");
        alternativas.add("Itália");

        do {
            Collections.shuffle(alternativas);
            imprimir("4)Qual foi a primeira seleção a ser campeã da copa do mundo?");
            imprimir("A) " + alternativas.get(0));
            imprimir("B) " + alternativas.get(1));
            imprimir("C) " + alternativas.get(2));
            imprimir("D) " + alternativas.get(3));
            imprimir("E) " + alternativas.get(4));
            imprimir("Escolha uma alternativa: ");
            String resposta = entrada.next();
            resposta = resposta.substring(0, 1).toUpperCase();
            switch (resposta) {
                case "A":
                    if (alternativas.get(0).equals("Uruguai")) {
                        imprimir("Resposta correta!");
                        qtRespostasCorretas++;
                    } else {
                        imprimir("Resposta incorreta!");
                        qtRespostasINcorretas++;
                    }
                    acertou = false;
                    break;
                case "B":
                    if (alternativas.get(1).equals("Uruguai")) {
                        imprimir("Resposta correta!");
                        qtRespostasCorretas++;
                    } else {
                        imprimir("Resposta incorreta!");
                        qtRespostasINcorretas++;
                    }
                    acertou = false;
                    break;
                case "C":
                    if (alternativas.get(2).equals("Uruguai")) {
                        imprimir("Resposta correta!");
                        qtRespostasCorretas++;
                    } else {
                        imprimir("Resposta incorreta!");
                        qtRespostasINcorretas++;
                    }
                    acertou = false;
                    break;
                case "D":
                    if (alternativas.get(3).equals("Uruguai")) {
                        imprimir("Resposta correta!");
                        qtRespostasCorretas++;
                    } else {
                        imprimir("Resposta incorreta!");
                        qtRespostasINcorretas++;
                    }
                    acertou = false;
                    break;
                case "E":
                    if (alternativas.get(4).equals("Uruguai")) {
                        imprimir("Resposta correta!");
                        qtRespostasCorretas++;
                    } else {
                        imprimir("Resposta incorreta!");
                        qtRespostasINcorretas++;
                    }
                    acertou = false;
                    break;
                default:
                    imprimir("Escolha inválida!");
            }
        } while (acertou);
    }
    
    public static void pergunta5() {

        Scanner entrada = new Scanner(System.in);
        boolean acertou = true;
        List alternativas = new ArrayList();
        alternativas.add("1930"); // resposta correta
        alternativas.add("1958");
        alternativas.add("1932");
        alternativas.add("2018");
        alternativas.add("1957");

        do {
            Collections.shuffle(alternativas);
            imprimir("5)Em que ano aconteceu a primeira copa do mundo?");
            imprimir("A) " + alternativas.get(0));
            imprimir("B) " + alternativas.get(1));
            imprimir("C) " + alternativas.get(2));
            imprimir("D) " + alternativas.get(3));
            imprimir("E) " + alternativas.get(4));
            imprimir("Escolha uma alternativa: ");
            String resposta = entrada.next();
            resposta = resposta.substring(0, 1).toUpperCase();
            switch (resposta) {
                case "A":
                    if (alternativas.get(0).equals("1930")) {
                        imprimir("Resposta correta!");
                        qtRespostasCorretas++;
                    } else {
                        imprimir("Resposta incorreta!");
                        qtRespostasINcorretas++;
                    }
                    acertou = false;
                    break;
                case "B":
                    if (alternativas.get(1).equals("1930")) {
                        imprimir("Resposta correta!");
                        qtRespostasCorretas++;
                    } else {
                        imprimir("Resposta incorreta!");
                        qtRespostasINcorretas++;
                    }
                    acertou = false;
                    break;
                case "C":
                    if (alternativas.get(2).equals("1930")) {
                        imprimir("Resposta correta!");
                        qtRespostasCorretas++;
                    } else {
                        imprimir("Resposta incorreta!");
                        qtRespostasINcorretas++;
                    }
                    acertou = false;
                    break;
                case "D":
                    if (alternativas.get(3).equals("1930")) {
                        imprimir("Resposta correta!");
                        qtRespostasCorretas++;
                    } else {
                        imprimir("Resposta incorreta!");
                        qtRespostasINcorretas++;
                    }
                    acertou = false;
                    break;
                case "E":
                    if (alternativas.get(4).equals("1930")) {
                        imprimir("Resposta correta!");
                        qtRespostasCorretas++;
                    } else {
                        imprimir("Resposta incorreta!");
                        qtRespostasINcorretas++;
                    }
                    acertou = false;
                    break;
                default:
                    imprimir("Escolha inválida!");
            }
        } while (acertou);
    }
    
    public static void pergunta6() {

        Scanner entrada = new Scanner(System.in);
        boolean acertou = true;
        List alternativas = new ArrayList();
        alternativas.add("Holanda"); // resposta correta
        alternativas.add("Argentina");
        alternativas.add("Alemanha");
        alternativas.add("Turquia");
        alternativas.add("França");

        do {
            Collections.shuffle(alternativas);
            imprimir("6)Qual seleção eliminou o Brasil da copa do mundo de 2010?");
            imprimir("A) " + alternativas.get(0));
            imprimir("B) " + alternativas.get(1));
            imprimir("C) " + alternativas.get(2));
            imprimir("D) " + alternativas.get(3));
            imprimir("E) " + alternativas.get(4));
            imprimir("Escolha uma alternativa: ");
            String resposta = entrada.next();
            resposta = resposta.substring(0, 1).toUpperCase();
            switch (resposta) {
                case "A":
                    if (alternativas.get(0).equals("Holanda")) {
                        imprimir("Resposta correta!");
                        qtRespostasCorretas++;
                    } else {
                        imprimir("Resposta incorreta!");
                        qtRespostasINcorretas++;
                    }
                    acertou = false;
                    break;
                case "B":
                    if (alternativas.get(1).equals("Holanda")) {
                        imprimir("Resposta correta!");
                        qtRespostasCorretas++;
                    } else {
                        imprimir("Resposta incorreta!");
                        qtRespostasINcorretas++;
                    }
                    acertou = false;
                    break;
                case "C":
                    if (alternativas.get(2).equals("Holanda")) {
                        imprimir("Resposta correta!");
                        qtRespostasCorretas++;
                    } else {
                        imprimir("Resposta incorreta!");
                        qtRespostasINcorretas++;
                    }
                    acertou = false;
                    break;
                case "D":
                    if (alternativas.get(3).equals("Holanda")) {
                        imprimir("Resposta correta!");
                        qtRespostasCorretas++;
                    } else {
                        imprimir("Resposta incorreta!");
                        qtRespostasINcorretas++;
                    }
                    acertou = false;
                    break;
                case "E":
                    if (alternativas.get(4).equals("Holanda")) {
                        imprimir("Resposta correta!");
                        qtRespostasCorretas++;
                    } else {
                        imprimir("Resposta incorreta!");
                        qtRespostasINcorretas++;
                    }
                    acertou = false;
                    break;
                default:
                    imprimir("Escolha inválida!");
            }
        } while (acertou);
    }
    
    public static void pergunta7() {

        Scanner entrada = new Scanner(System.in);
        boolean acertou = true;
        List alternativas = new ArrayList();
        alternativas.add("Espanha"); // resposta correta
        alternativas.add("Holanda");
        alternativas.add("Portugal");
        alternativas.add("Palmeiras");
        alternativas.add("Africa do Sul");

        do {
            Collections.shuffle(alternativas);
            imprimir("7)Que seleção foi campeã da copa do mundo de 2010?");
            imprimir("A) " + alternativas.get(0));
            imprimir("B) " + alternativas.get(1));
            imprimir("C) " + alternativas.get(2));
            imprimir("D) " + alternativas.get(3));
            imprimir("E) " + alternativas.get(4));
            imprimir("Escolha uma alternativa: ");
            String resposta = entrada.next();
            resposta = resposta.substring(0, 1).toUpperCase();
            switch (resposta) {
                case "A":
                    if (alternativas.get(0).equals("Espanha")) {
                        imprimir("Resposta correta!");
                        qtRespostasCorretas++;
                    } else {
                        imprimir("Resposta incorreta!");
                        qtRespostasINcorretas++;
                    }
                    acertou = false;
                    break;
                case "B":
                    if (alternativas.get(1).equals("Espanha")) {
                        imprimir("Resposta correta!");
                        qtRespostasCorretas++;
                    } else {
                        imprimir("Resposta incorreta!");
                        qtRespostasINcorretas++;
                    }
                    acertou = false;
                    break;
                case "C":
                    if (alternativas.get(2).equals("Espanha")) {
                        imprimir("Resposta correta!");
                        qtRespostasCorretas++;
                    } else {
                        imprimir("Resposta incorreta!");
                        qtRespostasINcorretas++;
                    }
                    acertou = false;
                    break;
                case "D":
                    if (alternativas.get(3).equals("Espanha")) {
                        imprimir("Resposta correta!");
                        qtRespostasCorretas++;
                    } else {
                        imprimir("Resposta incorreta!");
                        qtRespostasINcorretas++;
                    }
                    acertou = false;
                    break;
                case "E":
                    if (alternativas.get(4).equals("Espanha")) {
                        imprimir("Resposta correta!");
                        qtRespostasCorretas++;
                    } else {
                        imprimir("Resposta incorreta!");
                        qtRespostasINcorretas++;
                    }
                    acertou = false;
                    break;
                default:
                    imprimir("Escolha inválida!");
            }
        } while (acertou);
    }
    
    public static void pergunta8() {

        Scanner entrada = new Scanner(System.in);
        boolean acertou = true;
        List alternativas = new ArrayList();
        alternativas.add("Miroslav Klose"); // resposta correta
        alternativas.add("Keisuke Honda");
        alternativas.add("Vladimir Putin");
        alternativas.add("Ronaldo Nazário");
        alternativas.add("Galvez Gonçalves");

        do {
            Collections.shuffle(alternativas);
            imprimir("8)Qual foi o maior artilheiro da história das copas do mundo?");
            imprimir("A) " + alternativas.get(0));
            imprimir("B) " + alternativas.get(1));
            imprimir("C) " + alternativas.get(2));
            imprimir("D) " + alternativas.get(3));
            imprimir("E) " + alternativas.get(4));
            imprimir("Escolha uma alternativa: ");
            String resposta = entrada.next();
            resposta = resposta.substring(0, 1).toUpperCase();
            switch (resposta) {
                case "A":
                    if (alternativas.get(0).equals("Miroslav Klose")) {
                        imprimir("Resposta correta!");
                        qtRespostasCorretas++;
                    } else {
                        imprimir("Resposta incorreta!");
                        qtRespostasINcorretas++;
                    }
                    acertou = false;
                    break;
                case "B":
                    if (alternativas.get(1).equals("Miroslav Klose")) {
                        imprimir("Resposta correta!");
                        qtRespostasCorretas++;
                    } else {
                        imprimir("Resposta incorreta!");
                        qtRespostasINcorretas++;
                    }
                    acertou = false;
                    break;
                case "C":
                    if (alternativas.get(2).equals("Miroslav Klose")) {
                        imprimir("Resposta correta!");
                        qtRespostasCorretas++;
                    } else {
                        imprimir("Resposta incorreta!");
                        qtRespostasINcorretas++;
                    }
                    acertou = false;
                    break;
                case "D":
                    if (alternativas.get(3).equals("Miroslav Klose")) {
                        imprimir("Resposta correta!");
                        qtRespostasCorretas++;
                    } else {
                        imprimir("Resposta incorreta!");
                        qtRespostasINcorretas++;
                    }
                    acertou = false;
                    break;
                case "E":
                    if (alternativas.get(4).equals("Miroslav Klose")) {
                        imprimir("Resposta correta!");
                        qtRespostasCorretas++;
                    } else {
                        imprimir("Resposta incorreta!");
                        qtRespostasINcorretas++;
                    }
                    acertou = false;
                    break;
                default:
                    imprimir("Escolha inválida!");
            }
        } while (acertou);
    }
    
    public static void pergunta9() {

        Scanner entrada = new Scanner(System.in);
        boolean acertou = true;
        List alternativas = new ArrayList();
        alternativas.add("1"); // resposta correta
        alternativas.add("2");
        alternativas.add("Todas");
        alternativas.add("3");
        alternativas.add("0");

        do {
            Collections.shuffle(alternativas);
            imprimir("9)Quantas vezes o Ronaldinho Gaúcho foi campeão da copa do mundo?");
            imprimir("A) " + alternativas.get(0));
            imprimir("B) " + alternativas.get(1));
            imprimir("C) " + alternativas.get(2));
            imprimir("D) " + alternativas.get(3));
            imprimir("E) " + alternativas.get(4));
            imprimir("Escolha uma alternativa: ");
            String resposta = entrada.next();
            resposta = resposta.substring(0, 1).toUpperCase();
            switch (resposta) {
                case "A":
                    if (alternativas.get(0).equals("1")) {
                        imprimir("Resposta correta!");
                        qtRespostasCorretas++;
                    } else {
                        imprimir("Resposta incorreta!");
                        qtRespostasINcorretas++;
                    }
                    acertou = false;
                    break;
                case "B":
                    if (alternativas.get(1).equals("1")) {
                        imprimir("Resposta correta!");
                        qtRespostasCorretas++;
                    } else {
                        imprimir("Resposta incorreta!");
                        qtRespostasINcorretas++;
                    }
                    acertou = false;
                    break;
                case "C":
                    if (alternativas.get(2).equals("1")) {
                        imprimir("Resposta correta!");
                        qtRespostasCorretas++;
                    } else {
                        imprimir("Resposta incorreta!");
                        qtRespostasINcorretas++;
                    }
                    acertou = false;
                    break;
                case "D":
                    if (alternativas.get(3).equals("1")) {
                        imprimir("Resposta correta!");
                        qtRespostasCorretas++;
                    } else {
                        imprimir("Resposta incorreta!");
                        qtRespostasINcorretas++;
                    }
                    acertou = false;
                    break;
                case "E":
                    if (alternativas.get(4).equals("1")) {
                        imprimir("Resposta correta!");
                        qtRespostasCorretas++;
                    } else {
                        imprimir("Resposta incorreta!");
                        qtRespostasINcorretas++;
                    }
                    acertou = false;
                    break;
                default:
                    imprimir("Escolha inválida!");
            }
        } while (acertou);
    }
    
    public static void pergunta10() {

        Scanner entrada = new Scanner(System.in);
        boolean acertou = true;
        List alternativas = new ArrayList();
        alternativas.add("2"); // resposta correta
        alternativas.add("1");
        alternativas.add("5");
        alternativas.add("3");
        alternativas.add("10");

        do {
            Collections.shuffle(alternativas);
            imprimir("10)Quantas vezes o Neymar foi eliminado da copa do mundo?");
            imprimir("A) " + alternativas.get(0));
            imprimir("B) " + alternativas.get(1));
            imprimir("C) " + alternativas.get(2));
            imprimir("D) " + alternativas.get(3));
            imprimir("E) " + alternativas.get(4));
            imprimir("Escolha uma alternativa: ");
            String resposta = entrada.next();
            resposta = resposta.substring(0, 1).toUpperCase();
            switch (resposta) {
                case "A":
                    if (alternativas.get(0).equals("2")) {
                        imprimir("Resposta correta!");
                        qtRespostasCorretas++;
                    } else {
                        imprimir("Resposta incorreta!");
                        qtRespostasINcorretas++;
                    }
                    imprimir("Quantidade de respostas corretas: "+qtRespostasCorretas);
                    imprimir("Quantidade de respostas incorretas: "+qtRespostasINcorretas);
                    acertou = false;
                    break;
                case "B":
                    if (alternativas.get(1).equals("2")) {
                        imprimir("Resposta correta!");
                        qtRespostasCorretas++;
                    } else {
                        imprimir("Resposta incorreta!");
                        qtRespostasINcorretas++;
                    }
                    imprimir("Quantidade de respostas corretas: "+qtRespostasCorretas);
                    imprimir("Quantidade de respostas incorretas: "+qtRespostasINcorretas);
                    acertou = false;
                    break;
                case "C":
                    if (alternativas.get(2).equals("2")) {
                        imprimir("Resposta correta!");
                        qtRespostasCorretas++;
                    } else {
                        imprimir("Resposta incorreta!");
                        qtRespostasINcorretas++;
                    }
                    imprimir("Quantidade de respostas corretas: "+qtRespostasCorretas);
                    imprimir("Quantidade de respostas incorretas: "+qtRespostasINcorretas);
                    acertou = false;
                    break;
                case "D":
                    if (alternativas.get(3).equals("2")) {
                        imprimir("Resposta correta!");
                        qtRespostasCorretas++;
                    } else {
                        imprimir("Resposta incorreta!");
                        qtRespostasINcorretas++;
                    }
                    imprimir("Quantidade de respostas corretas: "+qtRespostasCorretas);
                    imprimir("Quantidade de respostas incorretas: "+qtRespostasINcorretas);
                    acertou = false;
                    break;
                case "E":
                    if (alternativas.get(4).equals("2")) {
                        imprimir("Resposta correta!");
                        qtRespostasCorretas++;
                    } else {
                        imprimir("Resposta incorreta!");
                        qtRespostasINcorretas++;
                    }
                    imprimir("Quantidade de respostas corretas: "+qtRespostasCorretas);
                    imprimir("Quantidade de respostas incorretas: "+qtRespostasINcorretas);
                    acertou = false;
                    break;
                default:
                    imprimir("Escolha inválida!");
            }
        } while (acertou);
    }
}
