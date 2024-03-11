package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
     public static void main(String[] args) {
        MainComponent contens = new Contens("Содержание",1);
        MainComponent monday = new Contens(" 1. Понедельник", 2);
        MainComponent tuesday = new Contens(" 2.Вторник", 7);

        contens.add(monday);
        contens.add(tuesday);

        System.out.println("\"Ангел для сестры\" Джоди Пиколт, 2020");

        Book book = new Book(contens);

        //У Вас тут будет UnsupportedOperationException, т.к. в классе Contens Вы не переопределили метод print из интерфейса MainComponent  
        book.printContents();

    }
    }
}
