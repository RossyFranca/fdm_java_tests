package com.seuprojeto.testes.pages;

import org.openqa.selenium.By;

public class LoginPage extends DefaultPage{

    private final By inputUser = By.id("txtLogin");
    private final By inputPassword = By.id("txtSenha");
    private final By enterButton = By.id("btnLogin");


    public void fillLogin(String user, String password){

        inputText(inputUser,user);
        inputText(inputPassword,password);
        click(enterButton);
    }
}
