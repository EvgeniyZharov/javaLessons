package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    private int comand_1 = 0;
    private int comand_2 = 0;
    private String comand_name_1 = "Milan";
    private String comand_name_2 = "Madrid";

    @FXML
    private Button startGame;
    @FXML
    private Button btnCom1;
    @FXML
    private Button btnCom2;


    @FXML
    private Label startText;
    @FXML
    private Label result;
    @FXML
    private Label lastScore;
    @FXML
    private Label winner;

    @FXML
    protected void onStartButtonClick() {

        startText.setText("Game started.");
        result.setText("Result:" + comand_1 + "x" + comand_2);
        lastScore.setText("Last Scorer:");
        winner.setText("Winner:");
        startGame.setVisible(false);
        btnCom1.setVisible(true);
        btnCom2.setVisible(true);

    }

    @FXML
    protected void onCommandClick1(){
        comand_1++;
        result.setText("Result:" + comand_1 + "x" + comand_2);
        lastScore.setText("Last Scorer:" + comand_name_1);
        if (comand_1 > comand_2) {
            winner.setText("Winner: " + comand_name_1);
        }
    }

    @FXML
    protected void onCommandClick2(){
        comand_2++;
        result.setText("Result:" + comand_1 + "x" + comand_2);
        lastScore.setText("Last Scorer:" + comand_name_2);
        if (comand_1 < comand_2) {
            winner.setText("Winner: " + comand_name_2);
        }
    }

}