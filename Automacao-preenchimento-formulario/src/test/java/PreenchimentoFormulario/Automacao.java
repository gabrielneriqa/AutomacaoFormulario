package PreenchimentoFormulario;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;


public class Automacao {
    @Test

    public void testpreencherformulario() throws InterruptedException {
        //Abrindo o Firefox
        System.setProperty("webdriver.gecko.driver","C:\\Users\\gabri\\Drivers\\geckodriver.exe");
        WebDriver navegador = new FirefoxDriver();
        Thread.sleep(10000);
        navegador.manage().window().maximize();

        //Entrando no Site de teste
        navegador.get("http://sampleapp.tricentis.com/101/app.php");
        WebElement dropdown = navegador.findElement(By.id("make"));
        Select selectObject = new Select(dropdown);
        selectObject.selectByValue("Porsche");

        //Selecionando a marca do veículo
        WebElement dropdown1 = navegador.findElement(By.id("model"));
        Select selectObject1 = new Select(dropdown1);
        selectObject1.selectByValue("Motorcycle");

        //Selecionando a potência do veículo
        navegador.findElement(By.id("cylindercapacity")).sendKeys("200");
        navegador.findElement(By.id("engineperformance")).sendKeys("2000");

        //Informando a data de fabricação do veículo
        navegador.findElement(By.id("dateofmanufacture")).sendKeys("10/10/2000");

        //Informando o número de assentos do veículo
        WebElement dropdown2 = navegador.findElement(By.id("numberofseats"));
        Select selectObject2 = new Select(dropdown2);
        selectObject2.selectByValue("2");


        WebElement radiobutton1 = navegador.findElement(By.xpath("//label[1]/span[@class='ideal-radio']"));
        radiobutton1.click();

        WebElement dropdown3 = navegador.findElement(By.id("numberofseatsmotorcycle"));
        Select selectObject3 = new Select(dropdown3);
        selectObject3.selectByValue("2");

        WebElement dropdown4 = navegador.findElement(By.id("fuel"));
        Select selectObject4 = new Select(dropdown4);
        selectObject4.selectByValue("Petrol");

        navegador.findElement(By.id("payload")).sendKeys("10.000");

        navegador.findElement(By.id("totalweight")).sendKeys("20000");

        navegador.findElement(By.id("listprice")).sendKeys("100000");

        navegador.findElement(By.id("licenseplatenumber")).sendKeys("PMA-2222");

        navegador.findElement(By.id("annualmileage")).sendKeys("200.000");

        navegador.findElement(By.id("nextenterinsurantdata")).click();

        navegador.findElement(By.id("firstname")).sendKeys("Gabriel");

        navegador.findElement(By.id("lastname")).sendKeys("Neri");

        navegador.findElement(By.id("birthdate")).sendKeys("08/16/1996");

        WebElement radiobutton2 = navegador.findElement(By.xpath("//label[1]/span[@class='ideal-radio']"));
        radiobutton2.click();

        navegador.findElement(By.id("streetaddress")).sendKeys("Vilebaldo Aguiar");

        WebElement dropdown5 = navegador.findElement(By.id("country"));
        Select selectObject5 = new Select(dropdown5);
        selectObject5.selectByValue("Brazil");

        navegador.findElement(By.id("zipcode")).sendKeys("60192035");
        
        navegador.findElement(By.id("city")).sendKeys("Fortaleza");

        WebElement dropdown6 = navegador.findElement(By.id("occupation"));
        Select selectObject6 = new Select(dropdown6);
        selectObject6.selectByValue("Employee");

        WebElement radiobutton3 = navegador.findElement(By.xpath("//label[1]/span[@class='ideal-check']"));
        radiobutton3.click();

        WebElement radiobutton4 = navegador.findElement(By.xpath("//label[3]/span[@class='ideal-check']"));
        radiobutton4.click();

        WebElement radiobutton5 = navegador.findElement(By.xpath("//label[5]/span[@class='ideal-check']"));
        radiobutton5.click();

        navegador.findElement(By.id("website")).sendKeys("https://www.linkedin.com/in/gabriel-neri-36b25b242/");

        WebElement nomearquivo = navegador.findElement(By.id("picturecontainer"));
        nomearquivo.sendKeys("C:\\Users\\gabri\\OneDrive\\Área de Trabalho\\Foto de perfil profissional.jpg");

        navegador.findElement(By.id("nextenterproductdata")).click();

        navegador.findElement(By.id("startdate")).sendKeys("10/25/2022");

        WebElement dropdown7 = navegador.findElement(By.id("insurancesum"));
        Select selectObject7 = new Select(dropdown7);
        selectObject7.selectByValue("15000000");

        WebElement dropdown8 = navegador.findElement(By.id("meritrating"));
        Select selectObject8 = new Select(dropdown8);
        selectObject8.selectByValue("Bonus 7");

        WebElement dropdown9 = navegador.findElement(By.id("damageinsurance"));
        Select selectObject9 = new Select(dropdown9);
        selectObject9.selectByValue("Full Coverage");

        WebElement radiobutton6 = navegador.findElement(By.xpath("//label[1]/span[@class='ideal-check']"));
        radiobutton6.click();

        WebElement dropdown10 = navegador.findElement(By.id("courtesycar"));
        Select selectObject10 = new Select(dropdown10);
        selectObject10.selectByValue("Yes");

        navegador.findElement(By.id("nextselectpriceoption")).click();


        WebElement radiobutton7 = navegador.findElement(By.xpath("//label[4]/span[@class='ideal-radio']"));
        radiobutton7.click();

        navegador.findElement(By.id("nextsendquote")).click();


        navegador.findElement(By.id("email")).sendKeys("gabriel.neri.qa@gmail.com");

        navegador.findElement(By.id("phone")).sendKeys("9998142470");

        navegador.findElement(By.id("username")).sendKeys("gabrielneriqa");

        navegador.findElement(By.id("password")).sendKeys("123456789Ab");

        navegador.findElement(By.id("confirmpassword")).sendKeys("123456789Ab");

        navegador.findElement(By.id("Comments")).sendKeys("Very good!");

        navegador.findElement(By.id("sendemail")).click();

        Thread.sleep(10000);

        navegador.close();

        }





    }

