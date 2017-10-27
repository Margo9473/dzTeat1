import org.junit.*;

public class Untitled3 extends RulSber {


    @Test
    public void testUntitled2() throws Exception {

        goToMainPage()
                .selectPolic()
                .clickKnowMore()
                .selectOntinePolic()
                .selectMinPrice()
                .fillFormsAndClick()
                .dataChecking()
                .checkErorr();
    }

}
