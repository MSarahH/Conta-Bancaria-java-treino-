/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contabancaria;



 public class ContaBancaria {
    // Atributos privados 
    private String numero; 
    private String titular; 
    private double saldo;
    
    // Construtor 
    public ContaBancaria(String numero, String titular, double saldoInicial) { 
        this.numero = numero; 
        this.titular = titular; 
        this.saldo = saldoInicial; }
    
    // Getters 
    public String getNumero() { 
        return numero; }
    public String getTitular() { 
        return titular; }
    public double getSaldo() { 
        return saldo; }
    
    // Setters (sem setSaldo!) 
    public void setNumero(String numero) { 
        this.numero = numero; }
    public void setTitular(String titular) { 
        this.titular = titular; }
    
    // Métodos para modificar o saldo 
    public void depositar(double valor) { 
        if (valor > 0) { saldo += valor; System.out.println("Depósito realizado: R$ " + valor); } 
        else { 
            System.out.println("Valor de depósito inválido!"); 
        } 
    }
    public void sacar(double valor) { 
        if (valor > 0 && valor <= saldo) { 
            saldo -= valor; System.out.println("Saque realizado: R$ " + valor); } 
        else { 
            System.out.println("Saldo insuficiente ou valor inválido!"); 
        } 
    }
}