package com.makhnovetc.ifmo.soap.lab1.client;

public class ProxyWrapper<T> {
    private final T item;

    public ProxyWrapper(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}
