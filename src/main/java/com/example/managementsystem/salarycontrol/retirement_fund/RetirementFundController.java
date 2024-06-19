package com.example.managementsystem.salarycontrol.retirement_fund;

public class RetirementFundController
{
    private RetirementFundService retirementFundService;
    
    public RetirementFundController(RetirementFundService retirementFundService) {
        this.retirementFundService = retirementFundService;
    }
    
    public void processCalculation(int employeeId)
    {
        /*double taxRate = 0.15; // 세율을 15%로 가정
        double retirementFund = retirementFundService.calculateRetirementFund(employeeId, taxRate);
        System.out.println("퇴직금: " + retirementFund);*/
    }
    
    public void finalizeRetirementFund()
    {
        // TODO: Implement the logic for finalizing the retirement fund
    }
    
    public void createRetirementFund()
    {
        // TODO: Implement the logic for creating a new retirement fund
    }
}
