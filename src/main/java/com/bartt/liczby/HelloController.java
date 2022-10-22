package com.bartt.liczby;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
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
    int punkty = 0;
    int wynik;

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
                wynik = a+b;
            }
            else if(dzialanie == 2)
            {
                lb2.setText("-");
                wynik = a-b;
            }
            else if( dzialanie == 3)
            {
                lb2.setText("*");
                wynik = a*b;
            }
    }
    public void Click(ActionEvent actionEvent)
    {
        //dodaje lub odejmuje punkty
        int odpowiedz;

        try {
            odpowiedz = Integer.parseInt(txt1.getText());

        } catch (Exception exception) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setHeaderText("Coś się nie zgadza");
            alert.showAndWait();
            return;
        }

        if (odpowiedz == wynik)
        {
            punkty = punkty + 5;
        }
        else
        {
            punkty = punkty - 10;
        }

        liczenie();
    }

    public void Koniec()
    {
       //wyswietla wynik i zakonczenie
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("WYNIK");
        alert.setHeaderText("Twój wynik to:" + punkty);
        alert.showAndWait();
    }
}