package com.example.program6;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.Collections;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        System.out.println("PROGRAM TO DELIVER CARDS TO THREE PEOPLE");

        ArrayList<String> set = new ArrayList<>();
        String[] palos = {"Hearts", "Spades", "Clubs", "Diamonds"};
        String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        for (String symbol : palos) {
            for (String number : numbers) {
                set.add(number + " of " + symbol);
            }
        }
        Collections.shuffle(set);
        ArrayList<String> person1 = new ArrayList<>();
        ArrayList<String> person2 = new ArrayList<>();
        ArrayList<String> person3 = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            person1.add(set.remove(0));
            person2.add(set.remove(0));
            person3.add(set.remove(0));
        }

        for (int i = 0; i < 4; i++) {
            person1.add(set.remove(0));
            person2.add(set.remove(0));
            person3.add(set.remove(0));
        }

        System.out.println("Cards for person 1: " + person1);
        System.out.println("Cards for person 2: " + person2);
        System.out.println("Cards for person 3: " + person3);
    }
}
