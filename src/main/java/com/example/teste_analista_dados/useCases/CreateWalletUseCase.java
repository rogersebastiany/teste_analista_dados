package com.example.teste_analista_dados.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.teste_analista_dados.modules.wallets.WalletEntity;
import com.example.teste_analista_dados.modules.wallets.WalletRepository;

@Service
public class CreateWalletUseCase {

    @Autowired
    private WalletRepository walletRepository;

    public WalletEntity execute(WalletEntity walletEntity) {
        this.walletRepository.save(walletEntity);

        return walletEntity;
    }

}
