package com.basicstrong.designpatterns.behavioural.chainofresponsibility;

public class Manager extends LoanApproval{

    public Manager() {
        super(new Director());
    }
    @Override
    public void approveLoan(Loan loan) {
        if (loan.amount() < 5_00_000) {
            System.out.println("Loan approved by manager");
        } else {
            nextLoanApproval.approveLoan(loan);
        }
    }
}
