package com.github.youssfbr.gof.strategy;

public class ComportamentoAgressivo implements IComportamento {
    @Override
    public void mover() {
        System.out.println("Movendo-se agressivamente...");
    }
}
