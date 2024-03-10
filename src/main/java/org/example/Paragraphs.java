package org.example;
import java.util.ArrayList;

public class Paragraphs extends MainComponent{
    ArrayList<MainComponent> mainComponents = new ArrayList<MainComponent>();
    String name;
    Integer pages;

    public Paragraphs(String name,Integer pages){

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
    public void print() {
        System.out.print("  " + getName());
        for (int i = 0; i < 68-getName().length(); i++) {
            System.out.print(".");
        }
        System.out.println(getPages());
    }


}
