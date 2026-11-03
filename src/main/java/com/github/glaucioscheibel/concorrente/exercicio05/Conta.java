package com.github.glaucioscheibel.concorrente.exercicio05;

import java.util.Objects;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Conta {
    private int id;
    private double saldo;
    private final Lock lock;

    public Conta(int id, double saldo) {
        this.id = id;
        this.saldo = saldo;
        this.lock = new ReentrantLock();
    }

    public void deposito(double valor) {
        saldo = saldo + valor;
    }

    public void saque(double valor) {
        saldo = saldo - valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void lock() {
        lock.lock();
    }

    public void unlock() {
        lock.unlock();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Conta conta)) {
            return false;
        }
        return id == conta.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Conta{id=" + id + ", saldo=" + saldo + '}';
    }
}
