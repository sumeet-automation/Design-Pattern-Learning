package com.basicstrong.designpatterns.behavioural.chainofresponsibility;

public class VP extends LoanApproval {

    public VP() {
        super(null);

    }

    @Override
    public void approveLoan(Loan loan) {
        System.out.println("Loan approved by VP");
    }
}
