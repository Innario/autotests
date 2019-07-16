import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {


    @Test
    public void testGetLocalNumber() {
        int localNumber = getLocalNumber();

        if (localNumber == 14) {
            System.out.println("OK, local number is valid");
        } else {
            Assert.fail("Invalid local number 14!=" + localNumber);
        }
    }

    @Test
    public void testGetClassNumber() {
        int classNumber = getClassNumber();

        if (classNumber > 45) {
            System.out.println("OK, class number " + classNumber + " is more than 45");
        } else {
            Assert.fail("Class number should be more than 45, got " + classNumber);
        }
    }
}

