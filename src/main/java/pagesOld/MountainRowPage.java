package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

public class MountainRowPage {
    public MountainRowPage(WebElement row) {
        PageFactory.initElements(new DefaultElementLocatorFactory(row), this);
    }

    @FindBy(xpath = "./td[1]")
    private WebElement name;

    @FindBy(xpath = "./td[2]")
    private WebElement mountainRange;

    @FindBy(xpath = "./td[3]")
    private WebElement state;

    @FindBy(xpath = "./td[4]")
    private WebElement height;

    @Override
    public String toString() {
        return "MountainRowPage{" +
                "name=" + name.getText() +
                ", mountainRange=" + mountainRange.getText() +
                ", state=" + state.getText() +
                ", height=" + height.getText() +
                '}';
    }

    public String getName() {
        return name.getText();
    }

    public String getMountainRange() {
        return mountainRange.getText();
    }

    public String getState() {
        return state.getText();
    }

    public int getHeight() {
        return Integer.parseInt(height.getText());
    }
}
