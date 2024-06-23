package com.example.managementsystem.contract.service;

import com.example.managementsystem.contract.entity.Contract;
import com.example.managementsystem.contract.repository.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ContractService
{
    @Autowired
    private ContractRepository contractRepository;
    public ContractService(ContractRepository contractRepository) {
        this.contractRepository = contractRepository;
    }


    public boolean writeContract(Contract contract){
        contractRepository.save(contract);
        return true;
    }
    public Contract inquiryContract(int id) {
        return contractRepository.findById(id).orElse(null);
    }
    public boolean findContract_number(int id) {
        return(contractRepository.existsById(id));
    }

}
