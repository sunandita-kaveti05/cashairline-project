import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class RewardValueTests  {

    @Test
    void create_with_cash_value() {
        

        double cashValue = 100.0;
        RewardValue rewardValue = new RewardValue(cashValue);
        int expectedMiles = (int) (cashValue / 0.0035);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
    

        int milesValue = 10000;
        RewardValue rewardValue = new RewardValue(milesValue);
        double expectedCash = milesValue * 0.0035;
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
       assert false;

        double cashValue = 100;
        int expectedMilesValue = (int) (cashValue / 0.0035);
        RewardValue rewardValue = new RewardValue(cashValue);
        assertEquals(expectedMilesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
       assert false;

        int milesValue = 10000;
        double expectedCashValue = milesValue * 0.0035;
        RewardValue rewardValue = new RewardValue(milesValue);
        assertEquals(expectedCashValue, rewardValue.getCashValue());
    }
}
