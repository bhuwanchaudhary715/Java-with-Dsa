package main;

public interface LateFeeCalculatable {

    double calculateLateFee(int days);            //   <-- This Lines makes interface segregation

}
