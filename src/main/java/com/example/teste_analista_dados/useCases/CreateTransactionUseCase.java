package com.example.teste_analista_dados.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.teste_analista_dados.modules.transactions.TransactionEntity;
import com.example.teste_analista_dados.modules.transactions.TransactionRepository;

@Service
public class CreateTransactionUseCase {

    @Autowired
    private TransactionRepository transactionRepository;

    public TransactionEntity execute(TransactionEntity transactionEntity) {
        this.transactionRepository.save(transactionEntity);
        return transactionEntity;
    }
}
