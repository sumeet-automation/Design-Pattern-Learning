package com.basicstrong.designpatterns.behavioural.chainofresponsibility;

public class Director extends LoanApproval {

    public Director() {
        super(new VP());
    }

    @Override
    public void approveLoan(Loan loan) {
        if (loan.amount() < 15_00_000) {
            System.out.println("Loan approved by Director");
        } else
            nextLoanApproval.approveLoan(loan);
    }
}
