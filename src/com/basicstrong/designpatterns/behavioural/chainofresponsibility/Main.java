package com.basicstrong.designpatterns.behavioural.chainofresponsibility;

public class Main {

    public static void main(String[] args) {
        new LoanApplication(new Loan(1_00_000)).processLoan();
        new LoanApplication(new Loan(14_00_000)).processLoan();
        new LoanApplication(new Loan(2_050_00_000)).processLoan();
    }
}
