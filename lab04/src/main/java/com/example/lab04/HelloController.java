package com.example.lab04;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label SubmitLabel;

    // Response TextFields
    @FXML
    private TextField UsernameTextField;
    @FXML
    private TextField FullNameTextField;
    @FXML
    private TextField EmailTextField;
    @FXML
    private TextField PhoneTextField;
    @FXML
    private DatePicker DateField;

    // Password Field
    @FXML
    private PasswordField PasswordTextField;

    // Default Button Response
    @FXML
    protected void RegisterSubmitButton() {
        SubmitLabel.setText("Welcome to JavaFX Application!");
    }

    // Lab Button Response
    @FXML
    protected void LabSubmitButton(ActionEvent event) {
        // Error catching through missing details
        if (UsernameTextField.getText() == "") {
            System.out.println("Error, no username");
        }
        else if (PasswordTextField.getText() == "") {
            System.out.println("Error, no password");
        }
        else if (FullNameTextField.getText() == "") {
            System.out.println("Error, no name");
        }
        else if (EmailTextField.getText() == "") {
            System.out.println("Error, no email");
        }
        else if (PhoneTextField.getText() == "" || PhoneTextField.getLength() != 10) {
            System.out.println("Error, invalid phone number");
        }
        else {
            // Print registration outputs onto console
            System.out.println("-- Registration Successful --");
            System.out.println("Username: " + UsernameTextField.getText());
            System.out.println("Name: " + FullNameTextField.getText());
            System.out.println("E-Mail Address: " + EmailTextField.getText());
            // Phone number formatting
            String phone = PhoneTextField.getText();
            System.out.println("Phone: " + phone.substring(0,3) + "-" + phone.substring(3,6) + "-" + phone.substring(6,10));
            System.out.println("Date of Birth: " + DateField.getValue());

            return;
        }
    }


}