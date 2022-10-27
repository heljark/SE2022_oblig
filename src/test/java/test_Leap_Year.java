import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class test_Leap_Year {

    @Test
    @DisplayName("is divisible by 400")
    public void test_Leap_Year_Divisible_By_400(){
        assertTrue(leapYear.isLeapYear(2000));
    }


    @Test
    @DisplayName("is divisible By 4 But Not 100")
    public void test_Leap_Year_divisible_By_four_But_not_Hundred(){
        assertTrue(leapYear.isLeapYear(1904));
    }

    @Test
    @DisplayName("not divisible by 4")
    public void test_Not_Leap_Year_Not_Divisible_By_Four(){
        assertFalse(leapYear.isLeapYear(1800));
    }

    @Test
    @DisplayName("divisible by 100 and not 400")
    public void test_Not_Leap_Year_Divisible_by_Hundred_But_Not_By_400(){
        assertFalse(leapYear.isLeapYear(1900));
    }
}
