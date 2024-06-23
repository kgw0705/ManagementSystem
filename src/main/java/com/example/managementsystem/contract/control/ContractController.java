package com.example.managementsystem.contract.control;

import com.example.managementsystem.contract.entity.Contract;
import com.example.managementsystem.contract.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;


@RestController
public class ContractController
{
    @Autowired
    private ContractService contractService;

    @Autowired
    public ContractController(ContractService contractService) {
        this.contractService = contractService;
    }


    @PostMapping("/writeContract")
    public boolean writeContract(@RequestBody Contract contract) {
        Date startDate = contract.getContract_start_date();
        Date endDate = contract.getContract_end_date();

        if (endDate.before(startDate)) {
            return false;
        }
        else {
            return contractService.writeContract(contract);
        }
    }

    @GetMapping("/inquiryContract")
    public Contract inquiryContract(int contract_number) {
        return contractService.inquiryContract(contract_number);
    }

    @GetMapping("/findContract_number")
    public boolean findContract_number(int contract_number) {
        return contractService.findContract_number(contract_number);
    }
}

