import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestOnliner {

    WebDriver driver;

    @BeforeAll
    static void loadDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setupDriver() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.onliner.by/");
        Thread.sleep(3000);
        driver.manage().window().maximize();
    }

    @Test
    void findEl1Test() {
        driver.findElement(By.xpath("//a[@class='auth-bar__item auth-bar__item--cart' and @href='https://cart.onliner.by']")).click();
        driver.quit();
    }

    @Test
    void findEl2Test() throws InterruptedException {
        driver.findElement(By.xpath("//div[contains(@class,'auth-bar__item') and contains(text(),'Вход')]")).click();
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    void findEl3Test() throws InterruptedException {
        driver.findElement(By.xpath("//a[@class='b-main-page-tabs__item' and contains(text(),'Киберспорт')]")).click();
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    void findEl4Test() throws InterruptedException {
        driver.findElement(By.xpath("//a[@href='https://catalog.onliner.by/superprice' and @class='b-main-navigation__advert b-main-navigation__advert_primary']")).click();
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    void findEl5Test() throws InterruptedException {
        driver.findElement(By.xpath("//span[@class='b-main-navigation__text' and contains(text(),'Автобарахолка')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@class='project-navigation__sign' and contains(text(),'Отзывы об авто')]")).click();
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    void findEl6Test() throws InterruptedException {
        driver.findElement(By.xpath("//h2/a[@href='https://money.onliner.by']")).click();
        Thread.sleep(1000);
        driver.quit();

    }

    @Test
    void findEl7Test() throws InterruptedException {
        driver.findElement(By.xpath("//li/a[contains(text(),'О компании')]")).click();
        Thread.sleep(1000);
        driver.quit();

    }

    @Test
    void findEl8Test() throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(@class,'yt')]")).click();
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    void findEl9Test() throws InterruptedException {
        driver.findElement(By.xpath("//a[@class='footer-3-links all-news-link']")).click();
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    void findEl10Test() throws InterruptedException {
        driver.findElement(By.xpath("//a[@class='b-main-page-tabs__item' and contains(text(),'Наши соцсети')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='widget-1-505']//a[@class='b-tile-main']")).click();
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    void findEl11Test() throws InterruptedException {
        driver.findElement(By.xpath("//span[@class='b-main-navigation__text' and contains(text(),'Услуги')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@class='service-form__checkbox-sign ng-binding' and text()='Минск']/../../span[@class='i-checkbox__faux']")).click();
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    void findEl12Test() throws InterruptedException {
        driver.findElement(By.xpath("//input[@class='fast-search__input']")).sendKeys("iPhone");
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    void findEl13Test() throws InterruptedException {
        driver.findElement(By.xpath("//a[@href='https://baraholka.onliner.by/']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='fleaMarketSearchInput']")).click();
        driver.findElement(By.xpath("//button[@value='Найти']")).click();
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    void findEl14Test() throws InterruptedException {
        driver.findElement(By.xpath("//a[@href='https://baraholka.onliner.by/']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//h3[contains(text(),'Телефоны')]/..//a[text()='Мобильные телефоны']")).click();
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    void findEl15Test() throws InterruptedException {
        driver.findElement(By.xpath("//a[@href='https://baraholka.onliner.by/']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@class='project-navigation__text']/span[1]")).click();
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    void findEl16Test() throws InterruptedException {
        driver.findElement(By.xpath("//a[@href='https://baraholka.onliner.by/']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div [@class='b-top-logo']/a[@href='https://www.onliner.by']")).click();
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    void findEl17Test() throws InterruptedException {
        driver.findElement(By.xpath("//a[@href='https://baraholka.onliner.by/']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//h3[contains(text(),'Недвижимость')]/..//a[text()='Продажа квартир']")).click();
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    void findEl18Test() throws InterruptedException {
        driver.findElement(By.xpath("//div[@class='auth-bar__item auth-bar__item--text']")).click();
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    void findEl19Test() throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(text(),'Все новости об автомобилях')]")).click();
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    void findEl20Test() throws InterruptedException {
        driver.findElement(By.xpath("//div[@id='widget-1-1']/a")).click();
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    void findEl21Test() throws InterruptedException {
        driver.findElement(By.xpath("//a[@href='https://ab.onliner.by/create?utm_source=onliner&utm_medium=main_page&utm_content=create']")).click();
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    void findEl22Test() throws InterruptedException {
        driver.findElement(By.xpath("//a[@class='btn-green-2 btn']")).click();
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    void findEl23Test() throws InterruptedException {
        driver.findElement(By.xpath("//span[@class='b-main-navigation__text' and contains(text(),'Каталог')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//ul[@class='catalog-navigation-classifier catalog-navigation-classifier_brand']/li[@data-id='brand-0']")).click();
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    void findEl24Test() throws InterruptedException {
        driver.findElement(By.xpath("//ul[@class='footer-style__list']//a[contains(text(),'Контакты редакции')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[contains(text(),'Как быстро связаться с редакцией')]")).click();
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    void findEl25Test() throws InterruptedException {
        driver.findElement(By.xpath("//ul[@class='footer-style__list']//a[contains(text(),'Контакты редакции')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@class='project-navigation__tooltip']")).click();
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    void findEl26Test() throws InterruptedException {
        driver.findElement(By.xpath("//div[@class='b-ab-line m-1']//div[@class='btn-group']/a[1]")).click();
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    void findEl27Test() throws InterruptedException {
        driver.findElement(By.xpath("//footer[@class='b-main-page-blocks-footer-3 b-main-page-blocks-footer-3_specific cfix']/a[contains(text(),'Все о лайфстайле')]")).click();
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    void findEl28Test() throws InterruptedException {
        driver.findElement(By.xpath("//a[@class='b-top-navigation-informers__link']/i[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@class='js-weather-city']/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='b-weather__city-select js-weather-city-list js-visible']//a[contains(text(),'Брест')]")).click();
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    void findEl29Test() throws InterruptedException {
        driver.findElement(By.xpath("//div[@class='catalog-offers__list swiper-wrapper']/div[1]/div[@class='catalog-offers__title']")).click();
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    void findEl30Test() throws InterruptedException {
        driver.findElement(By.xpath("//a[@id='moneyRate']")).click();
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    void findEl31Test() throws InterruptedException {
        driver.findElement(By.xpath("//div[@class='b-main-page-grid-4 b-main-page-news-2']//a[contains(text(),'Кошелек')]")).click();
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    void findEl32Test() throws InterruptedException {
        driver.findElement(By.xpath("//a[@id='moneyRate']")).click();
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    void findEl33Test() throws InterruptedException {
        driver.findElement(By.xpath("//span[@class='b-main-navigation__text' and contains(text(),'Каталог')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='tiles tiles_grid_4']/div[1]/div[1]//a")).click();
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    void findEl34Test() throws InterruptedException {
        driver.findElement(By.xpath("//span[@class='b-main-navigation__text' and contains(text(),'Форум')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='h-hottopics']/ul/li[1]/h3/a[1]")).click();
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    void findEl35Test() throws InterruptedException {
        driver.findElement(By.xpath("//span[@class='b-main-navigation__text' and contains(text(),'Форум')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@id='fid7']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[contains(@href,'./viewforum') and text()='Мобильные телефоны']")).click();
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    void findEl36Test() throws InterruptedException {
        driver.findElement(By.xpath("//span[@class='b-main-navigation__text' and contains(text(),'Форум')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='h-hottopics']/ul[1]/li[1]/span[1]//a[@class='gray']")).click();
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    void findEl37Test() throws InterruptedException {
        driver.findElement(By.xpath("//span[@class='b-main-navigation__text' and contains(text(),'Дома и квартиры')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='arenda-map__control arenda-map__control_fullscreen']")).click();
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    void findEl38Test() throws InterruptedException {
        driver.findElement(By.xpath("//span[@class='b-main-navigation__text' and contains(text(),'Дома и квартиры')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@class='filter__item-inner filter__item-inner_left']")).click();
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    void findEl39Test() throws InterruptedException {
        driver.findElement(By.xpath("//span[@class='b-main-navigation__text' and contains(text(),'Дома и квартиры')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@class='pagination__main']")).click();
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    void findEl40Test() throws InterruptedException {
        driver.findElement(By.xpath("//span[@class='b-main-navigation__text' and contains(text(),'Дома и квартиры')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='classifieds-list']/div[1]//a[@class='classified__handle']")).click();
        Thread.sleep(1000);
        driver.quit();
    }
}
