package homework12;
import com.rd.family.Man;
import com.rd.family.Woman;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class FamilyDataProvTest {
    private Woman woman;
    private Man man;
    @BeforeMethod
    public void creatingPerson(){
        woman = new Woman("Andrea", "Larson", 40, "Alex", "doctor", "Smith", "Larson");
        man = new Man("Alex", "Smith", 65, "Andrea", "carpenter", "Larson", null );
    }
    @DataProvider(name = "gettingWomanFirstName")
    public static Object[][] gettingWomanFirstName() {
        return new Object[][]{
                {"Andrea", true},
                {"Elsa", false},
        };
    }
    @Test (dataProvider = "gettingWomanFirstName")
    public void GettingWomanFirstName(String name, boolean message) {
        Assert.assertEquals(woman.getFirstName(), "Andrea", "This the wrong name" );
    }
    @DataProvider(name = "gettingMaidenName")
    public static Object[][] gettingMaidenName() {
        return new Object[][]{
                {"Larson", true},
                {"Smith", false},
        };
    }
    @Test (dataProvider = "gettingMaidenName")
    public void gettingMaidenName(String maidenname, boolean message){
        Assert.assertEquals(maidenname, woman.getMaidenName(), "Woman doesn't want to get divorced");
    }
    @DataProvider(name = "partnershipData")
    public static Object[][] getPartnershipData() {
        return new Object[][]{
                {"Smith", true},
                {"Larson", true},
                {null, false}
        };
    }
    @Test(dataProvider = "partnershipData")
    public void testRegisterPartnership(String partnerLastName, boolean message) {
       Assert.assertEquals(partnerLastName, woman.getPartnerLastName(), "Woman doesn't want to be a wife: " );
    }
    @DataProvider(name = "marriage")
    public static Object[][] marriage() {
        return new Object[][]{
                {"Andrea", "Alex"},
                {"Larson", "Smith"}
        };
    }
    @Test(dataProvider = "marriage")
    public void testMarriage(String name1, String name2) {
        System.out.println("They finally got married: " + name1 +  " and "+ name2);
    }
    @DataProvider(name = "retirement")
    public static Object[][] retirement() {
        return new Object[][]{
                {65, 40},
                {40, 65},
                {65,20}
        };
    }
    @Test(dataProvider = "retirement")
    public void testRetirement(int age1, int age2) {
        Assert.assertEquals(age1, man.getAge(), "Something wrong with man's age");
        Assert.assertEquals(age2, woman.getAge(), "Something wrong with woman's age");
    }
    @DataProvider(name = "getmanprofession")
    public static Object[][] getmanprofession() {
        return new Object[][]{
                {"carpenter", true},
                {"doctor", false},
                {"teacher", false}
        };
    }
    @Test(dataProvider = "getmanprofession")
    public void getmanprofession(String profession, boolean answer) {
        Assert.assertEquals(profession, man.getProfession(), "This is not man's profession");
    }
}
