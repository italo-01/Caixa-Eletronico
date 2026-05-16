package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        Caixa caixa = new Caixa(0);

        System.out.println("-".repeat(30));
        System.out.println(Caixa.centralizar("CAIXA ELETRONICO", 30));
        System.out.println("-".repeat(30));

        System.out.println("Saldo atual R$: " + caixa.getSaldo());
        System.out.print("Deposite um valor para começar: ");
        double depositar = user.nextDouble();
        caixa.depositar(depositar);

        while (true){
            System.out.println("-".repeat(30));
            System.out.println(caixa.centralizar("Selecione uma opção", 30));
            System.out.println("-".repeat(30));
            System.out.println("1 - Sacar" +
                    "\n2 - Depositar" +
                    "\n3 - Saldo" +
                    "\n4 - Extrato" +
                    "\n5 - Sair");
            int res = user.nextInt();
            if (res != 1 && res !=2 && res != 3 && res != 4 && res != 5){
                System.out.println("Opção não encontarda.");
            }else {
                switch (res) {
                    case 1:
                        System.out.print("Valor do saque R$: ");
                        double valorsaque = user.nextDouble();
                        String saque = caixa.sacar(valorsaque);
                        System.out.println(saque);
                        break;

                    case 2:
                        System.out.print("Valor a depositar: ");
                        double deposito = user.nextDouble();
                        String valordeposito = caixa.depositar(deposito);
                        System.out.println(valordeposito);
                        break;

                    case 3:
                        System.out.println("Consultando saldo....");
                        System.out.println(String.format("Saldo atual R$: %.2f", caixa.getSaldo()));
                        break;

                    case 5:

                }
            }
        }
    }
}