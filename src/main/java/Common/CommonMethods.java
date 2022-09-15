package Common;

import static com.codeborne.selenide.Selenide.open;

public class CommonMethods {

    public static void openPage(String url) {
        System.out.println(url);
        open(url);
    }
}
