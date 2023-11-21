package com.example.teste_analista_dados.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.teste_analista_dados.modules.wallets.WalletEntity;
import com.example.teste_analista_dados.useCases.CreateWalletUseCase;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/wallet")
public class WalletController {

    @Autowired
    private CreateWalletUseCase createWalletUseCase;

    @PostMapping("/")
    public WalletEntity create(@Valid @RequestBody WalletEntity walletEntity) {
        return this.createWalletUseCase.execute(walletEntity);
    }
}
