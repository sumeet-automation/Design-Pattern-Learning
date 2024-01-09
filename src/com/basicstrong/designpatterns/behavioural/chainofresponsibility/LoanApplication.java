package com.basicstrong.designpatterns.behavioural.chainofresponsibility;

public class LoanApplication {

    private Loan loan;
    private LoanApproval intialLoanApproval;

    public LoanApplication(Loan loan) {
        this.loan = loan;
        intialLoanApproval = new Manager();
    }

    public void processLoan() {
        intialLoanApproval.approveLoan(loan);
    }
}
