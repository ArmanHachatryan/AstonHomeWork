package org.aston.exercise.pages.home;

import org.aston.exercise.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    private final By cardLowerPriceLocator = By.xpath("//article/.//ins");
    private final By cardProductNameLocator = By.xpath("//span[@class='product-card__name']");
    private final By cardBtnAddToBasketLocator = By.className("product-card__add-basket");
    private List<String> productNames;
    private List<String> lowerPrices;

    public HomePage addToBasket(int count) {
        //беру названия из карточки
        List<WebElement> cardProductNames = driver.findElements(cardProductNameLocator);
        productNames = cardProductNames.stream()
                .limit(count)
                .map(p -> p.getAttribute("innerText").split("/")[1].trim())
                .collect(Collectors.toList());

        List<WebElement> cardLowerPrices = driver.findElements(cardLowerPriceLocator);
        lowerPrices = cardLowerPrices.stream()
                .limit(count)
                .map(p -> p.getText())
                .collect(Collectors.toList());

        List<WebElement> btn = driver.findElements(cardBtnAddToBasketLocator);
        btn.stream().limit(count).forEach(WebElement::click);
        return this;
    }

    public HomePage clickBtn() {
        driver.findElement(cardBtnAddToBasketLocator).click();


        return this;
    }
}
