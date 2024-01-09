package com.basicstrong.designpatterns.behavioural.chainofresponsibility;

public abstract class LoanApproval {
    protected LoanApproval nextLoanApproval;

    public LoanApproval(LoanApproval nextLoanApproval) {
        this.nextLoanApproval = nextLoanApproval;
    }

    public abstract void approveLoan(Loan loan);
}
