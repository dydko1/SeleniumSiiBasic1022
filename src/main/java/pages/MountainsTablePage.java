package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class MountainsTablePage {
    public MountainsTablePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "tbody tr")
    private List<WebElement> allRows;


    public List<MountainRowPage> getAllMountains(){
        List<MountainRowPage> allMountains = new ArrayList<>();
        for (WebElement row : allRows){
            allMountains.add(new MountainRowPage(row));
        }
        return allMountains;
    }
}