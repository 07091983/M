package org.example;
import java.util.ArrayList;
import java.util.Iterator;

public class Contens extends MainComponent{
    ArrayList<MainComponent> mainComponents = new ArrayList<MainComponent>();
    String name;
    Integer pages;

    public Contens(String name,Integer pages){

        this.name = name;
        this.pages = pages;
    }

    public void add(MainComponent mainComponent){
        mainComponents.add(mainComponent);
    }
    public String getName(){
        return name;
    }
    public Integer getPages(){
        return pages;
    }
