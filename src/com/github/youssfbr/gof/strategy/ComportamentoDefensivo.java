package com.github.youssfbr.gof.strategy;

public class ComportamentoDefensivo implements IComportamento {
    @Override
    public void mover() {
        System.out.println("Movendo-se defensivamente...");
    }
}
