package com.bartt.liczby;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Random;
import java.util.stream.Stream;

public class HelloController {
    public Button btn1;
    public Label lb2;
    public Label lb1;
    public Label lb3;
    public Button btn2;
    public TextField txt1;


    Random random = new Random();


    @FXML
    public void initialize()
    {
       liczenie();
    }

    @FXML
    public void liczenie()
    {
        int a = random.nextInt(99) + 1;
        int b = random.nextInt(99) + 1;
        int dzialanie = random.nextInt(3) + 1;

        Stream.of(lb1, lb2, lb3).forEach(lb -> lb.setVisible(true));
            lb1.setText("" + a);
            lb3.setText("" + b);

            if(dzialanie == 1)
            {
                lb2.setText("+");
            }
            else if(dzialanie == 2)
            {
                lb2.setText("-");
            }
            else if( dzialanie == 3)
            {
                lb2.setText("*");
            }


    }
    public void Click(ActionEvent actionEvent)
    {
        //dodaje lub odejmuje punkty
    }

    public void Koniec(ActionEvent actionEvent)
    {
       //wyswietla wynik i zakonczenie
    }
}