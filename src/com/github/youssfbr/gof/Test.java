package com.github.youssfbr.gof;

import com.github.youssfbr.gof.singleton.SingletonEager;
import com.github.youssfbr.gof.singleton.SingletonLazy;
import com.github.youssfbr.gof.singleton.SingletonLazyHolder;
import com.github.youssfbr.gof.strategy.*;

public class Test {
    public static void main(String[] args) {

        // Testes relacionados ao Design Pattern

        // Singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        lazy = SingletonLazy.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);


        // Strategy

        IComportamento defensivo = new ComportamentoDefensivo();
        IComportamento normal = new ComportamentoNormal();
        IComportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setStrategy(normal);
        robo.mover();
        robo.mover();
        robo.setStrategy(defensivo);
        robo.mover();
        robo.setStrategy(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();
    }
}
