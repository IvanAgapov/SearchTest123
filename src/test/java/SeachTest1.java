import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Configuration.startMaximized;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.files.DownloadActions.click;

public class SeachTest1 {

    @BeforeAll
static void setup() {
        Configuration.baseUrl = "https://demoqa.com";
        startMaximized = true;
    }
    @Test

    void positiveFillTest() {
        open("/automation-practice-form");
        $("#firstName").setValue("Ivan");
        $("#lastName").setValue("Agapov");
        $("#userEmail").setValue("agapoviv94@mail.ru");
        $(byText("Male")).click();
        $("#userNumber").setValue("+79650205743");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOptionByValue("4");
        $(".react-datepicker__year-select").selectOptionByValue("1994");
        $(".react-datepicker__day--011").click();
        $("#subjectsInput").click();
        $("#subjectsInput").setValue("Histor").pressEnter();
        $("#hobbiesWrapper").$(byText("Music")).click();
        $("#uploadPicture").uploadFile(new File("src/test/java/scale_1200.jpg"));
        $("#currentAddress").setValue("Gagarina Street");
        $("# css-tlfecz-indicatorContainer").setValue("Gagarina Street");

















    }
}
