import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {


    @Test
    public void testGetLocalNumber(){

        int a = getLocalNumber();

        if (a == 14){
            System.out.println("True, getLocalNumber() returns 14" );

        }else {
            Assert.fail("False, getLocalNumber() returns: " + a);
        }
    }
}

