package org.example;

import java.util.Random;

public class Cofrinho {

    private String dono;
    private Double saldo = 0.0;
    private Boolean quebrado = false;

    public Cofrinho(String dono) {
        this.dono = dono;
        saldo = 0.0;
        quebrado = false;
    }

    public void depositor (Double valor) {
        if (!quebrado) {
            saldo += valor;
        }
    }

    public Double sacar(Double valor) {
        if (!quebrado && saldo > valor) {
            saldo -= valor;
            return valor;
        } else {
            return 0.0;
        }
    }

    public Double quebrar() {
        if (quebrado) {
            return 0.0;
        } else {
            quebrado = true;
            Double saldoQuebrado = saldo;
            saldo = 0.0;
            return saldoQuebrado;
        }
    }

    public Double sacudir() {
        if (!quebrado && saldo > 0){
            Random aleatorio = new Random();
            Double valorCaido = aleatorio.nextDouble();
            saldo -= valorCaido;
            return valorCaido;
        } else {
            return 0.0;
        }
    }

    public Boolean isMaiorQue(Cofrinho cofrinho) {
        if (saldo > cofrinho.saldo) {
            return true;
        } else {
            return false;
        }
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Boolean getQuebrado() {
        return quebrado;
    }
}