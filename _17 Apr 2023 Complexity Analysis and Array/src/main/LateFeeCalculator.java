package main;

public class LateFeeCalculator {

    /*

     *     Logic to calculate the late fees

     */

    public double calculateTotalFee(LateFeeCalculatable items[], int days) {

        double totalLateFee = 0;

        for (LateFeeCalculatable item : items) {

            totalLateFee += item.calculateLateFee(days);
        }

        return totalLateFee;
    }


}
