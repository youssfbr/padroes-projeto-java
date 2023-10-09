package com.github.youssfbr.gof;

/**
 * Singleton "lazy holder"
 *
 * @see <a href="https://stackoverflow.com/a/24018148">Referencia</a>
 */
public class SingletonLazyHolder {

    private static class Holder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {
        return Holder.instancia;
    }

}
