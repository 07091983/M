package org.example;
public abstract class MainComponent {

    public void add(MainComponent mainComponent){
        throw new UnsupportedOperationException();
    }

    public String getName(){
        throw new UnsupportedOperationException();
    }

    public Integer getPages(){
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }
}
