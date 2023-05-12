import java.util.Scanner;

public class RewardValue {
    private double cashValue;
    private int milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
      this.milesValue = milesValue;
    }
    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }

    public double convertMilesToCash() {
        RewardValue rewardValue = new RewardValue(milesValue);
        int miles = rewardValue.getMilesValue();
        return miles * 0.0035;
    }

    public int convertCashToMiles() {
        RewardValue rewardValue = new RewardValue(cashValue);
        double cash = rewardValue.getCashValue();
        return (int) (cash / 0.0035);
    }

}
