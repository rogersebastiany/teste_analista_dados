package com.example.teste_analista_dados.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.teste_analista_dados.modules.transactions.TransactionEntity;
import com.example.teste_analista_dados.useCases.CreateTransactionUseCase;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

    @Autowired
    private CreateTransactionUseCase createTransactionUseCase;

    @PostMapping("/")
    public TransactionEntity create(@RequestBody TransactionEntity transactionEntity) {
        return this.createTransactionUseCase.execute(transactionEntity);
    }
}
