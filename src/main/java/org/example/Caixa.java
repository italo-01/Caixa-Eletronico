package org.example;

import java.util.ArrayList;

public class Caixa {
    // Atributos
    private double sacar;
    private double depositar;
    private double saldo;
    private double extrato;

    //Constrtutor
    public Caixa(double saldo){
        this.saldo = 0;
        //this.extrato = 0;
    }

    //Metodos
    public static String centralizar(String texto, int largura) {
        int centro = (largura + texto.length()) / 2;
        return String.format("%" + centro + "s", texto);
    }

    public String sacar(double saque){
        if (saque > this.getSaldo() ){
            return "Valor idisponivel para o saque!";
        } else{
            this.setSaldo(this.getSaldo() - saque);
            return "Saque realizado com sucesso.";
        }
    }
    public String depositar(double deposito){
        this.setSaldo(this.getSaldo() + deposito);
        return "Valor depositado com sucesso.";
    }

    public double saldo(){
        return this.getSaldo();
    }

    public ArrayList<Caixa> extrato(){
        return null;
    }

    //Metodos especiais
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getDepositar() {
        return depositar;
    }

    public void setDepositar(double depositar) {
        this.depositar = depositar;
    }

    public double getSacar() {
        return sacar;
    }

    public void setSacar(double sacar) {
        this.sacar = sacar;
    }
}
