package org.example.ex26;

public class PaymentCalculator {
    final double i;
    final double b;
    final double p;

    public PaymentCalculator(double i, double b, double p) {
        this.i = i;
        this.b = b;
        this.p = p;
    }

    public double calculateMonthsUntilPaidOff() {
        double n;

        n = -(1.0/30.0) * Math.log(1 + b / p * (1 - Math.pow((1 + i), 30))) / Math.log(1 + i);

        n = Math.ceil(n);

        System.out.println("It will take you " + String.format("%.0f", n) + " months to pay off this card.");

        return n;
    }
}
