package edu.estudos;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); // Usando padrão Norte Americano

        System.out.println();
        System.out.print("/==================== SIMULAÇÃO CONTA BANCO ====================/");
        System.out.println();

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();
        System.out.println();

        System.out.print("Por favor, digite o número da Conta: ");
        String numero = scanner.nextLine();
        System.out.println();

        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();
        System.out.println();

        System.out.print("Por favor, digite o saldo da Conta: ");
        double saldo = scanner.nextDouble();
        System.out.println();

        System.out.print("/================================================================/");
        System.out.println();
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo é R$" + saldo);
        System.out.println("Seu saldo já está disponível para saque.");
        System.out.print("/================================================================/");

        scanner.close();
    }

}