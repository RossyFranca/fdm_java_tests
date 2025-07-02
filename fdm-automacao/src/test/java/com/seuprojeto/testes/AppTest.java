package com.seuprojeto.testes;

import static org.junit.Assert.assertTrue;


import com.seuprojeto.testes.pages.DefaultPage;
import com.seuprojeto.testes.pages.LoginPage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */


    LoginPage defaultPage = new LoginPage();

    @Test
    public void seleniumTest()
    {
        defaultPage.navigateTo("http://tor_hml.fadami.net.br:8081/tor_homologacao_legado_EixoSp/Login.aspx");
        defaultPage.fillLogin("Fadami","Fadami@12");

    }


}
